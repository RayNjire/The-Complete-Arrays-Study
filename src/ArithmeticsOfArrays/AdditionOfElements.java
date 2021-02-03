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
public class AdditionOfElements 
{
    public static void StaticArray()
    {
        double sum = 0;
        double theNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(theNumbers) + "\n");
        
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
                System.out.print(theNumbers[i] + " + ");
                
            }
        }
        
        //Grab all elements in the array
        for (double i : theNumbers)
        {
            sum = sum + i;
            
        }

        System.out.print(sum + "\n\n");
        System.out.println("<---------------------->\n");
        
    }
    
    public static void DynamicArray()
    {
        double sum = 0; 
        int arraySize;
        Scanner userEntry = new Scanner(System.in);
        System.out.println("How Many Numbers do you wish to Add?");
        
        arraySize = userEntry.nextInt();
        
        double theNumbers[] = new double[arraySize];
        
        System.out.println("Enter the " + arraySize + " numbers. (Click ENTER after each number)");
        
        for (int i = 0; i<arraySize; i++)
        {
            theNumbers[i] = userEntry.nextInt();
            
        }
        
        System.out.println("");
        
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
                System.out.print(theNumbers[i] + " + ");
                
            }
        }
        
        //Grab all elements in the array
        for (double i : theNumbers)
        {
            sum = sum + i;
            
        }
        
        System.out.print(sum + "\n\n");
        System.out.println("<---------------------->\n");
        
    }
    
    public static void main (String args[])
    {
        /*Uncomment the Function you wish to run*/
        //StaticArray();
        //DynamicArray();
        
    }
}
