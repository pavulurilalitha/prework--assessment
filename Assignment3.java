import java.util.Scanner;
public class Assignment3 {

 
 //function to checkPalindrome

       public void checkPalindrome(int n)  {
	int rev=0,temp=n;
        while(temp!=0)
        {
            rev=rev*10+(temp%10);
            temp=temp/10;
        }
        if(rev==n)
            System.out.println("It is Palindrome number");
        else
            System.out.println("It is not a Palindrome number");

	
      	}

 
//function to printPattern

       public void printPattern(int n) {
    	for (int i= 0; i<= n-1 ; i++)
    	{
        	for (int j=0; j<=i; j++)
        	{
           	 	System.out.print(" ");
        	}
        	for (int k=0; k<=n-1-i; k++)
        	{
            		System.out.print("*" + " ");
        	}
        	System.out.println();
    	}
       }
	


//function to check no is prime or not

        public void checkPrimeNumber(int n) {
	int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2)
            System.out.println("It is Prime number");
        else
            System.out.println("It is not a Prime number");

        }

         
 // function to print Fibonacci Series

          public void printFibonacciSeries(int n) {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1,sum=0;
		System.out.println("The Fibonacci Series"+first+" "+second);
		for(int i=2;i<=n;i++)
		{	
 			sum=first+second;
			System.out.println(" "+sum);
			
			first=second;
			second=sum;
		}

          }

      public static void main(String[] args) {

                Assignment3 obj = new Assignment3();
    Scanner sc=new Scanner(System.in);
int choice;
int n;

do
{
    	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
	
	System.out.println();

 

	choice = sc.nextInt();
		System.out.println("Enter a number");
	
n = sc.nextInt();
   switch(choice){
       	case 0:
	choice = 0;
	break;
	case 1: {
	obj.checkPalindrome(n);
	}

	break;

 

	case 2: {


 

	obj.printPattern(n);

	}
	
	break;

 

	case 3: {

	obj.checkPrimeNumber(n);

	}

	break;

 

	case 4: {

 

	obj.printFibonacciSeries(n);

	}

	break;

 

	default:

	System.out.println("Invalid choice. Enter a valid no.\n");

	}

 


 }while (choice != 0);
 
  	System.out.println("Exited Successfully!!!");
	sc.close();
}

}