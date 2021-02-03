package EditingArrays;

import java.util.Arrays;

/**Author and License
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * @author ray njire
 */
public class RenameElement
{
    public static void RenameString_CompareStrings()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects));
        
        String searchElement = "Maths";
        String renameElement = "Mathematics";
        
        //Rename Element
        for(int i=0; i < allSubjects.length; i++)
        {
            //Initialize with the element at index 0, then 1, then 2...
            String compareElement = allSubjects[i];
            
            //if compareElement == removeElement do not print it to the new array, skip it
            if (compareElement.equals(searchElement))
            {
                allSubjects[i] = renameElement;
                
            }
        }
        
        System.out.println("New Array -> " + Arrays.toString(allSubjects) + "\n");
        
    }
    
    
    
    //Simple. No Dynamic Looping (No Searching)
    public static void RenameString_UsingIndex1()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects));
        
        //Insert into Array Slot 0
        allSubjects[4] = "Social Studies";
        
        System.out.println("New Array -> " + Arrays.toString(allSubjects) + "\n");
        
    }
    
    
    
    //With Dynamic Looping (Can Search)
    public static void RenameString_UsingIndex2()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects));
        
        int searchIndex = 5;
        String renameElement = "Christian Religious Education";
        
        //Rename Element
        for(int i=0; i < allSubjects.length; i++)
        {
            if (i==searchIndex)
            {
                allSubjects[i] = renameElement;
                
            }
        }
        
        System.out.println("New Array -> " + Arrays.toString(allSubjects) + "\n");
        
    }
    
    
    
    public static void RenameInt_CompareIntegers()
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(allNumbers));
        
        int searchElement = 98;
        int renameElement = 98000;
        
        //Rename Element
        for(int i=0; i < allNumbers.length; i++)
        {
            //Initialize with the element at index 0, then 1, then 2...
            int compareElement = allNumbers[i];
            
            //if compareElement == removeElement do not print it to the new array, skip it
            if (compareElement == searchElement)
            {
                allNumbers[i] = renameElement;
                
            }
        }
        
        System.out.println("New Array -> " + Arrays.toString(allNumbers) + "\n");
        
    }
    
    
    
    //Simple. No Dynamic Looping (No Searching)
    public static void RenameInt_UsingIndex1()
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(allNumbers));
        
        //Insert into Array Slot 0
        allNumbers[0] = 600601602;
        
        System.out.println("New Array -> " + Arrays.toString(allNumbers) + "\n");
        
    }
    
    
    
    //With Dynamic Looping (Can Search)
    public static void RenameInt_UsingIndex2()
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(allNumbers));
        
        int searchIndex = 5;
        int renameElement = 959595950;
        
        //Rename Element
        for(int i=0; i < allNumbers.length; i++)
        {
            if (i==searchIndex)
            {
                allNumbers[i] = renameElement;
                
            }
        }
        
        System.out.println("New Array -> " + Arrays.toString(allNumbers) + "\n");
        
    }
    
    public static void main(String args[])
    {
        RenameString_CompareStrings();
        RenameString_UsingIndex1();
        RenameString_UsingIndex2();
        
        RenameInt_CompareIntegers();
        RenameInt_UsingIndex1();
        RenameInt_UsingIndex2();
        
    }
}
