package Practice_programing;

import java.util.Scanner;

public class RECTANGUALR_SQURE {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenth :");
		int length=sc.nextInt();
		System.out.println("Enter the breth :");
		int breth=sc.nextInt();
		if(length==breth){
			System.out.println("There length and breath is same so its a squre");
		}
		else {
			System.out.println("it is a rectangular");
		}
		
	}

}
