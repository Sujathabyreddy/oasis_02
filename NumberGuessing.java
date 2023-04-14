import java.util.*;
class demo{
	public static void main(String args[]){	
	System.out.print("\t\t\t\tNumber Guessing Game\n");
	System.out.print("\t\t-----------------------------*-------------------------------\n");
	Scanner sc=new Scanner(System.in);
	Random r=new Random();
	int random,attempts=0,score=0,m;
	boolean won =false;
	int noOfattempts=10,currattempts=0;
	do
	{
		won=false;
		attempts=0;
		random=r.nextInt(1,101);
		currattempts=0;
	while(won!=true)
	{
		System.out.print("enter Number");
		int num=sc.nextInt();
		currattempts++;
		if(noOfattempts<currattempts){
			System.out.println("you crossed the limit ");
			System.out.println("\t\t\tSorry!You loss the game");
	System.out.print("\t\t-----------------------------*-------------------------------\n");
			break;
		}
		else{
		if(num>100 || num<0)
		{
			System.out.print("Enter number in the range of 1-100");
			break;
		}
		if(Math.abs(num-random)<10 && num<random)
		{
			System.out.print("your almost there try again .");
			System.out.println("enterd number low");
			attempts++;
				continue;
		}
		if(Math.abs(num-random)<10 && num>random)
		{
			System.out.print("your almost there try again .");
			System.out.println("enterd number high");
			attempts++;
			continue;
		}
		if(num==random){
			attempts++;
		System.out.println("\t\t\tHurrah!you won the game in "+attempts+" attempts");
	System.out.print("\t\t-----------------------------*-------------------------------\n");
		score++;
		won=true;
		}else if(num<random){
			System.out.println("Sorry enterd number is too low try again");
			attempts++;
		}else if(num>random)
		{
			System.out.println("Sorry enterd number is too high try again");
			attempts++;
		}}
	}
	if(attempts<3){
			System.out.println("\t\t\t\t total points 100");
				System.out.print("\t\t-----------------------------*-------------------------------\n");

		}else if(attempts>=3 && attempts<7)
		{
			System.out.println("\t\t\t\t total points 70");
				System.out.print("\t\t-----------------------------*-------------------------------\n");

		}else{
			System.out.println("\t\t\t\t total points 50");
				System.out.print("\t\t-----------------------------*-------------------------------\n");

		}System.out.println("Enter 1.continue\t\t2.exit");
	 m=sc.nextInt();}while(m==1);
	System.out.print("your total score is "+score);
	}
}
