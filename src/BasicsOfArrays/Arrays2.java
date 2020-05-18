package BasicsOfArrays;

import java.util.Scanner;

/**Author and License
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * @author ray njire
*/
public class Arrays2
{
    public static void main (String [] args)
    {
        double j;
        double i;
        Scanner S = new Scanner(System.in);
        double Digit[] = new double [10];
        
        System.out.println("Enter 10 Numbers");

        for (i=0; i<10; i++)
        {
            Digit [(int) i] = S.nextDouble();
            
        }

        for (j=0; j<10; j++)
        {
            if (Digit[(int) j] >= 0)
            {
                System.out.println(Digit[(int) j]);
                
            }
        }
    }
}
