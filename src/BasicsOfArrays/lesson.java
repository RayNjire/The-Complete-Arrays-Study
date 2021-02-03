/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BasicsOfArrays;

import java.util.Arrays;

/**
 *
 * @author Ray Njire
 */
public class lesson 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Integer Array
        int Numbers[] = {10,22,43,412,535,67,733,85,91,140};
        System.out.println(Numbers[2] + "\n");
        
        //String Array
        String studentNames[] = {"Josh","Maina","Joel","Samuel","Kioko","Njeri","Chebet","Faith","Stephen","Ray"};
        System.out.println(studentNames[1] + "\n");
         
        //print all elements in array with 'array counter'
        for (int counter=0; counter<studentNames.length; counter++)
        {
            System.out.println(counter +" "+ studentNames[counter]);
        }
        
        //Normal/Simple way to print all elements in array
        System.out.println("\nThe array elements: " + Arrays.toString(studentNames));
        
    }
}
