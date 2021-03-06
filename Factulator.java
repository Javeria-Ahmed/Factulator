/*
 * This program will firstly ask user to tell how many times he wants to run the program.
 * According to which the program will iterate. The program will calculate factorial of 
 * the given number and factors as well. All the data will be stored in an array.In the last
 * the factorial,factors and the array will be printed.
 */

package factulator;
import java.util.Scanner;         //importing java built-in Scanner class
import java.util.Arrays;          //importing java built-in Arrays class
public class Factulator {
     //Method To Find the Factorial of a Number
    public static int findFactorial(int num)
    {
        if(num==0)         //if the user entered 0 then the system will return 1(its factorial)
        return 1;
        else if(num==1)    //if the user entered 1 then the system will return 1 as well(its factorial)
        return 1;
        else if(num<1)     //if the user entered a negative number then the system will return -1
        return -1;
        else
        return num*findFactorial(num-1);      //if the user entered a positive number then the system will return its factorial
    }
   
    //Main Code
    public static void main(String[] args){
            //Take input from the user
        Scanner sc = new Scanner(System.in);
        
        System.out.println("****************************************************************************************");      
        System.out.print("~How many times do you want to calculate the factorial? = ");       //asking user how many times does he want to run the program
        int x =sc.nextInt();       //storing the input in variable x
       
       
        {      
           
        String[] array=new String[x];    //declaring and initializing array of string datatype 
        String msg = "";     //initializing string

        for (int j = 0; j < array.length; j++)      //putting a loop for iterating the program as many times as the user wants
        {      
            System.out.print("\nEnter the number: ");      
            int n = sc.nextInt();   //Input the number
             if(n>=0)
            {
             //Calling the findfactorial method here and giving it n(user's input) argument
                int factorial=findFactorial(n);
                msg = "The factorial of "+n+" is " + "'" + factorial + "'\n";               
                System.out.println(msg);
            }        
            else
            {
                msg = "The factorial of " +n+ " is " + "undefined!";     //Prompting a message to user if he enters a negative number
                System.out.println(msg);
            }
            System.out.println("-------------------------------------------------------------------------------------");    
            System.out.print("\nFactors of " + n + " are ");  
            

            for (int i = 1; i <= n; i++)         //putting a loop again to iterate till the user's input to get its factors
            {
                if (n % i == 0)
                {
                    System.out.print(i + " ");       //printing the factors of the number the user gave        
                }  
            }

       
            if(n<=0)
            {    
                //as there is no factorial of a negative number that is why this program also do not give factors of a negative number!
                //informing the user why does the program didn't give the factors of a negative number
                System.out.println("not printed because this system only processes positive number!");                        
            }
            System.out.println("\n-------------------------------------------------------------------------------------");    

            array[j] = msg;   //inserting the result in the array
           
           
            System.out.println("\nARRAY:\n"+ Arrays.toString(array) );
           
        }
        System.out.println("*******************************************************************************************");
        System.out.println();
        }
    }
}
       
       
    
    


    
