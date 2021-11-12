package exercise2;

public class Student {
	
	public String name;
	public int StudentId;
	public Project project[];
	public Course courses[];
	public Exam exam[];
	
	public Student() {
		
	
	}
	
	public String getName() {
		return name;
		
	}
	
	public Project getProjects() {
		return project[0];
		
	}

}
