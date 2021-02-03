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
public class CopyArrayToNewArray 
{
    public static void main(String args[])
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        System.out.println("Original Array -> " + Arrays.toString(allNumbers) + "\n");
        
        //Declare new array 1 the exact same size the other one
        //As long as the datatypes are the same, the code is the same
        int newArray[] = allNumbers;
        
        System.out.println("New Array -> " + Arrays.toString(newArray));
        
    }
}
