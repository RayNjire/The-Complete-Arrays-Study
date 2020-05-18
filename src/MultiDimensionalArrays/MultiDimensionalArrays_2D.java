package MultiDimensionalArrays;

import java.util.Scanner;

/**Author and License
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * @author ray njire
 */
public class MultiDimensionalArrays_2D 
{
    public static void StaticMultiDimensionalArray1()
    {
        int arraySize;
        
        //Initializing the Array (First Method)
        //[row][column]
        int lotteryCard[][] = { {20, 15, 7}, //This arrangement is for easy understanding of the indexing
                                {8, 1}, //Yes, the number of columns and rows are different
                                {23}, //Why? Because I love headaches
                                {85, 45, 12, 5},
                                {99, 77, 66, 55, 44, 33}};
        
        //---------------------------------------------------\\
        //-----------Printing out the whole array-------------\\
        //-----------------------------------------------------\\
        
        System.out.println("The Original Array:");
        
        //Declare new array that holds all the elements in the first row of the original array
        for (int LC1[] : lotteryCard) 
        {
            arraySize = LC1.length - 1;
            
            for (int j = 0; j <= arraySize; j++)
            {
                System.out.println(LC1[j]);
                
            }
        }
        
        System.out.println("\n------------------\n");
        
        //---------------------------------------------------------------\\
        //-----------Printing out the whole array but organized-----------\\
        //-----------------------------------------------------------------\\
        
        for (int LC2[] : lotteryCard) 
        {
            arraySize = LC2.length - 1;

            for (int j = 0; j <= arraySize; j++)
            {
                System.out.print(LC2[j] + ", ");
                
            }

            System.out.println("\n");

        }
            
        System.out.println("\n------------------\n");
        
        //-------------------------------------------------------\\
        //-------------Printing out a single element--------------\\
        //---------------------------------------------------------\\
        
        //[row][column]
        System.out.println("Manually printing out an element -> " + lotteryCard[2][0]);
        
        System.out.println("\n------------------\n");
        
        //-------------------------------------------------------\\
        //---------------Printing out 1 whole row-----------------\\
        //---------------------------------------------------------\\
        
        //[row][column]
        System.out.println("Printing out the last row:");
        
        //Total Rows of the Array
        int arrayTotalRows = lotteryCard.length - 1;
        
        //The Last Row of the Array
        int arrayRowIndex = lotteryCard[arrayTotalRows].length - 1;
        
        for (int j = 0; j <= arrayRowIndex; j++)
        {
            System.out.println(lotteryCard[arrayTotalRows][j]);
            
        }
        
        System.out.println("\n------------------\n");
        
        //-------------------------------------------------------------------\\
        //---------------Printing out 1 whole row but organized---------------\\
        //---------------------------------------------------------------------\\
        
        //[row][column]
        System.out.println("Printing out the fourth row organized:");
        int printRow = 3;//The Row to Print Out
        
        //Number of elements in the third row of the array
        int arrayRowIndex2 = lotteryCard[printRow].length - 1;
        
        for (int j = 0; j <= arrayRowIndex2; j++)
        {
            System.out.print(lotteryCard[printRow][j] + ", ");
            
        }
        
        System.out.println("\n\n------------------\n");
        
        //--------------------------------------------------------------\\
        //-------------------Printing out 1 whole column-----------------\\
        //----------------------------------------------------------------\\
        
        System.out.println("Printing out the 2nd column:");
        int columnIndex = 1;//Column to print

        //Total Number of Rows in the array
        int arrayTotalRows2 = lotteryCard.length - 1;

        //Starting from row 0 up to the total number of rows in the array
        for (int rowIndex = 0; rowIndex <= arrayTotalRows2; rowIndex++)
        {
            //Get the number of elements in row 0, 1, 2 ....
            int arrayElementIndex2 = lotteryCard[rowIndex].length;
            
            //if the row, has more elements (is within range of the column we're trying to print)
            if (arrayElementIndex2 > columnIndex)
            {
                System.out.println(lotteryCard[rowIndex][columnIndex]);

            }
        }
        
        System.out.println("\n--------------------\n");
        
        //---------------------------------------------------------------------------\\
        //------------Printing out a random element from the whole array--------------\\
        //-----------------------------------------------------------------------------\\
        
        //Total Number of Rows in the array
        int arrayTotalRows3 = lotteryCard.length - 1;
        //Get Random Row
        int randomRow = (int)(Math.random() * arrayTotalRows3);
        
        //Find the maximum number of columns in the entire array
        int maxColumn = 0;
        //Starting from row 0 up to the total number of rows in the array
        for (int rowIndex = 0; rowIndex <= arrayTotalRows2; rowIndex++)
        {
            //Get the number of elements in row 0, 1, 2 ....
            int arrayElementIndex2 = lotteryCard[rowIndex].length;
            
            if (arrayElementIndex2 > maxColumn)
            {
                maxColumn = arrayElementIndex2;
                
            }
        }
        
        //Get Random Column
        int randomColumn = (int)(Math.random() * maxColumn);
        
        //Print out the random index
        System.out.println("The Random Index Is -> [" + randomRow + "][" + randomColumn + "]");
        
        //If the row chosen is > the total rows OR the column chosen > the number of elements in that row
        if (randomRow > arrayTotalRows3 || randomColumn > lotteryCard[randomRow].length - 1 )
        {
            System.out.println("Randomly Chosen Element -> 0");
            
        }
        
        else
        {
            System.out.println("Randomly Chosen Element -> " + lotteryCard[randomRow][randomColumn]);
            
        }
        
        System.out.println("\n<<<<------------------>>>>\n");
        
    }
    
    
    
    
    public static void StaticMultiDimensionalArray2()
    {
        //Initializing Array (Second Method)
        int lotteryCard2[][] = new int[3][3];
        lotteryCard2[0][0] = 20;
        lotteryCard2[0][1] = 15;
        lotteryCard2[0][2] = 7;
        lotteryCard2[1][0] = 8;
        lotteryCard2[1][1] = 7;
        lotteryCard2[1][2] = 19;
        lotteryCard2[2][0] = 7;
        lotteryCard2[2][1] = 13;
        lotteryCard2[2][2] = 41;
        
        int arraySize;
        
        //Printing out the whole array
        System.out.println("The Original Array:");
        //Declare new array that holds all the elements in the first row of the original array
        for (int LC2[] : lotteryCard2) 
        {
            arraySize = LC2.length - 1;
            
            for (int j = 0; j <= arraySize; j++)
            {
                System.out.println(LC2[j]);
                
            }
        }
        
        System.out.println("\n------------------\n");
        
        System.out.println("Other ways of interacting with the array are in the first Function");
        
        System.out.println("\n<<<------------>>>\n");
        
    }
    
    
    
    
    public static void DynamicMultiDimensionalArray()
    {
        int data[][] = new int [3][3];
        int arraySize;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Item");
        
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                data [i][j] = sc.nextInt();

            }
        }
        
        System.out.println("\nThe Original Array:");
            
        for (int LC2[] : data) 
        {
            arraySize = LC2.length - 1;
            
            for (int j = 0; j <= arraySize; j++)
            {
                System.out.print(LC2[j] + ", ");
                
            }
        }
        
        System.out.println("\n<<<------------------>>>\n");
        
     }
    
    
    
    public static void main(String args[])
    {
        //StaticMultiDimensionalArray1();
        //StaticMultiDimensionalArray2();
        //DynamicMultiDimensionalArray();
        
    }
}
