package program;

import java.util.Scanner;

import entitie.Pension;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pension[] pension = new Pension[10];
		
		System.out.println("How many rooms will be rented ? ");
		int quantityRooms = sc.nextInt();
		
		for(int c = 1; c <= quantityRooms; c++) {
			System.out.println("Rent #" + c + ":\nName: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.next();
			
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			pension[room] = new Pension(room, name, email);
		}
		
		for(int c = 0; c < pension.length; c++) {
			if(pension[c] != null) {
				System.out.println(pension[c].getBedroom()+ ": " + pension[c].getName() + ", " + pension[c].getEmail());
			}
			
		}
		
		sc.close();
	}
}