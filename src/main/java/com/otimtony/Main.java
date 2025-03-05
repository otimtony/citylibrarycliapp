package com.otimtony;

import com.otimtony.Model.Publisher;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var welcomeMessage = "Welcome to City Library Cli APP";
        System.out.printf("%s\n", welcomeMessage);
        var publisher = List.of(
                new Publisher(1, "Penguin Publishing", "pengiun@gmail.com", "256703987423"),
                new Publisher(1, "Harvard", "harvard@gmail.com", "256703987423"),
                new Publisher(1, "Maharishi International University", "miu@gmail.com", "256703000000")
        );

        publisher.forEach(System.out::println);

    }
}