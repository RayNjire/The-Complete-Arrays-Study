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
        int student[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(student[6]);
        
        String studentname[] = {"Josh","Maina","Joel","Samuel","Kioko","Njeri","Chebet","Faith","Stephen","Ray"};
        System.out.println(studentname[1]);
         
        //print all elements in array
        for (int counter=0; counter<studentname.length; counter++)
        {
            System.out.println(counter +" "+ studentname[counter]);
        }
        
        //Alternative way to print all elements in array
        System.out.println("\nThe array elements: " + Arrays.toString(studentname));
        
    }
}
        
        // TODO code application logic here
    
    

