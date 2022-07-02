package com.anilduyguc.entity;

import javax.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message ="is required") // default error message when error occurs
    @Size(min = 1, message = "is required") // default error message when error occurs
    private String lastName;

    @Min(value = 0, message = "Must be greater than or equal to 0")
    @Max(value = 10, message = "Must be less than or equal to 10")
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 characters/digits")
    private String postalCode;

    @Pattern(regexp = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9-]+[.][a-z]+$", message = "invalid email")
    private String email;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
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
}