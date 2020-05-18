
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

                Digit [i] = S.nextInt();
        }

        for (j=0; j<10; j++)
        {
            if (Digit[j] %2==0)
            System.out.println(Digit[j]);
            
        }
    }
}
