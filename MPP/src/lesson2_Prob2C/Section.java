package lesson2_Prob2C;

import java.util.List;

public class Section {
	public int sectionNum;
	List<Student> students;

	public Section(int sectionNum, List<Student> students) {
		this.sectionNum = sectionNum;
		this.students = students;

	}

	public int getSectionNum() {
		return sectionNum;
	}

	public List<Student> getStudents() {
		return students;
	}

}
