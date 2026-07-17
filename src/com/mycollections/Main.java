/**
 *  Java program to do operations on Hashtable.
 */

package com.mycollections;

import java.util.Hashtable;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of Hashtable.
        Hashtable<Integer, String> myTable = new Hashtable<>();

        // Add.
        myTable.put(1, "Monday");
        myTable.put(2, "Tuesday");
        myTable.put(3, "Wednesday");
        myTable.put(4, "Thursday");
        myTable.put(5, "Friday");
        myTable.put(6, "Saturday");
        myTable.put(7, "Sunday");

        // Display.
        System.out.println(myTable); // Output: {7=Sunday, 6=Saturday, 5=Friday, 4=Thursday, 3=Wednesday,
                                     // 2=Tuesday, 1=Monday}

        // Add.
        myTable.put(8, "Monday");

        // Display.
        System.out.println(myTable); // Output: {8=Monday, 7=Sunday, 6=Saturday, 5=Friday, 4=Thursday,
                                     // 3=Wednesday, 2=Tuesday, 1=Monday}

        // Remove.
        myTable.remove(1);

        // Display.
        System.out.println(myTable); // Output: {8=Monday, 7=Sunday, 6=Saturday, 5=Friday, 4=Thursday, 3=Wednesday,
                                     // 2=Tuesday}

    }
}
