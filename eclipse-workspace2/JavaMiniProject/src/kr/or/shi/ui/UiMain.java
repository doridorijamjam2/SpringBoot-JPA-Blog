package kr.or.shi.ui;

import kr.or.shi.school.School;
import kr.or.shi.school.Score;
import kr.or.shi.school.Student;
import kr.or.shi.school.Subject;
import kr.or.shi.school.view.GenerateGradeReport;
import kr.or.shi.utils.Constant;

public class UiMain {
	School sctSchool = School.getInstance();
	Subject operatingSystem;
	Subject math;
	Subject golf;
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		
		UiMain uiMain = new UiMain();
		
		uiMain.createSubject();
		uiMain.createStudent();
		
		String report = uiMain.gradeReport.getReport();
		System.out.println(report);
		
		
	}

	//시험 과목 생성
	public void createSubject() {
		operatingSystem = new Subject(Constant.OPERATING_SYSTEM, "운영체제");
		math = new Subject(Constant.MATH, "수학");
		golf = new Subject(Constant.Golf, "골프");
		
		sctSchool.addSubject(operatingSystem);
		sctSchool.addSubject(math);
		sctSchool.addSubject(golf);
		
	}
	
	//시험 학생 생성
	public void createStudent() {
		Student student1 = new Student(20210916, "스티브잡스",operatingSystem , golf);
		Student student2 = new Student(20211017, "이순신",math, golf);
		Student student3 = new Student(20211118, "리누스토발즈",operatingSystem, golf);
		Student student4 = new Student(20211216, "제임스고슬링",operatingSystem, golf);
		Student student5 = new Student(20220116, "이도",math, golf);
		
		sctSchool.addStudent(student1);
		sctSchool.addStudent(student2);
		sctSchool.addStudent(student3);
		sctSchool.addStudent(student4);
		sctSchool.addStudent(student5);
		
		operatingSystem.register(student1);
		operatingSystem.register(student2);
		operatingSystem.register(student3);
		operatingSystem.register(student4);
		operatingSystem.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		golf.register(student1);
		golf.register(student2);
		golf.register(student3);
		
		
		this.addScoreForStudent(student1, operatingSystem, 95);
		this.addScoreForStudent(student1, math, 56);
		this.addScoreForStudent(student1, golf, 80);
		
		this.addScoreForStudent(student2, operatingSystem, 95);
		this.addScoreForStudent(student2, math, 95);
		this.addScoreForStudent(student2, golf, 85);
		
		this.addScoreForStudent(student3, operatingSystem, 100);
		this.addScoreForStudent(student3, math, 88);
		this.addScoreForStudent(student3, golf, 55);
		
		this.addScoreForStudent(student4, operatingSystem, 89);
		this.addScoreForStudent(student4, math, 95);
		
		this.addScoreForStudent(student5, operatingSystem, 83);
		this.addScoreForStudent(student5, math, 56);
		
		
	}
	
	//과목별 성적 입력
	public void addScoreForStudent(Student student, Subject subject, int score) {
		
		Score score1 = new Score(student.getStudentId(), subject, score);
		student.addSubjectScore(score1);
		
	}


	

}




