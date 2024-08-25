import java.util.Scanner;
public class IT24102131Lab5Q1{
	public static void main(String[]args){
                //hinum= largest number,lonum=lowest number
		Scanner input=new Scanner(System.in);
		int num1,num2,num3,hinum,lonum;
		System.out.print("Enter the first integer: ");
		num1=input.nextInt();
		System.out.print("Enter the second integer: ");
		num2=input.nextInt();
		System.out.print("Enter the third integer: ");
		num3=input.nextInt();
		System.out.println("user entered numbers are :" + num1 + " " + num2 + " " + num3);
		lonum = Math.min(num1,Math.min(num2,num3));
		hinum = Math.max(num1,Math.max(num2,num3));
		System.out.println("the smallest number is: "+lonum);
		System.out.println("the largest number is: "+hinum);
	
	}
}