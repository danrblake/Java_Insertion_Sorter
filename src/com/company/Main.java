package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] exampleArray = {19,7,32,4,26};
        InsertionSorter insertion = new InsertionSorter();
        System.out.println(Arrays.toString(insertion.sorter(exampleArray)));
    }
}
