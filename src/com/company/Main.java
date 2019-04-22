package com.company;
import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter your word ");
		String testString = scan.nextLine();
		char[] stringToCharArray = testString.toCharArray();
		for(int i=testString.length()-1 ; i>=0 ; i--){

			System.out.print( stringToCharArray[i]);
			}

    }
}
