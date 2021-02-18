package com.prototype;

import java.time.Duration;
import java.time.Instant;

public class NotebookPrototype extends CustomPrototype {
    private String uniqueID;
    private String color;
    private Binding binding;

    //normal constructor with expensive call (API, database, complex computation etc)
    public NotebookPrototype(String uniqueID, String color, Binding binding) {
        //sleep for 5 seconds
        try {
            System.out.println("Creating expensive notebook prototype normally................");
            Instant start = Instant.now();
            Thread.sleep(5000);
            this.binding = binding;
            this.uniqueID = uniqueID;
            this.color = color;
            Instant stop = Instant.now();
            System.out.print("Done. Time taken: ");
            System.out.println(Duration.between(start, stop).toMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //copy constructor
    public NotebookPrototype(NotebookPrototype existingNotebook) {
        System.out.println("Cloning expensive notebook................");
        Instant start = Instant.now();
        this.binding = existingNotebook.binding;
        this.uniqueID = existingNotebook.uniqueID;
        this.color = existingNotebook.color;
        Instant stop = Instant.now();
        System.out.print("Done. Time taken: ");
        System.out.println(Duration.between(start, stop).toMillis());
    }

    @Override
    public String toString() {
        return "NotebookPrototype{" +
                "uniqueID='" + uniqueID + '\'' +
                ", color='" + color + '\'' +
                ", binding=" + binding +
                '}';
    }

    @Override
    public CustomPrototype createClone() {
        return new NotebookPrototype(this);
    }
}
