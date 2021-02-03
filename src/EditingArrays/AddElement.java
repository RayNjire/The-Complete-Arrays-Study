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
public class AddElement 
{
    public static void AddString()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        System.out.println("Original Array -> " + Arrays.toString(allSubjects) + "\n\n");
        
        //Copy the array into itself but declare it with a larger array size
        allSubjects = Arrays.copyOf(allSubjects, allSubjects.length + 1);
        
        //Enter the number 4 into the last index of the array
        allSubjects[allSubjects.length - 1] = "Arts and Crafts";
        
        System.out.println("New Array -> " + Arrays.toString(allSubjects) + "\n\n");
        
    }
    
    public static void AddInt()
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(allNumbers) + "\n\n");
        
        //Copy the array into itself but declare it with a larger array size
        allNumbers = Arrays.copyOf(allNumbers, allNumbers.length + 1);
        
        //Enter the number 4 into the last index of the array
        allNumbers[allNumbers.length - 1] = 123456;
        
        System.out.println("New Array -> " + Arrays.toString(allNumbers) + "\n\n");
        
    }
    
    public static void main(String args[])
    {
        //AddString();
        //AddInt();
        
    }
}
