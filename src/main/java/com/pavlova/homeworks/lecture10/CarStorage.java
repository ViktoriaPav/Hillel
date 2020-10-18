package com.pavlova.homeworks.lecture10;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
public class CarStorage {
    private Transport[] soldCars = new Transport[1000];

    private int getLastEmptyIndex() {
        for (int i = 0; i < 1000; i++) {
            if (soldCars[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public Transport[] addToStorageOfSoldCars(Transport car) {
        int lastIndex = getLastEmptyIndex();
        if (lastIndex != -1) {
            soldCars[lastIndex] = car;
        } else {
            System.out.println("Error: count sold cars more then 1000 - This Car can`t add to this List");
        }
        return soldCars;
    }

    private String listOfCars() {
        StringBuilder st = new StringBuilder();
        st.append("CarStorage soldCars= \n");
        for (Transport transport : soldCars) {
            if (transport != null) {
                st.append(transport.toString());
            }
        }
        st.append("}");
        return st.toString();
    }

    public void printListOfSoldCars(){
        System.out.println(listOfCars());
    }
}
