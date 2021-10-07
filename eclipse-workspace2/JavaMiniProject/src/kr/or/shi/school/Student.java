package kr.or.shi.school;

import java.util.ArrayList;

public class Student {
	
	private int studentId;			//학번
	private String studentName;		//이름
	private Subject majorSubject;	//전공과목
	private Subject golfSubject;	//골프과목
	private ArrayList<Score> scores = new ArrayList<>();	//학생의 성적리스트
	
	public Student(int studentId, String studentName, Subject majorSubject, Subject golfSubject) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
		this.golfSubject = golfSubject;
	}
	
	//과목 점수를 컬렉션에 추가함
	public void addSubjectScore(Score score) {
		scores.add(score);
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}
	public Subject getgolfSubject() {
		return golfSubject;
	}

	public ArrayList<Score> getScores() {
		return scores;
	}
	
	
	
	
	
	
	
	
	

}
