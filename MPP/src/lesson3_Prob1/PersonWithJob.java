package lesson3_Prob1;

public class PersonWithJob {
	Person p1;
	private double salary;

	public double getSalary() {
		return salary;
	}

	PersonWithJob(Person p1, double s) {
		salary = s;
		this.p1= p1;
	}

	@Override
	public boolean equals(Object aPerson) {
		if (aPerson == null)
			return false;
		if (aPerson.getClass() != this.getClass())
			return false;
		PersonWithJob p = (PersonWithJob) aPerson;
		return (p.getClass().equals(p1.getClass()) && this.getSalary() == p.getSalary());
	}

	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob(new Person("Joe"), 30000);
		Person p2 = new Person("Joe");
		// As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}
