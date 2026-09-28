/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        int large = 256;
        int small = 0;
        int r = (int)(Math.random() * (large-small) + small);
        int g = (int)(Math.random() * (large-small) + small);
        int b = (int)(Math.random() * (large-small) + small);
        System.out.println("Random color: rgb" + "(" + r + "," + g + "," + b + ")");
        getColor (r,g,b);
        int num1 = (255-r);
        int num2 = (255-g);
        int num3 = (255-b);
        System.out.println("Complementary Color: rgb" + "(" + num1 + "," + num2 + "," + num3 + ")");
        getColor (num1,num2,num3);
        
        System.out.println("Triadic Colors");
        getColor (r,g,b);
        getColor (b,r,g);
        getColor (g,b,r);

        int big = 128;
        int rr = (int)(Math.random() * (big-small) + small);
        int gg = (int)(Math.random() * (big-small) + small);
        int bb = (int)(Math.random() * (big-small) + small);
        System.out.println("Dark Color");
        getColor (rr,gg,bb);







		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
       

    }
}
