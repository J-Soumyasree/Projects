package compack1;

public class Ticket 
{
	int meth1(int age,char seat,int week)
	{
		int price;
		if(seat=='R')
		{
			price=200;
		}
		else if(seat=='P')
		{
			price=300;
		}
		else
		{
			System.out.println("invalid seat type");
			return 0;
		}
		
		int cost=price;
		
		if(age<5)
		{
			System.out.println("free");
			cost=0;
		}
		else if(age>=5 && age<=12)
		{
			cost=price-(price*50)/100;
			System.out.println("congratulations you got 50% discount");
		}
		else if(age>=13 && age<=60)
		{
			cost=price;
			System.out.println("you got no discount");
		}
		else if(age>60 && age<=100)
		{
			cost=price-(price*30)/100;
			System.out.println("congratulations you got 30% discount");
		}
		if(week==0 && cost>0)
		{
			cost=cost+50;
		}
		System.out.println("Your ticket price is : "+cost);
		return 0;
	}
	public static void main(String[] args) 
	{
		new Ticket().meth1(10, 'R', 0);
		
	}
}




