package com.pavlova.homeworks.lecture15;




import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataProviderTest {

    @Test
    void provide() {
        assertNotNull(new DataProvider().provide("ggggg"));

    }

}