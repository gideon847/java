/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resource;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;





public class MyArray {
  
    public static void main(String[] args){
         String[] names = new String[]{"Gideon","Daniel","George"}; // creating array which is fixed in memory
         System.out.println(names[0]); // Gideon access value name[int position/index]
         System.out.println(names.length); // the size of array
         names[0] = "Joe"; // Element in position[0] modified so Gideon is Changed to Joe         
         
          System.out.println(names);// This will print memory address of the first element 
          
         // iterating its elements
         for(int i = 0; i<names.length;i++)
           System.out.println(names[i]);  // prints  // Joe, Daniel , George
         } 
    }

