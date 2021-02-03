/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditingArrays;

import java.util.Arrays;

/**
 *
 * @author raynj
 */
public class EmptyAnArray 
{
    public static void nullifyStringArray()
    {
        String allSubjects[] = {"Math", "English"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects) + "\n");
        allSubjects = null;
        System.out.println("New Array -> " + Arrays.toString(allSubjects) + "\n");
        
    }
    
    public static void nullifyIntArray()
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(allNumbers) + "\n");
        allNumbers = null;
        System.out.println("New Array -> " + Arrays.toString(allNumbers) + "\n");
        
    }
    
    public static void main (String args[])
    {
        //nullifyStringArray();
        //nullifyIntArray();
        
    }
}
