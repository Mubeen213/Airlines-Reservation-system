package com.mubeen;

import java.util.Arrays;

public class Person {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private int seatNumber;
    private String [] passport;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber){
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person person){
        this.name = person.name;
        this.nationality = person.nationality;
        this.dateOfBirth = person.dateOfBirth;
        this.seatNumber = person.seatNumber;
    }

    public  String toString(){
        return "Name: " + this.name + ".\n"
                + "Nationality: " + this.nationality + ".\n"
                + "Date of Birth: " + this.dateOfBirth + ".\n"
                + "Seat Number: " + this.seatNumber + ".\n"
                + "Passport: " + Arrays.toString(this.passport) + "\n";
    }

}
