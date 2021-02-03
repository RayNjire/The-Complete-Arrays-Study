/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiDimensionalArrays;

import java.util.Arrays;

/**
 *
 * @author raynj
 */
public class BasicsOf2DArrays 
{
    public static void basics()
    {
        //Sample Array
        int numberArray[][] = { {20, 15, 7},
                        {8, 7},
                        {7},
                        {85, 45, 12, 5},
                        {99, 77, 66, 55, 44, 33}};

        //Print out the entire Array
        System.out.println("Original Array -> " + Arrays.toString(numberArray) + "\n\n");
        
        //To print an element you have to refer to the array index
        //Print First Element
        System.out.println("First Element -> " + numberArray[0][0] + "\n\n");
        
        //Certain details of the Array
        System.out.println("number of rows: " + numberArray.length);
        System.out.println("row index 0, number of elements: " + numberArray[0].length);
        System.out.println("row index 1, number of elements: " + numberArray[1].length);
        System.out.println("row index 2, number of elements: " + numberArray[2].length);
        System.out.println("row index 3, number of elements: " + numberArray[3].length);
        System.out.println("row index 4, number of elements: " + numberArray[4].length + "\n\n");
        
    }
    
    public static void main(String args[])
    {
        basics();
        
    }
}
