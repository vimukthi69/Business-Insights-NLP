package com.intergalactic.viator.Model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Users implements Serializable {
    @Id
    @Column(nullable = false, updatable = false)
    private Integer gCode;
    private String username;
    private String password;
    private String userImage;
    private String sector;
    private String homePlanet;

    public Users() {
    }

    public Users(Integer gCode, String username, String password, String userImage, String sector, String homePlanet) {
        this.gCode = gCode;
        this.username = username;
        this.password = password;
        this.userImage = userImage;
        this.sector = sector;
        this.homePlanet = homePlanet;
    }

    public Users(String username, String password, String userImage, String sector, String homePlanet) {
        this.username = username;
        this.password = password;
        this.userImage = userImage;
        this.sector = sector;
        this.homePlanet = homePlanet;
    }

    public Integer getgCode() {
        return gCode;
    }

    public void setgCode(Integer gCode) {
        this.gCode = gCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getHomePlanet() {
        return homePlanet;
    }

    public void setHomePlanet(String homePlanet) {
        this.homePlanet = homePlanet;
    }

    @Override
    public String toString() {
        return "Users{" +
                "gCode=" + gCode +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userImage='" + userImage + '\'' +
                ", sector='" + sector + '\'' +
                ", homePlanet='" + homePlanet + '\'' +
                '}';
    }
}
