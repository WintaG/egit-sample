package lesson2_Prob2A;

public class Student {
	private String name;
	GradeReport report;

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public GradeReport getReport() {
		return report;
	}

	public static void main(String[] args) {
		Student st = new Student("Winta");
		System.out.println(st.getName());

		GradeReport report = new GradeReport(new Student("Winta"));
		System.out.println(report.getStudent().getName());
	}
}
