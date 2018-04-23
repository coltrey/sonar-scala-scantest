package com.coltrey.javacore;

import static org.junit.Assert.*;

import com.coltrey.javacore.JavaObject;

public class JavaObjectTest {
    private JavaObject stringObject, longObject, intObject;


    @org.junit.Before
    public void setUp() throws Exception {
        this.stringObject = new JavaObject("foo");
        this.longObject = new JavaObject(1L);
        this.intObject = new JavaObject(1);
    }

    @org.junit.Test
    public void isLong() throws Exception {

        assertTrue(longObject.isLong());
        //int object is cast to Long internally
        assertTrue(intObject.isLong());

        assertFalse(stringObject.isLong());
    }

    @org.junit.Test
    public void getLongData() throws Exception {
        assertEquals(longObject.getLongData(), Long.valueOf(1L));
        assertEquals(intObject.getLongData(), Long.valueOf(1L));
        assertNull(stringObject.getLongData());
    }

    @org.junit.Test
    public void getStringData() throws Exception {
        assertEquals("foo", stringObject.getStringData());
        assertNull(longObject.getStringData());
        assertNull(intObject.getStringData());
    }

}