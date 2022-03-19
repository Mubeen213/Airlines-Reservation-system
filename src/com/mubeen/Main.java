package com.mubeen;

/*
 * The airline has enough seats for 11 people
 * Each person needs to apply for a passport, which bears the name,
 * nationality and date of birth.
 * Each person has a seat number. which they are free to choose.
 * The airline creates the reservation once it validates the person's
 * passport and requested seat.
 * The airline should not create a reservation if the requested seat
 * has already been taken.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person  = new Person("Mubeen","Indian","21092000",1);

        System.out.println(person);
    }
}
