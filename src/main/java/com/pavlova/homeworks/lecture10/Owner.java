package com.pavlova.homeworks.lecture10;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Owner {
    private String name;
    private String surname;
    private String patronymic;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                "}, ";
    }
}
