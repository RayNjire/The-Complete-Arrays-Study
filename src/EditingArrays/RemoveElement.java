package EditingArrays;

import java.util.Arrays;

/** Author and License
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * @author ray njire
 */
public class RemoveElement 
{
    public static void RemoveString_CompareStrings()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects));
        
        String removeElement = "English";
        
        //Creates New Array with a shorter index length than the first array
        String takeOne[] = new String[allSubjects.length -1];
        
        //Delete Element
        for(int i = 0, k = 0; i < allSubjects.length; i++)
        {
            //Initialize with the element at index 0, then 1, then 2.....
            String compareElement = allSubjects[i];
            
            //if compareElement == removeElement do not print it to the new array, skip it
            if (compareElement.equals(removeElement))
            {
                continue;
                
            }
            
            //insert in the array's index k
            takeOne[k++] = allSubjects[i];
            
        }
        
        System.out.println("New Array -> " + Arrays.toString(takeOne) + "\n");
        
    }
    
    public static void RemoveString_UsingIndex()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects));
        
        int searchIndex = 1;
        
        //Creates New Array with a shorter index length than the first array
        String takeOne[] = new String[allSubjects.length -1];
        
        //Delete Element
        for(int i = 0, k = 0; i < allSubjects.length; i++)
        {
            //if i == searchIndex do not print it to the new array, skip it
            if (i == searchIndex)
            {
                continue;
                
            }
            
            //insert in the array's index k
            takeOne[k++] = allSubjects[i];
            
        }
        
        System.out.println("New Array -> " + Arrays.toString(takeOne) + "\n");
        
    }
    
    public static void RemoveInt_CompareIntegers()
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(allNumbers));
        
        int removeElement = 65;
        
        //Creates New Array with a shorter index length than the first array
        int takeOne[] = new int[allNumbers.length -1];
        
        //Delete Element
        for(int i = 0, k = 0; i < allNumbers.length; i++)
        {
            //Initialize with the element at index 0, then 1, then 2.....
            int compareElement = allNumbers[i];
            
            //if compareElement == removeElement do not print it to the new array, skip it
            if (compareElement == removeElement)
            {
                continue;
                
            }
            
            //insert in the array's index k
            takeOne[k++] = allNumbers[i];
            
        }
        
        System.out.println("New Array -> " + Arrays.toString(takeOne) + "\n");
        
    }
    
    public static void RemoveInt_UsingIndex()
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(allNumbers));
        
        int searchIndex = 2;
        
        //Creates New Array with a shorter index length than the first array
        int takeOne[] = new int[allNumbers.length -1];
        
        //Delete Element
        for(int i=0, k=0; i<allNumbers.length; i++)
        {
            //if i == searchIndex do not print it to the new array, skip it
            if (i==searchIndex)
            {
                continue;
                
            }
            
            //insert in the array's index k
            takeOne[k++] = allNumbers[i];
            
        }
        
        System.out.println("New Array -> " + Arrays.toString(takeOne) + "\n");
        
    }
    
    public static void main (String[] args)
    {
        //RemoveString_CompareStrings();
        //RemoveString_UsingIndex();
        
        //RemoveInt_CompareIntegers();
        //RemoveInt_UsingIndex();
        
    }
}
