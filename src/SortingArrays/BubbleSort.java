/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingArrays;

import java.util.Scanner;

/**
 *
 * @author raynj
 */
public class BubbleSort 
{
    public static void main(String[] args) 
    {
        int [] data = new int [10];
        int i, n=5, j, temp;

        System.out.println("Enter the Elements to be Sorted");
        Scanner sc = new Scanner(System.in);

        for (i = 0; i<n; i++)
        {
            data[i] = sc.nextInt();

        }

        for(j=0; j<n-1; ++j)
        {
            for (i=0; i<n-j-1; i++)
            {
                if(data[i]>data[i+1])
                {
                    temp = data [i];
                    data[i] = data[i+1];
                    data[i+1] = temp;
                    
                }
            }
        }
        System.out.println("Array in Ascending Order");
        for (i=0; i<n; i++)
        {
                System.out.println(data[i]);
                
        }
    }
}
