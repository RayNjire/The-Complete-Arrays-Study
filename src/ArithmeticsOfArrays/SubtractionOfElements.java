package ArithmeticsOfArrays;

import java.util.Arrays;
import java.util.Scanner;

/**Author and License
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * @author ray njire
*/
public class SubtractionOfElements 
{
    public static void StaticArray()
    {
        double subtraction = 0;
        int theNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(theNumbers) + "\n");
        
        for(int i=0; i<theNumbers.length; i++)
        {
            //This if statement places the + sign in between the elements
            //First we check if we're at the end of the array then place =
            //If we're not yet at the end of the array, put in +
            if (i == theNumbers.length - 1)
            {
                //Initialize with the element at index 0, then 1, then 2...
                System.out.print(theNumbers[i] + " = ");
                
            }
            
            else
            {
                //Initialize with the element at index 0, then 1, then 2...
                System.out.print(theNumbers[i] + " - ");
                
            }
        }
        
        //The actual subtraction of elements
        for(int i=0; i<theNumbers.length; i++)
        {
            //Print out the first number as it is. This prevents Subtracting the first number from 0
            if (i == 0)
            {
                subtraction = theNumbers[i];
                
            }
            
            //Subtract the other elements from the first number
            else
            {
                subtraction = subtraction - theNumbers[i];
                
            }
        }

        System.out.print(subtraction + "\n\n");
        System.out.println("<---------------------->\n");
        
    }
    
    public static void DynamicArray()
    {
        double subtraction = 0;
        int arraySize;
        Scanner userEntry = new Scanner(System.in);
        System.out.println("How Many Numbers do you wish to Subtract?");
        
        arraySize = userEntry.nextInt();
        
        int theNumbers[] = new int[arraySize];
        
        System.out.println("Enter the " + arraySize + " numbers in the order you wish to subtract them. (Click ENTER after each number)");
        
        for (int i = 0; i<arraySize; i++)
        {
            theNumbers[i] = userEntry.nextInt();
            
        }
        
        System.out.println("");
        
        for(int i = 0; i<theNumbers.length; i++)
        {
            //This if statement places the + sign in between the elements
            //First we check if we're at the end of the array then place =
            //If we're not yet at the end of the array, put in +
            if (i == theNumbers.length - 1)
            {
                //Initialize with the element at index 0, then 1, then 2...
                System.out.print(theNumbers[i] + " = ");
                
            }
            
            else
            {
                //Initialize with the element at index 0, then 1, then 2...
                System.out.print(theNumbers[i] + " - ");
                
            }
        }
        
        //The actual subtraction of elements
        for(int i=0; i<theNumbers.length; i++)
        {
            //Print out the first number as it is. This prevents Subtracting the first number from 0
            if (i == 0)
            {
                subtraction = theNumbers[i];
                
            }
            
            //Subtract the other elements from the first number
            else
            {
                subtraction = subtraction - theNumbers[i];
                
            }
        }

        System.out.print(subtraction + "\n\n");
        System.out.println("<---------------------->\n");
        
    }
    
    public static void main (String args[])
    {
        /*Uncomment the Function you wish to run*/
        //StaticArray();
        //DynamicArray();
        
    }
}
