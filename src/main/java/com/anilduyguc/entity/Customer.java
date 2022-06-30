package com.anilduyguc.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
    private String firstName;
    @NotNull(message ="is required") // default error message when error occurs
    @Size(min = 1, message = "is required") // default error message when error occurs
    private String lastName;

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
