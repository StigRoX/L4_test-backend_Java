package com.geekbrains.builder;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Main {
    public static void main(String[] args) {

        User user = User.builder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setAddress("Address")
                .setEmail("123@ya.ru")
                .build();

        // DSL - domain specific language

        RequestSpecification requestSpecification =
                new RequestSpecBuilder()
                        .build();

    }
}