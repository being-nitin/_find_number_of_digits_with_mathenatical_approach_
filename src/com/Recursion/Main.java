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
If the base is 10 it will count the digits with decimal approach.
If the base is 2 it will count the digits with binary approach.
If the base is 8 it will count the digits with octal approach.
If the base is 16 it will count the digits with Hexal approach.
 */