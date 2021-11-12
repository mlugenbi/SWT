package exercise2;

public class Exam {
	public int max_value;
	public Course course[];
	public Question questions[];
	//many to many, 0..*
	public Student student[];
	public Exam exam;
	
	
	
	public Exam() {

		//one to many
		course = new Course[1];
		
		exam = new Exam();
		
		
	}
	
	public boolean register(Student s) {
		return false;
		
	}
	
	public void addQuestion(int id, String task, int value) {
		
	}
	
	public Student[] getRegisteredStudents() {
		return student;
		
	}
	
	public void setMaxValue(int max) {
		this.max_value = max;
	}
	
	
	//composition
	public void deleteExam() {
		
		for(int i = 0; i < questions.length; i++) {
			
			questions[i] = null;
		}
		
		exam = null;
		
	}

}
