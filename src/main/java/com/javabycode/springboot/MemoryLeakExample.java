package com.javabycode.springboot;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    // Static list to hold objects, causing memory leak
    private static List<Object> objectList = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            // Creating new objects and adding them to the static list
            objectList.add(new Object());
            // Simulating some processing
            if (i % 100 == 0) {
                System.out.println("Added " + i + " objects to the list.");
            }
        }
        // The list will keep growing, causing a memory leak
        System.out.println("Total objects in the list: " + objectList.size());
    }
}


