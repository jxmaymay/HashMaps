import java.util.*;
public class PhoneBook {
	public static void main(String[] args) {
		Map<String, Double> phoneBook = new HashMap<String, Double>();
		
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
					System.out.println("Name of entry # " + (i + 1) + ": ");
					String name = scnr.next();
					System.out.println("Phone number of entry # " + (i + 1) + ": ");
					double phoneNum = scnr.nextDouble();
					
					phoneBook.put(name, phoneNum);
					
				}
				
				System.out.println("All entires added.");
			} else if (option.equals("search")) {
				System.out.println("Who's number would you like to search for?");
				String searchName = scnr.next();
				double foundNum;
				boolean found = false;
				phoneBook.forEach((String, Double) -> if (searchName.equals(String) {
					found = true;
					foundNum = Double;
					
				});
			} else {
				System.out.println("Unrecognized input. Please specify 'add' or 'search'");
			} 
			
			
		}
		
	}
}