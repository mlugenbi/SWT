package exercise2;

public class Project {
	public String name;
	public Student members[];
	public Course course;
	
	
	public Project() {
		//aggregation
		members[0] = new Student();
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String n) {
		
		this.name = n;
	}

	public void addNewMember(Student s) {
		
	}
	
	public Student[] getMembers() {
		
		return members;
	}
}
