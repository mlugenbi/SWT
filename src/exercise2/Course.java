package exercise2;

public class Course {
	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	public Professor prof[];
	public Student students[];
	
	public Exam exam[];
	public TA tA[];
	
	
	public Course( int id,int cap, String name, Professor prof) {
		
		//1..* multiplicity
		exam[0] = new Exam();
		
	}
	
	public void Enroll(Student student) {
		
		
	}
	
	public void Apply(TA ta) {
		
	}
	
	public void setMaxCap(int max) {
		this.maxCapacity = max;
	}
	
	public Professor getProf() {
		return prof[0];
	}
	
	public TA getTA() {
		return tA[0];
	}
	
	public void setNewTA(TA ta) {
		
	}
	
	public void setName(String s) {
		this.name = s;
	}

}
