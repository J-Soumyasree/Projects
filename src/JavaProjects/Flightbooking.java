package JavaProjects;

import java.util.Scanner;
public class Flightbooking 
{
	public static void main(String[] args) 
	{
		
		
		System.out.println("\n");
		System.out.println("\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("\t>>> ✈️ WELCOME TO FLIGHT BOOKINGS ✈️ <<<");
		System.out.println("\t<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("\n");
		System.out.println("=================================================================");
		
		System.out.println("Source Cities ");
		System.out.println("\n");

		System.out.println(" 1.Hyderabad");
		System.out.println(" 2.Chennai");
		System.out.println(" 3.Banglore");
		System.out.println(" 4.Mumbai");
		System.out.println(" 5.Delhi");
		System.out.println(" 6.Tirupati");
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		System.out.println("Select source City number: ");

		int source=Integer.parseInt(sc.nextLine());
		
		switch(source) 
		{
		case 1:
			System.out.println("You have selected hyderabad as your source city");
			break;
		case 2:
			System.out.println("You have selected Chennai as your source city");
			break;
		case 3:
			System.out.println("You have selected Banglore as your source city");
			break;
		case 4:
			System.out.println("You have selected Mumbai as your source city");
			break;
		case 5:
			System.out.println("You have selected Delhi as your source city");
			break;
		case 6:
			System.out.println("You have selected Tirupati as your source city");
			break;
		default:
			System.out.println("invalid source city");
			
		}
		
		System.out.println("\n");
		System.out.println("Destination Cities ");
		System.out.println("\n");

		System.out.println(" 1.Hyderabad");
		System.out.println(" 2.Chennai");
		System.out.println(" 3.Banglore");
		System.out.println(" 4.Mumbai");
		System.out.println(" 5.Delhi");
		System.out.println(" 6.Tirupati");
		
		System.out.println("\n");
		System.out.println("Select Destination City number: ");
		int destination=Integer.parseInt(sc.nextLine());
		
		if(destination !=source)
		{
			switch(destination) 
			{
			case 1:
				System.out.println("You have selected hyderabad as your destination city");
				break;
			case 2:
				System.out.println("You have selected Chennai as your destination city");
				break;
			case 3:
				System.out.println("You have selected Banglore as your destination city");
				break;
			case 4:
				System.out.println("You have selected Mumbai as your destination city");
				break;
			case 5:
				System.out.println("You have selected Delhi as your destination city");
				break;
			case 6:
				System.out.println("You have selected Tirupati as your destination city");
				break;
			default:
				System.out.println("invalid destination city");
				return ;
			}
		}
		else 
		{
			System.out.println("*you cannot select Destination city as same as Source city*");
			return;
		}
		
		System.out.println("\nThese are the avaailable flights ✈️");
		System.out.println("\n 1.IndioGo \n 2.AirIndia \n 3.SpiceJet");
		System.out.println("\nPlease Select Your Flight Number: ");
		int flightNo=Integer.parseInt(sc.nextLine());
		
		if(flightNo>3 || flightNo<1)
		{
			System.out.println("\nThere is no flights with your selected number");
			return ;
			
		}
		
		
		
		System.out.println("Enter Number of Passengers: ");
		int passenger=Integer.parseInt(sc.nextLine());
		
		switch(flightNo)
		{
		case 1:
		{
			int k=1;
			for(int i=1;i<=12;i++)
			{
				for(int j=1;j<=5;j++)
				{
					System.out.print("["+k+"] ");
					k++;
				}
				System.out.println("");
			}
			break;
		}
		case 2:
		{
			int k=1;
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=6;j++)
				{
					System.out.print("["+k+"] ");
					k++;
				}
				System.out.println("");
			}
			break;
		}
		case 3:
		{
			int k=1;
			for(int i=1;i<=10;i++)
			{
				for(int j=1;j<=4;j++)
				{
					System.out.print("["+k+"] ");
					k++;
				}
				System.out.println("");
			}
			break;
		}
		default:
			System.out.println("\nThere is no flights with your selected number");
		    break;
		
		}
		
		
		if(passenger>1) 
		{
			System.out.println("\nSelect "+ passenger +" seats ");
		}
		else
		{
			System.out.println("\nSelect "+ passenger +" seat ");
		}
		int seat[]=new int[passenger];
		for(int p=0;p<passenger;p++)
		{
			System.out.println(" Please Enter Seat Number for "+(p+1)+" Passenger: ");
			seat[p]=sc.nextInt();
			System.out.println("");
			
		}
		sc.nextLine();
		
		String name[]=new String[passenger];
		long mobileNo[]=new long[passenger];
		long aadhaar[]=new long[passenger];
		for(int p=0;p<passenger;p++)
		{
			System.out.println("\nPlease Enter Passenger "+(p+1)+" Detailes");

			System.out.print("\nEnter Name: ");
			name[p]=sc.nextLine();
			System.out.print("\nEnter Mobile Number: ");
			mobileNo[p]=Long.parseLong(sc.nextLine());
			
			System.out.print("\nEnter Aadhaar Number: ");
			aadhaar[p]=Long.parseLong(sc.nextLine());
			
		}
		System.out.println("\nThe passengers deatails are: ");
		for(int p=0;p<passenger;p++)
		{
			System.out.println("Passenger: "+(p+1));
			System.out.println("Seat No: "+seat[p]);
			System.out.println("Name: "+name[p]);
			System.out.println("Mobile Number: "+ mobileNo[p]);
			System.out.println("Aadhaar Number: "+aadhaar[p]);
			
		}
		
		
		
		
	
	}

}
