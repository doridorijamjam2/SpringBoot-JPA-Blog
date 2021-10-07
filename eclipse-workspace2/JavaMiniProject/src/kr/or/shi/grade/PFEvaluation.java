package kr.or.shi.grade;

public class PFEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String grade;
		
		if (score >= 60 && score <= 100)
			grade = "P";
		
		else
			grade = "F";		
			
		return grade;
	}

}

