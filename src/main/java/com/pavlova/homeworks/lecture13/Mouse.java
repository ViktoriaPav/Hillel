package com.pavlova.homeworks.lecture13;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mouse implements Comparable {
    private String name;
    private int calories;

    @Override
    public int compareTo(Object o) {
        Mouse entry = (Mouse) o;

        int result = getCalories() - entry.getCalories();
        if (result != 0) {
            return result / Math.abs(result);
        } else {
            result = getName().compareTo(entry.getName());
        }
        return result;
    }
}
