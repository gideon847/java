/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author MANAGER
 */
public class MyArrayList {
    
    public static void main(String[] args){
    List<String> names = new ArrayList<>();//
    names.add("Gideon");
    names.add("John");
    names.add("Francis");
    names.get(0);// this prints Gideon,the first element of names; names[0] will give us Erroneous tree type error  
    names.size(); // gives ths size of ArrayList 
    names.remove(0); // removes Gideon // outputs John, Francis 
    names.set(1,"Hopkins"); // modify element at position 1
    
    //iterating through arraylist 
    //OPTION 1
    for(int x =0; x<names.size();x++){
      System.out.println(names.get(x)); // prints all elements  
    }
      //iterating through arraylist 
    //OPTION 2 - enhanced loop
    
    for(String name: names){
    System.out.println(name);
    }
    //iterating through arraylist 
    //OPTION 3 - Iterator() which is in built
    Iterator<String> itr = names.iterator();
    
    while(itr.hasNext()){
    String prt = itr.next();
    System.out.println(prt);
    }
    
    } 
}
