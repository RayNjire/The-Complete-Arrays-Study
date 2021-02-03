<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
=======
>>>>>>> 3cd47d87649caf5b818368f394996175927632d3
package EditingArrays;

import java.util.Arrays;

<<<<<<< HEAD
/**
 *
 * @author raynj
=======
/**Author and License
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * @author ray njire
>>>>>>> 3cd47d87649caf5b818368f394996175927632d3
 */
public class EmptyAnArray 
{
    public static void nullifyStringArray()
    {
<<<<<<< HEAD
        String allSubjects[] = {"Math", "English"};
=======
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
>>>>>>> 3cd47d87649caf5b818368f394996175927632d3
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
