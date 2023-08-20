package com.intergalactic.viator.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class PlanetDestinations implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer destinationId;
    private String destinationName;
    private String description;
    private String climate;
    private  String destinationImage;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "planetId")
    private Planets planets;

    public PlanetDestinations() {
    }

    public PlanetDestinations(Integer destinationId, String destinationName, String description, String climate, String destinationImage, Planets planets) {
        this.destinationId = destinationId;
        this.destinationName = destinationName;
        this.description = description;
        this.climate = climate;
        this.destinationImage = destinationImage;
        this.planets = planets;
    }

    public PlanetDestinations(String destinationName, String description, String climate, String destinationImage, Planets planets) {
        this.destinationName = destinationName;
        this.description = description;
        this.climate = climate;
        this.destinationImage = destinationImage;
        this.planets = planets;
    }

    public Integer getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Integer destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getDestinationImage() {
        return destinationImage;
    }

    public void setDestinationImage(String destinationImage) {
        this.destinationImage = destinationImage;
    }

    public Planets getPlanets() {
        return planets;
    }

    public void setPlanets(Planets planets) {
        this.planets = planets;
    }

    @Override
    public String toString() {
        return "PlanetDestinations{" +
                "destinationId=" + destinationId +
                ", destinationName='" + destinationName + '\'' +
                ", description='" + description + '\'' +
                ", climate='" + climate + '\'' +
                ", destinationImage='" + destinationImage + '\'' +
                ", planets=" + planets +
                '}';
    }
}
