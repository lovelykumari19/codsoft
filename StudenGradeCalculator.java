/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
		System.out.print("enter marks of English sub : ");
		float a = sc.nextFloat();
		System.out.print("enter marks of Maths subject : ");
		float b = sc.nextFloat();
		System.out.print("enter marks of Social Science sub : ");
		float c = sc.nextFloat();
		System.out.print("enter marks of Hindi sub : ");
		float d = sc.nextFloat();
		System.out.print("enter marks of Science sub : ");
		float e = sc.nextFloat();
		float sum = a+b+c+d+e;
		
		
		float percentage = sum/5;
		System.out.println("your Total marks is : "+ sum + " in 500");
		 System.out.println("your average  marks  is : "+percentage);
		 if(percentage > 80){  
            System.out.println("your Grade is : A");  
        }  
        else if(percentage>=60){  
            System.out.println("your Grade is : B");  
        }  
        else if(percentage>=45){  
            System.out.println("your Grade is : C");  
        }  
        else if(percentage>=35){  
            System.out.println("your Grade is : D");  
        } 
        else {
            System.out.println("you are Fail"); 
        }
	     
	}
}



