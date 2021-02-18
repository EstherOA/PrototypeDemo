package com.prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NotebookPrototypeTest {
    NotebookPrototype existingNote;

    @Before
    public void setUp() throws Exception {
        //creating normal NotebookPrototype
        this.existingNote = new NotebookPrototype("UniqueNoteID", "Blue", Binding.Hardcover);
    }

    @Test
    public void createClone() {
        //creating clone NotebookPrototype
        CustomPrototype notebookClone = this.existingNote.createClone();
        NotebookPrototype newNote = (NotebookPrototype) this.existingNote.createClone();
        System.out.println("Inspecting existing object:\t" + this.existingNote.toString());
        System.out.println("Inspecting clone object:\t" + notebookClone.toString());
        assertEquals(this.existingNote.toString(), newNote.toString());
        assertEquals(notebookClone.toString(), newNote.toString());
        //check that both strings are equal
    }


}