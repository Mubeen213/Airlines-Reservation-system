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

        Person[] people = new Person[]{
                new Person("Cleopatra", "Egypt", "69 BC", 1),
                new Person("Alexander the Great", "Macedon", "356 BC", 2),
                new Person("Julius Caesar", "Rome", "100 BC", 3),
                new Person("Hannibal", "Carthage", "247 BC", 4),
                new Person("Confucius", "China", "551 BC", 5),
                new Person("Pericles", "Greece", "429 BC", 6),
                new Person("Spartacus", "Thrace", "111 BC", 7),
                new Person("Marcus Aurelius", "Rome", "121 AD", 8),
                new Person("Leonidas", "Greece", "540 BC", 9),
                new Person("Sun Tzu", "China", "544 BC", 10),
                new Person("Hammurabi", "Babylon", "1750 BC", 11),
        };

        Airline airlines = new Airline();

        for (int index = 0; index < people.length; index++) {

            if(people[index].applyPassport() == true){
                people[index].setPassport();
                airlines.createReservation(people[index]);
            }
        }
        System.out.println(airlines);
    }
}
