package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// count number of digits.
    int n = count(987);
        System.out.println(n);
    }
    public static int count(int num){
        return ((int)(Math.log(num)/Math.log(10))+1);
    }
}
/*
 */