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
public class EmptyAnArray 
{
    public static void nullifyStringArray()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
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
