package com.intergalactic.viator.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Planets implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer planetId;
    private String planetName;
    private String discription;
    private String planetImage;

    @JsonManagedReference
    @OneToMany(mappedBy = "planets", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PlanetDestinations> planetDestinations;

    public Planets() {
    }

    public Planets(Integer planetId, String planetName, String discription, String planetImage, List<PlanetDestinations> planetDestinations) {
        this.planetId = planetId;
        this.planetName = planetName;
        this.discription = discription;
        this.planetImage = planetImage;
        this.planetDestinations = planetDestinations;
    }

    public Planets(String planetName, String discription, String planetImage, List<PlanetDestinations> planetDestinations) {
        this.planetName = planetName;
        this.discription = discription;
        this.planetImage = planetImage;
        this.planetDestinations = planetDestinations;
    }

    public Integer getPlanetId() {
        return planetId;
    }

    public void setPlanetId(Integer planetId) {
        this.planetId = planetId;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public String getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(String planetImage) {
        this.planetImage = planetImage;
    }

    public List<PlanetDestinations> getPlanetDestinations() {
        return planetDestinations;
    }

    public void setPlanetDestinations(List<PlanetDestinations> planetDestinations) {
        this.planetDestinations = planetDestinations;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "planetId=" + planetId +
                ", planetName='" + planetName + '\'' +
                ", discription='" + discription + '\'' +
                ", planetImage='" + planetImage + '\'' +
                ", planetDestinations=" + planetDestinations +
                '}';
    }
}
