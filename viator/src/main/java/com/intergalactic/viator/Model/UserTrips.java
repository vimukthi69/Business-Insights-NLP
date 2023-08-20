package com.intergalactic.viator.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class UserTrips implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tripId;
    private String homePlanet;
    private String visitingPlanet;
    private String status;
    private LocalDate departureDate;
    private float price;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "travelDetailId")
    private UserTravelDetails userTravelDetails;

    public UserTrips() {
    }

    public UserTrips(Integer tripId, String homePlanet, String visitingPlanet, String status, LocalDate departureDate, float price, UserTravelDetails userTravelDetails) {
        this.tripId = tripId;
        this.homePlanet = homePlanet;
        this.visitingPlanet = visitingPlanet;
        this.status = status;
        this.departureDate = departureDate;
        this.price = price;
        this.userTravelDetails = userTravelDetails;
    }

    public UserTrips(String homePlanet, String visitingPlanet, String status, LocalDate departureDate, float price, UserTravelDetails userTravelDetails) {
        this.homePlanet = homePlanet;
        this.visitingPlanet = visitingPlanet;
        this.status = status;
        this.departureDate = departureDate;
        this.price = price;
        this.userTravelDetails = userTravelDetails;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    public String getVisitingPlanet() {
        return visitingPlanet;
    }

    public void setVisitingPlanet(String visitingPlanet) {
        this.visitingPlanet = visitingPlanet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public UserTravelDetails getUserTravelDetails() {
        return userTravelDetails;
    }

    public void setUserTravelDetails(UserTravelDetails userTravelDetails) {
        this.userTravelDetails = userTravelDetails;
    }

    @Override
    public String toString() {
        return "UserTrips{" +
                "tripId=" + tripId +
                ", homePlanet='" + homePlanet + '\'' +
                ", visitingPlanet='" + visitingPlanet + '\'' +
                ", status='" + status + '\'' +
                ", departureDate=" + departureDate +
                ", price=" + price +
                ", userTravelDetails=" + userTravelDetails +
                '}';
    }
}
