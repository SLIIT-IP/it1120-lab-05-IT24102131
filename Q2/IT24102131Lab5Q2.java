import java.util.Scanner;
public class IT24102131Lab5Q2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int num;
		System.out.print("Enter the number of new members introduced: ");
		num= input.nextInt();
		if(num<0)
		{	System.out.println("Input must be a number 0 or greater");}
	else{
		switch(num)
		{case 0 :System.out.println("Prize is : No Prize");
		break;
		case 1 :System.out.println("Prize is : Pen");
		break;
		case 2 :System.out.println("Prize is : Umbrella");
		break;
		case 3 :System.out.println("Prize is : Bag");
		break;
		case 4 :System.out.println("Prize is : Travelling Chair");
		break;
		default:System.out.println("Prize is : Headphone");}
		  
		 
	
		}
	}
}
		
		 