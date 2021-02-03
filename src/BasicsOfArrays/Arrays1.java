
package BasicsOfArrays;

import java.util.Scanner;

/**Author and License
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author ray njire
 */
public class Arrays1 
{
    public static void main (String [] args)
    {
        int j;
        int i;
        Scanner S = new Scanner(System.in);	
        int Digit[] = new int [10];

        System.out.println("Enter 10 Nos");

        for (i=0; i<10; i++)
        {
<<<<<<< HEAD
            Digit [i] = S.nextInt();
            
=======

                Digit [i] = S.nextInt();
>>>>>>> 3cd47d87649caf5b818368f394996175927632d3
        }

        for (j=0; j<10; j++)
        {
            if (Digit[j] %2==0)
            System.out.println(Digit[j]);
            
        }
    }
}
