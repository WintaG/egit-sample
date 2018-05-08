package lesson2_Prob2C;

import java.util.ArrayList;
import java.util.List;

public class Student {
	List<Section> sections;
	public String name;
	
	public Student(String name,List<Section> sections ) {
		this.name= name;
		this.sections= sections;
	}

	public List<Section> getSections() {
		return sections;
	}

	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		List<Section> sList = new ArrayList<>();
		Student st = new Student("Winta", sList);
		System.out.println(st.getName());
		
		List<Student> stList= new ArrayList<>();
		Section se = new Section(23,stList );
		System.out.println(se.getSectionNum());

	}

}
