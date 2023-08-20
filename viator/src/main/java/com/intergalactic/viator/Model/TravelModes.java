package com.intergalactic.viator.Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class TravelModes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer modeId;
    private String modeName;
    private String modeImage;
    private Float price;
    private LocalDate destinationDates;

    public TravelModes() {
    }

    public TravelModes(Integer modeId, String modeName, String modeImage, Float price, LocalDate destinationDates) {
        this.modeId = modeId;
        this.modeName = modeName;
        this.modeImage = modeImage;
        this.price = price;
        this.destinationDates = destinationDates;
    }

    public TravelModes(String modeName, String modeImage, Float price, LocalDate destinationDates) {
        this.modeName = modeName;
        this.modeImage = modeImage;
        this.price = price;
        this.destinationDates = destinationDates;
    }

    public Integer getModeId() {
        return modeId;
    }

    public void setModeId(Integer modeId) {
        this.modeId = modeId;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public String getModeImage() {
        return modeImage;
    }

    public void setModeImage(String modeImage) {
        this.modeImage = modeImage;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public LocalDate getDestinationDates() {
        return destinationDates;
    }

    public void setDestinationDates(LocalDate destinationDates) {
        this.destinationDates = destinationDates;
    }

    @Override
    public String toString() {
        return "TravelModes{" +
                "modeId=" + modeId +
                ", modeName='" + modeName + '\'' +
                ", modeImage='" + modeImage + '\'' +
                ", price=" + price +
                ", destinationDates=" + destinationDates +
                '}';
    }
}
