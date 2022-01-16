package Week3.day;

public class StudentDetails extends Department{

	public void studentName() {
		System.out.println("Nirmal");
	}
	
	public void studentId() {
		System.out.println("Id-17-uph-329");
	}
	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.collegeCode();
		sd.collegeName();
		sd.collegeRank();
		sd.deptName();
		sd.studentId();
		sd.studentName();
	}
	}