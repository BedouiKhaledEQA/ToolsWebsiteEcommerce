package com.ToolsWebsiteEcommerce.Pages;

import com.ToolsWebsiteEcommerce.Base;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.PageFactory;

public class userPage extends Base {
    public userPage(){
        PageFactory.initElements(driver,this);

       Faker faker =new Faker();
        firstName=faker.name().firstName();
        lastName=faker.name().lastName();
        calender=faker.date().birthday().toString();
        Address=faker.address().fullAddress();
        Postcode=faker.address().zipCode();
        City=faker.address().city();
        Country=faker.address().country();
        Phone=faker.phoneNumber().phoneNumber();
        email=faker.internet().emailAddress();
        Password=faker.internet().password();

    }
    private String firstName;
    private String lastName;
    private String calender;
    private String Address;
    private String Postcode;
    private String City;
    private String Country;
    private String State;
    private String Phone;
    private String email;
    private String Password;


    public userPage(String firstName, String lastName, String calender, String address, String postcode, String city, String country, String state, String phone, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.calender = calender;
        Address = address;
        Postcode = postcode;
        City = city;
        Country = country;
        State = state;
        Phone = phone;
        this.email = email;
        Password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCalender() {
        return calender;
    }

    public void setCalender(String calender) {
        this.calender = calender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String postcode) {
        Postcode = postcode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
