package PrintingElements;

/**Author and License
 * 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * @author ray njire
 */
public class PrintRandomElement 
{
    public static void RandomStringElement()
    {
        String allSubjects[] = {"Maths", "Science", "English", "Kiswahili", "S.S.T.", "C.R.E.", "P.E.", "Swimming"};
        
        //The total Elements, not the array index
        int random = (int) (Math.random() * 8);
        
        //For you to print an array you need to know the slot number
        System.out.println("The random subject is: " + allSubjects[random]);
        
    }
    
    public static void RandomIntegerElement()
    {
        int allNumbers[] = {600, 50, 98, 65, 78, 95, 111, 521};
        
        //The total Elements, not the array index
        int random = (int) (Math.random() * 8);
        
        //For you to print an array you need to know the slot number
        System.out.println("The random number from the array is: " + allNumbers[random]);
        
    }
    
    /**
     * @param args the command line arguments
    */
    public static void main(String args[]) 
    {
        RandomStringElement();
        RandomIntegerElement();
        
    }
}
