package com.pavlova.homeworks.logger;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static final Logger logger = LoggerFactory.getLogger(UserTest.class);


    @Test
    public void checkAddress() {
        String street = "Lick";
        int house = 3;
        User user1 = new User("Ivan", "Petrov");
        user1.settAddress(street, house);

        logger.info("Test {}", house);
        logger.debug(user1.address.toString());
        assertEquals(user1.address.street, street);
        assertEquals(user1.address.house, house);
    }

}