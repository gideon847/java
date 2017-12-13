/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author MANAGER
 */
public class ArrayToList {
    public static void main(String[] args){
    String[] names = new String[]{"Shirley","Diana","Ruth"};
    String[] surname = new String[]{"Asare","Partel","Rollins"};
    List<String>namesList =new ArrayList(Arrays.asList(names));
// names[] array is now converted to List
    System.out.println(namesList.get(0));
    //Iterate through 
 
    
   
    Collections.addAll(namesList,surname);
    Iterator<String>itr = namesList.iterator();
    while(itr.hasNext()){
        String w = itr.next();
       // System.out.println(w);
    }
    
  for(int i =0;i<namesList.size();i++){
   System.out.println(namesList.get(i));
   }
    /// we can't do that bcos names is array which is fixed in size 
    //namesList.add("Grate"); // outputs Unsupported Operations Exception
    System.out.println(namesList);
    }
    
}
