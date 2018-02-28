import java.util.*;
public class PhoneBook {
	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		boolean run = true;
		
		while (run) {
			System.out.println("Add or Search?");
			Scanner scnr = new Scanner(System.in);
			String option = scnr.next().toLowerCase();
			
			if (option.equals("add")) {
				int newEntries;
				System.out.println("How many entries would you like to make?");
				newEntries = scnr.nextInt();
				//String name;
				//int phoneNum;
				
				for (int i = 0; i < newEntries; i++) {
					System.out.println("Name of entry # " + i + ": ");
					String name = scnr.next();
					System.out.println("Phone number of entry # " + i + ": ");
					int phoneNum = scnr.nextInt(s)
					
					phoneBook.put(name, phoneNum);
					
				}
				
				System.out.println("All entires added.");
			} else if (option.equals("search")) {
				
			} else {
				System.out.println("Unrecognized input. Please specify 'add' or 'search'");
			} 
			
			
		}
		
	}
}