package com.prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExerciseBookPrototypeTest {
    ExerciseBookPrototype existingExercise;

    @Before
    public void setUp() throws Exception {
        //create new exercise book normally
        existingExercise = new ExerciseBookPrototype("UniqueExerciseID", "Green", Binding.Softcover, "Anna", "Karenina");
    }


    @Test
    public void createClone() {
        //create new exercise book clone
        CustomPrototype exerciseClone = existingExercise.createClone();
        ExerciseBookPrototype newExercise = (ExerciseBookPrototype) existingExercise.createClone();
        System.out.println("Inspecting existing object:\t" + this.existingExercise.toString());
        System.out.println("Inspecting clone object:\t" + exerciseClone.toString());
        assertEquals(this.existingExercise.toString(), exerciseClone.toString());
        assertEquals(exerciseClone.toString(), newExercise.toString());
    }
}