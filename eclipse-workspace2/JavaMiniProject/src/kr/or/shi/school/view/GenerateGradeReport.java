package kr.or.shi.school.view;

import java.util.ArrayList;

import kr.or.shi.grade.BasicEvaluation;
import kr.or.shi.grade.GradeEvaluation;
import kr.or.shi.grade.MajorEvaluation;
import kr.or.shi.grade.PFEvaluation;
import kr.or.shi.school.School;
import kr.or.shi.school.Score;
import kr.or.shi.school.Student;
import kr.or.shi.school.Subject;
import kr.or.shi.utils.Constant;

public class GenerateGradeReport {
	
	School school = School.getInstance();
	public static final String TITLE = " 강의신청자 학점 >> \t\t\n";
	public static final String HEADER = " 이름  \t  |  학번  |   전공과목  \t   | 점수  \n";
	public static final String LINE = "--------------------------------------------\n";
	public static final String LINE2 = "============================================\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjects = school.getSubjects();
		for(Subject subject : subjects) {
			makeHeader(subject);
			makeBody(subject);
			
		}
		return buffer.toString();
	}
	
	public void makeHeader(Subject subject) {		
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE2);
	}
	
	
	public void makeBody(Subject subject) {
		ArrayList<Student> students = subject.getStudents();
		for(int i=0; i<students.size(); i++) {
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName() + "\t");
			buffer.append(" | ");
			GetScoreGrade(student, subject);
			buffer.append("\n");
			buffer.append(LINE);
			
		}
		
	}
	
	//학생별 해당과목 학점 계산
	public void GetScoreGrade(Student student, Subject subject) {
		ArrayList<Score> scores = student.getScores();
		int majorId = student.getMajorSubject().getSubjectId();
		int golfId = student.getgolfSubject().getSubjectId();
		
		//학점 평가 클래스들
		GradeEvaluation[] gradeEvaluations = 
					{new BasicEvaluation(), new MajorEvaluation(), new PFEvaluation()};
		
		//학생이 가진 점수들
		for(int i=0; i<scores.size(); i++) {
			Score score = scores.get(i);
			if (score.getSubject().getSubjectId() == subject.getSubjectId()) {
				String grade;
				
				if (score.getSubject().getSubjectId() == majorId) //전공과목인 경우
					grade = gradeEvaluations[Constant.SAB_TYPE].getGrade(score.getScore());  //전공과목 학점 평가	
			
				else if(score.getSubject().getSubjectId() == golfId)
					grade = gradeEvaluations[Constant.PF_TYPE].getGrade(score.getScore());  //전공과목 아닌 학점 평가
				else 
					grade = gradeEvaluations[Constant.AB_TYPE].getGrade(score.getScore());  //전공 학점 평가
			
				
				buffer.append(score.getScore());
				buffer.append(" : ");
				buffer.append(grade);
				buffer.append(" | ");	
				
			}
		}		
	}
	
	
	
}
















