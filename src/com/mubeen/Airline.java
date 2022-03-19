package com.mubeen;

public class Airline {

    Person[] seats;

    public Airline(){
        this.seats = new Person[11];
    }

    public void setPerson(Person person){
        this.seats[person.getSeatNumber()-1] = new Person(person);
    }

    public Person getPerson(int index){
        return new Person(this.seats[index]);
    }

    public void createReservation(Person person){
        while(seats[person.getSeatNumber()-1] != null){
            System.out.println("\n" + person.getName() + ", seat: "
                    + person.getSeatNumber()
                    + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
        }

        int index = person.getSeatNumber()-1;
        seats[index] = new Person(person);
        System.out.println("Thank you " + person.getName()
                + " for flying with java airlines. Your seat number is "
                + person.getSeatNumber());
    }

}
