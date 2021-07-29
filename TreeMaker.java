package com.company;

import java.util.*;
import java.io.*;
import java.math.*;

public class Solution {

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int height = in.nextInt();
    int total = height*height;
    String output = "*";
    String newlol = "" ;
    String space = " ";
    String finalOutput ="";
    int z =0;
    ArrayList<Integer> treeHeight = new ArrayList<Integer>();
    ArrayList<String> branches = new ArrayList<String>();
    for (int p=1;p<total;p+=2){
      treeHeight.add(p);
    }
    for(int i=0;i<treeHeight.size()-1;i++){
      newlol = output.repeat(treeHeight.get(i));
      branches.add(newlol);
    }
    int b = height -1;
    for (z =0;z<height;z++){
          finalOutput += space.repeat(b) + branches.get(z) + space.repeat(b) +"\n";
          b--;
        }
    System.out.println(finalOutput  + space.repeat(height-1)+ "|" + space.repeat(height-1));
  }
}