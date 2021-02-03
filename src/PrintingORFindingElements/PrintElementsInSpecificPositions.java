package PrintingORFindingElements;

import java.util.Arrays;

/**Author and License
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * @author Ray Njire
*/
public class PrintElementsInSpecificPositions 
{
    public static void SearchSpecificString()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects));
        
        String searchElement = "Kiswahili";
        
        for(int i=0; i<allSubjects.length; i++)
        {
            //Initialize with the element at index 0, then 1, then 2...
            String compareElement = allSubjects[i];
            
            //if compareElement == searchElement print it to the console
            if (compareElement.equals(searchElement))
            {
                //For you to print an array you need to know the slot number
                System.out.println("Element '" + allSubjects[i] + "' is Found at Array Index " + i + "\n");
                
            }
        }
    }
    
    public static void SearchSpecificInteger()
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(allNumbers));
        
        int searchElement = 111;
        
        for(int i=0; i<allNumbers.length; i++)
        {
            //Initialize with the element at index 0, then 1, then 2...
            int compareElement = allNumbers[i];
            
            //For you to print an array you need to know the slot number
            if (compareElement == searchElement)
            {
                //For you to print an array you need to know the slot number
                System.out.println("Element '" + allNumbers[i] + "' is Found at Array Index " + i + "\n");
        
            }
        }
    }
    
    public static void AtSpecificIndex()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects));
        
        int specificIndex = 2;
        
        //For you to print an array you need to know the slot number
        System.out.println("The subject at Index " + specificIndex + " is: " + allSubjects[specificIndex] + "\n");
        
    }
    
    public static void AtEvenIndexes()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects));
        
        for(int i=0; i<allSubjects.length; i=i+2)
        {
            System.out.println("The subject at 'Even Index' " + i + " is: " + allSubjects[i]);
            
        }
        
        System.out.println("");
        
    }
    
    public static void AtOddIndexes()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects));
        
        for(int i=1; i<allSubjects.length; i=i+2)
        {
            System.out.println("The subject at 'Odd Index' " + i + " is: " + allSubjects[i]);
            
        }
        
        System.out.println("");
        
    }
    
    public static void main (String args[])
    {
        //SearchSpecificString();
        //SearchSpecificInteger();
        
        AtSpecificIndex();
        
        AtEvenIndexes();
        //AtOddIndexes();
        
    }
}
