package abc;
import java.util.Scanner;
public class People {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter gender : M/F");
		int gender = sc.next().charAt(0);
		
		if(gender == 'F') 
		{
			if(age >= 60) 
			{
				System.out.println("Rate of interrest=7.5%");
			}
			else if( age <60 ) 
			{
				System.out.println("Rate of interrest=5%");
			}
		}
		if(gender == 'M')
		{
			if(age >= 60) 
			{
				System.out.println("Rate of interrest=7%");
			}
			else if( age <60 ) 
			{
				System.out.println("Rate of interrest=5%");
			}
		else 
		{
			System.out.println("ERROR");
		}

	}
	}
	}


