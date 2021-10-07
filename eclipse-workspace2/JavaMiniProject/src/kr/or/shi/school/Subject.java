package kr.or.shi.school;

import java.util.ArrayList;

import kr.or.shi.utils.Constant;

public class Subject {
	private int subjectId;				//과목 고유번호
	private String subjectName;			//과목 이름
	private int gradeType;				//학점 부여 방식 (기본은 A~F 방식)
	private ArrayList<Student> students = new ArrayList<>();	//과목 수강신청한 학생들
	
	public Subject(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Constant.AB_TYPE;
	}
	
	public void register(Student student) {			//수강신청
		students.add(student);
	}

	public int getSubjectId() {
		return subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public int getGradeType() {
		return gradeType;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}
	
	
	
	
	
	

}
