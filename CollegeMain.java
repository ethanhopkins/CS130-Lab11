package Lab11;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("John", "1234 Lincoln ave.", "Computer Science", 22);
		Department d = new Department("Computer Science", "Student");
		College c = new College("Bellarmine University", "Bellarmine Blvd.", s, d);
		
		System.out.println("----Student Info----");
			System.out.println("Name: " + s.name + "\n" 
						+ "Address: " + s.address + "\n"
							+ "Department: " + s.dept + "\n"
								+ "Age: " + s.age + "\n\n");
			
		System.out.println("----Department Info----");
			System.out.println("Department Name: " + d.name + "\n"
					+ "Department Chair: " + d.chair + "\n\n");
			
		System.out.println("----College----");
			System.out.println("College Name: " + c.name + "\n"
					+ "College Address: " + c.address + "\n"
						+ "Student: " + s.name + "\n"
							+ "Department: " + d.name);
	}

}
