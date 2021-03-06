package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Room[] room = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n=sc.nextInt();
		System.out.println();
		
		for (int i=0; i<n;i++) {
			System.out.println("Rent #"+(1+i)+":");
			
			System.out.print("Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("E-mail:");
			
			String email=sc.nextLine();
	
			System.out.print("Room:");
			
			int nroom =sc.nextInt();
			
			room[nroom]= new Room(name,email);
			System.out.println();
		}
		System.out.println("Busy rooms:");
		
		for (int i=0;i<room.length;i++) {
			if (room[i]!=null) {
				System.out.println(i+": "+room[i].toString());
			}
		}
		
    sc.close();
	}

}
