package com.intergalactic.viator.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
public class UserTravelDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer travelDetailId;
    private Integer gCode;
    @JsonManagedReference
    @OneToMany(mappedBy = "userTravelDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserTrips> userTrips;

    public UserTravelDetails() {
    }

    public UserTravelDetails(Integer travelDetailId, Integer gCode, List<UserTrips> userTrips) {
        this.travelDetailId = travelDetailId;
        this.gCode = gCode;
        this.userTrips = userTrips;
    }

    public UserTravelDetails(Integer gCode, List<UserTrips> userTrips) {
        this.gCode = gCode;
        this.userTrips = userTrips;
    }

    public Integer getTravelDetailId() {
        return travelDetailId;
    }

    public void setTravelDetailId(Integer travelDetailId) {
        this.travelDetailId = travelDetailId;
    }

    public Integer getgCode() {
        return gCode;
    }

    public void setgCode(Integer gCode) {
        this.gCode = gCode;
    }

    public List<UserTrips> getUserTrips() {
        return userTrips;
    }

    public void setUserTrips(List<UserTrips> userTrips) {
        this.userTrips = userTrips;
    }

    @Override
    public String toString() {
        return "UserTravelDetails{" +
                "travelDetailId=" + travelDetailId +
                ", gCode=" + gCode +
                ", userTrips=" + userTrips +
                '}';
    }
}
