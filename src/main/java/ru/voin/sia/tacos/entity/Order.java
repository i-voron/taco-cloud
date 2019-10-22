package ru.voin.sia.tacos.entity;

import org.hibernate.validator.constraints.CreditCardNumber;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Orders", schema = "test")
public class Order  extends BaseEntity{
    @OneToMany(targetEntity=Taco.class)
    private List<Taco> tacos = new ArrayList<>();

    private Date placedAt;
    @NotBlank(message="Name is required")
    @Column(length = 50)
    private String name;
    @NotBlank(message="Street is required")
    @Column(length = 50)
    private String street;
    @NotBlank(message="City is required")
    @Column(length = 50)
    private String city;
    @NotBlank(message="State is required")
    @Column(length = 2)
    private String state;
    @NotBlank(message="Zip code is required")
    @Column(length = 10)
    private String zip;
    @CreditCardNumber(message="Not a valid credit card number. Must be 7 digits")
    @Column(length = 16)
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message="Must be formatted MM/YY")
    @Column(length = 5)
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    @Column(length = 3)
    private String ccCVV;

    @PrePersist
    void placedAt() {
        this.placedAt = new Date();
    }

    public void addDesign(Taco design) {
        this.tacos.add(design);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCcExpiration() {
        return ccExpiration;
    }

    public void setCcExpiration(String ccExpiration) {
        this.ccExpiration = ccExpiration;
    }

    public String getCcCVV() {
        return ccCVV;
    }

    public void setCcCVV(String ccCVV) {
        this.ccCVV = ccCVV;
    }

    public Date getPlacedAt() {
        return placedAt;
    }

    public void setPlacedAt(Date placedAt) {
        this.placedAt = placedAt;
    }

    public List<Taco> getTacos() {
        return tacos;
    }

    public void setTacos(List<Taco> tacos) {
        this.tacos = tacos;
    }

}
