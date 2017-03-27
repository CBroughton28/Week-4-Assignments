import java.util.*;

public class TheCourseClass {

		private static Scanner input;

		public static void main(String[] args) 
		{ 
			input = new Scanner(System.in); 
			 Course CourseJava = new Course(); 
			 System.out.print("Enter the course name: "); 
			 String bill = input.nextLine();  
			 CourseJava.setCourse(bill); 
		System.out.print("Enter the number of Students that you would like to add: "); 
			 int x = input.nextInt(); 
			 input.nextLine(); 
		System.out.print("Enter the names of the students: "); 
			 for (int i = 0 ; i < x ; i++){ 
			 String Names = input.nextLine(); 
			 CourseJava.addStudent(Names); 
} 
		System.out.print("\nThe names of the students in this class are: " + CourseJava.getStudents()); 
		System.out.print("\nEnter the name of the student you would like to drop: "); 
			 String Name =input.nextLine();  
			 CourseJava.dropStudent(Name); 
		System.out.print("\nThe names of the students in the class now are: " +CourseJava.getStudents()); 
		System.out.print("\nThe number of students in the class are: " + CourseJava.getNumberOfStudents()); 
	} 
			 
			 
	} 
		class Course{ 
			 private String courseName; 
			 private ArrayList<String> students = new ArrayList<String>(3); 
			 private int numberOfStudents; 
			 	 
			 Course(){ 
		numberOfStudents= 0; 
	} 
		public void setCourse(String courseName) { 
			 this.courseName = courseName; 
	} 
			 	 
		public void addStudent(String student) { 
			 students.add(student); 
			 numberOfStudents++; 
	} 
			 	 
		public ArrayList<String> getStudents() { 
			 return students; 
	} 
			 	 
		public int getNumberOfStudents() { 
			 return numberOfStudents; 
	} 
			 	 
		public String getCourseName() { 
			 return courseName; 
	} 
			 	 
		public void dropStudent(String student) { 
			 students.remove(student); 
			 numberOfStudents--; 
	} 
		public void clear(){ 
			 students.clear(); 
} 		 
			 
} 
