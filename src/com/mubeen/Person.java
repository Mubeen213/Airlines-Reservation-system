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
        this.passport = Arrays.copyOf(person.passport,person.passport.length);
    }

    /********   Setters  ***********/
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassport(){
        this.passport = new String[]{this.name,this.nationality,this.dateOfBirth};
    }


    /********   Getters  ***********/

    public String getName() {
        return this.name;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public String getNationality(){
        return this.nationality;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String[] getPassport() {
        return Arrays.copyOf(this.passport,this.passport.length);
    }

    /************** Functionalities ********************/

    public void chooseSeat(){
        this.seatNumber = (int) (Math.random()*11 +1);
    }

    public boolean applyPassport(){

        int choice = (int)(Math.random()*2);
        if(choice==0){
            return false;
        }
        else{
            return true;
        }
    }

    public  String toString(){
        return "Name: " + this.name + ".\n"
                + "Nationality: " + this.nationality + ".\n"
                + "Date of Birth: " + this.dateOfBirth + ".\n"
                + "Seat Number: " + this.seatNumber + ".\n"
                + "Passport: " + Arrays.toString(this.passport) + "\n";
    }

}
