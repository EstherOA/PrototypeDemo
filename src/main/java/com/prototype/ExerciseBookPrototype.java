package com.prototype;

public class ExerciseBookPrototype extends CustomPrototype{
    private String uniqueID;
    private String color;
    private Binding binding;
    private Owner confidentialOwner;

    //normal constructor with private member
    public ExerciseBookPrototype(String uniqueID, String color, Binding binding, String firstName, String lastName) {
        Owner bookOwner = new Owner(firstName, lastName);
        this.confidentialOwner = bookOwner;
        this.color = color;
        this.uniqueID = uniqueID;
        this.binding = binding;
    }

    //copy constructor with reference to private member
    public ExerciseBookPrototype(ExerciseBookPrototype existingBook) {
        this.confidentialOwner = existingBook.confidentialOwner;
        this.binding = existingBook.binding;
        this.uniqueID = existingBook.uniqueID;
        this.color = existingBook.color;
    }

    @Override
    public CustomPrototype createClone() {
        return new ExerciseBookPrototype(this);
    }

    @Override
    public String toString() {
        return "ExerciseBookPrototype{" +
                "uniqueID='" + uniqueID + '\'' +
                ", color='" + color + '\'' +
                ", binding=" + binding +
                confidentialOwner.toString()
                +
                '}';
    }

    private class Owner {
        private String firstName;
        private String lastName;

        private Owner(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "Owner{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

    }
}

enum Binding {
    Softcover, Hardcover
}