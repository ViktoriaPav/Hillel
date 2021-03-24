package com.pavlova.homeworks.logger;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class User {
    private static final Logger logger = LoggerFactory.getLogger(User.class);
    String name;
    String lastName;
    Address address;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    public void settAddress(String street, int house) {
        this.address = new Address(street, house);
        logger.debug("Test {}", address);
    }
}
