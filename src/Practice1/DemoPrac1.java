package Practice1;

public class DemoPrac1 {
	
	public static void main(String[] args) {
		
		add(19, 61, "Fakhria", "Barkzai");

		System.out.println("****************");
		
	    classInfo("Edris", "Barkzai", "NoorTeck", 2023, 2001);
	
}
		 
	
	
	static void add(int a, int b, String name, String lastName) {
		
		
		System.out.println("Name :" + name); 
		System.out.println("Last Name :" + lastName); 
		
		System.out.println(a + b);
		System.out.println("LIFE IS EASY WITHOUT MATH");	
		
		
	}
	
	 static void classInfo(String name, String lastName, String className, int year, int dateOfBirth) {
		
		System.out.println("Name: " + name);
		System.out.println("Last Name: " + lastName);
		System.out.println("Class Name: " + className);
		System.out.println("Year: " + year);
		System.out.println("DOB: " + dateOfBirth);
		
	}
	

}

