import java.util.Scanner;
public class IT24102131Lab5Q3{
	public static void main(String[]args){
	    final double ROOMCPDY=48000.00;
		final int diss10=10;
		final int diss20=20;
		Scanner input=new Scanner(System.in);
		int sdate,edate,rdate;
		double amount;
		System.out.println("Enter Start Date(1-31):");
		sdate=input.nextInt();
		System.out.println("Enter End Date(1-31):");
		edate=input.nextInt();
		if(sdate<1 || sdate>31 ||edate<1 || edate>31)
		{System.out.println("Error:Days must be between 1 and 31");}
		
		rdate=edate-sdate;
		double Dissrate;
	
		if (rdate>=3 && rdate<=4)
		{Dissrate= diss10;}
		else if (rdate>=5)
		{Dissrate= diss20;}
		double Tamount=rdate*ROOMCPDY;
		double dissamount = Tamount * ( Dissrate / 100.0);
		double topay=Tamount-dissamount;
		
		System.out.println("Total amount to be paid:" + topay);
		}
	}	
		
		