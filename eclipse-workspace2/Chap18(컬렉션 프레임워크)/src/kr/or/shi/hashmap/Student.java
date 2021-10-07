package kr.or.shi.hashmap;

import java.util.Objects;

public class Student {

	private int sno;
	private String name;
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(this.sno, this.name);
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return this.sno == student.sno && this.name.equals(student.name);
		}
		return super.equals(obj);
	}
}
