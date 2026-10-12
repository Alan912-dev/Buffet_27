/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Welcome to the Ascil Museum!");
		System.out.println("Please select what exhibit you'd like to view.");
		System.out.println("1. Food");
		System.out.println("2. DC characters");
		System.out.println("3. Marvel characters");

		Scanner sc = new Scanner(System.in);
		String exhibit = sc.nextLine();

		if(exhibit.equals("Food") || exhibit.equals("food")){
           System.out.println("1. Burger");
		   System.out.println("2. Pizza");
		   String exhibit2 = sc.nextLine();
		   if(exhibit2.equals("Burger")){
			System.out.println("::::::::::::::::::::");
			System.out.println(":::::=#%%%##*+=-::::");
			System.out.println(":::-****##**+-#::-::");
			System.out.println("::-##*+*#****=*+=-:-");
			System.out.println(":#%#########%%##*#-=");
			System.out.println("-%###%*+==+*#+++=#+*");
			System.out.println("=#++*+=+*+-----=+%##");
			System.out.println("%@#++####+*+-=+-=**+");
			System.out.println("#=*====-+==+=-=::+##");
			System.out.println("--------::-::-:-==++");
			System.out.println("####***********++==+");
		   }
		   else if(exhibit2.equals("Pizza")){
			System.out.println("         _....._");
			System.out.println("     _.:`.--|--.`:._");
			System.out.println("   .: .'\\o  | o /'. '.");
			System.out.println("  // '.  \\ o|  /  o '.\\");
			System.out.println(" //'._o'. \\ |o/ o_.-'o\\");
			System.out.println(" || o '-.'.\\|/.-' o   ||");
			System.out.println(" ||--o--o-->|<o-----o-||");
			System.out.println("  \\  o _.-'/|\\'-._o  o//");
			System.out.println("   \\.-'  o/ |o\\ o '-.//");
			System.out.println("   '.'.o / o|  \\ o.'.'");
			System.out.println("     `-:/.__|__o\\:-'");
			System.out.println("         `--=--`");
		   }

		}
		else if(exhibit.equals("Marvel characters")){
           System.out.println("1. Spider man");
		   System.out.println("2. Iron man");
		   String exhibit3 = sc.nextLine();
		   if(exhibit3.equals("Spider man")){
			System.out.println(".............::::.............");
			System.out.println("....::-=-:...*++#-::-++-::....");
			System.out.println("...:***####*+=+*=+*##%****:...");
			System.out.println("....:-:..:+#####%#%+:.:-:-:...");
			System.out.println("...........-*##%##*..:::......");
			System.out.println("....:**%@%*==%%%%%+**%%*+:....");
			System.out.println(".....-%@@%@%%%#*%%@@%%@#-.....");
			System.out.println("......:*@@#%@@@%@@%#@@*:......");
			System.out.println("...........=*=::+*=:..........");
			System.out.println(".........:--=+==+-=--:........");
			System.out.println("........--------=--::-:.......");
			System.out.println("........:::::....:::-:........");
		   }
		   else if(exhibit3.equals("Iron man")){
			System.out.println("..............................");
			System.out.println(".........-#%%@%=..............");
			System.out.println(".*@#*...:+%@@@%%*.............");
			System.out.println(".+%%%*---=#%%%%#:...=%:.-#:...");
			System.out.println("...:++##:=*####%%:..##:#%+....");
			System.out.println(".....=%#:+*=-=#%%%**##%%*+%%:.");
			System.out.println("......*#+#++%@%#%##*+*####-=+:");
			System.out.println(".....:#%%%#%##*%%*=...=*#%%*..");
			System.out.println("......*%%%#%%##*%#*=:-+#*.....");
			System.out.println("......:.+%###%%#%%%###%=:.....");
			System.out.println(".....-**#%%##%@%#*%@%%+:......");
			System.out.println("...-***@%%%*%@@%=.::::........");
			System.out.println("..:#%%%@@#%@%@%:..............");
			System.out.println(".:==%%@#:..%@=................");
			System.out.println(".=+%@*........................");
			System.out.println(".:*%#.........................");
			System.out.println("..............................");

		   }
		}
		else if(exhibit.equals("DC characters")){
           System.out.println("1. Batman");
		   System.out.println("2. Superman");
		   String exhibit4 = sc.nextLine();
		   if(exhibit4.equals("Batman")){
			System.out.println("  .:=*.    ....   .::....");
			System.out.println(" :%%%#*:.. =%=....-%%##- ");
			System.out.println(":@%@%%%%##%@@#%*%#%@@@%%-");
			System.out.println(".....:@%@@@@@*##=#@*.....");
			System.out.println("      .  .-@%@=....      ");
			System.out.println("           .=.           ");
		   }
		   else if(exhibit4.equals("Superman")){
			System.out.println("....................");
			System.out.println("...--------------...");
			System.out.println(".=+-+*=:::::-****+=.");
			System.out.println("+-:***=-::::::===:-+");
			System.out.println(".=*************+:+=.");
			System.out.println("...+=-=====++***+...");
			System.out.println("....-****=:::=*-....");
			System.out.println("......+*====*+:.....");
			System.out.println(".......:+::+:.......");
			System.out.println(".........=+.........");
			System.out.println("....................");

		   }
		}
		else{
			System.out.println("This exhibit is not in our museum, bye!");
		}
	}
}
