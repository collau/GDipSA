package model;

public class Student {

	private int studentID;
	private String studentName;
	private String nickName;
	
	public Student(int studentID, String studentName, String nickName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.nickName = nickName;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub

	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", nickName=" + nickName + "]";
	}
	
	
	
	
	
}
