package com.company;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String input = sc.nextLine();
           int p = input.length()-1;
           int middleIndex = (input.length()/2);
           int counter =0;

           for (int i=0; i<middleIndex;i++) {
                  if (input.charAt(i) == input.charAt(p)){
                    counter++;
                  }
                  p--;
           }
           if(counter == middleIndex){
             System.out.println("'"+input+"' is a palindrome!");
           }
           else{
             System.out.println("Not a palindrome");
           }
           // find number of characters in input
          // find the index halfway
          // check if elements at each end are the same
          // if they are then increment a palindrome checker. If checker == index halfway then its a palindrome

  }
}
