package cv;

import java.util.Map;
import java.util.Scanner;

public class TUICV {
	
	private CV cv;
	private Scanner scanner;

	public TUICV(CV cv) {
		this.cv = cv;
		scanner = new Scanner(System.in);
		
		setUpJobs();
	}
	
	private void setUpJobs() {
		System.out.println("Enter the details of the job for this recruitment.");
		
		System.out.println("Enter the details of this job... ");
		System.out.print("Name of job: ");
		String name = scanner.nextLine();
		String prompt = "Yearly salary: ";
		System.out.print(prompt);
		int value = getInt(prompt);
		cv.addPrize(name, value);
	}

	public void Applicants() {
		System.out.println("Applicant's name: ");
		String buyer = scanner.nextLine();
		
		String prompt = "Rate it ";
		System.out.println(prompt);
		int ratings = getInt(prompt);
		
		while (ratings > 0) {
			cv.sellTicket(buyer);
			ratings--;
		}
	}
	
	public void results() {
		System.out.println(cv.title() + '\n' + "The winners are... ");
		
		Map<Job, Rate> winners = cv.luckyDraw();
		
		for (Map.Entry<Job, Rate> map : winners.entrySet()) {	
			Job job = map.getKey();  	
			Rate winner = map.getValue(); 
			
			System.out.println(job.toString() + " goes to " + winner.buyer());
		}
		System.out.println("Many Congratulations!!");
	}

	private int getInt(String prompt) {
		try {
			return Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("The value must be a whole number." + prompt);
			return getInt(prompt);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("> Setting up the job...");
		TUICV tui = new TUICV(new CV("ThinkTechnology"));
		
		System.out.println("> Applicants...");
		for (int i = 0; i < 3; i++) {
			tui.Applicants();
		}
		
		System.out.println("> Reviewing CVs...");
		tui.results();
	}
}
