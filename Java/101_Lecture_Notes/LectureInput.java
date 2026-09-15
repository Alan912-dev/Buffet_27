/*
    Lecture note example - Input!!
*/

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        System.out.println("Welcome to Fredbear's Family Dinner!");
double item1Price = 3.95;
double item2Price = 5.00;
double item3Price = 7.50;
System.out.println("Here's our menu:");
System.out.println("1. 99 flavors of cheese pizza - " + item3Price);
System.out.println("2. Pepperoni pizza - " + item1Price);
System.out.println("3. Shrimp pizza - " + item2Price);

Scanner sc = new Scanner(System.in);
System.out.println("Who is purchasing?");
String name = sc.nextLine();
System.out.println("How many 99 flavors of cheese pizza would you like?");
int item3Amt = sc.nextInt();
System.out.println("How many Pepperoni pizza would you like?");
int item1Amt = sc.nextInt();
System.out.println("How many Shrimp pizza would you like?");
int item2Amt = sc.nextInt();

double item3Total = item3Price * item3Amt;
double item1Total = item1Price * item1Amt;
double item2Total = item2Price * item2Amt;
System.out.println("Total is: " + (itemTotal + item2Total + item3Total));
	}
}
