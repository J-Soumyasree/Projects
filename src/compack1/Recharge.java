package compack1;

public class Recharge {
	void rechargeplan(int plan, String network)
	{
		switch(plan)
		{
		case 99:
	        System.out.println("Validity: 14 days, Data: 1GB/day");
	        break;
	    case 219:
	        System.out.println("Validity: 28 days, Data: 2GB/day SMS: 300");
	        System.out.println("you have successfully unlocked Free Hellotunes for you for 30 days");
	        break;
	    case 349:
	        System.out.println("Validity: 28 days, Data: 2GB/day, SMS: 100/day");
	        System.out.println("you have successfully unlocked JioHotstar Moble for 28 days");
	        System.out.println("Perolexity Pro AI for 12 MONTHS");
	        break;
	    case 1199:
	        System.out.println("Validity: 84 days, Data: 2.5/day");
	        System.out.println("you have successfully unlocked Amazon Prime Video and Aha Premium for 84 days");
	    case 2499:
	        System.out.println("Validity: 365 days, Data: 2GB/day, SMS: 300/day");
	        System.out.println("you have successfully unlocked Amazon Prime Video, Netflix, Aha for year");

	    default:
	        System.out.println("Invalid plan.");
		}
		switch(network) {
        case "JIO","jio":
            System.out.println("You got Jio Rewards: 5GB bonus!");
            break;

        case "AIRTEL","airtel":
            System.out.println("You got Airtel Thanks Benefits!");
            break;

        case "BSNL","bsnl":
            System.out.println("Your BSNL Recharge successful");
            break;

        default:
            System.out.println("Unknown network.");
		}

	}
	public static void main(String[] args) 
	{
		new Recharge().rechargeplan(219, "AIRTEL");
	}
}
