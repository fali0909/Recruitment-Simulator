package cv;

public class Job {
	private String name;
	private int value;
	
	public Job(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public String name() {
		return name;
	}
	
	public int value() {
		return value;
	}
	
	public String toString() {
		return "Job: " + name + ", salary: £" + value + '\n';
	}
}
