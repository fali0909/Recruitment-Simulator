package cv;

import java.util.HashMap;
import java.util.Map;

public class CV {
	
private String title;
	
	private Database<Job> jobs;
	private Database<Rate> rate;
	
	public CV(String title) { 
		this.title = "Job for " + title;
		jobs = new Database<>();
		rate = new Database<>();
	}

	public String title() {
		return title;
	}
	
	public void addPrize(String name, int value) {
		jobs.put(new Job(name, value));
	}
	
	public void sellTicket(String buyer) {
		rate.put(new Rate(buyer));
	}
	
	public Map<Job, Rate> luckyDraw() {
		Map<Job, Rate> winners = new HashMap<Job, Rate>();
		
		for (Job job : jobs) {
			if (!jobs.isEmpty()) {
				winners.put(job, rate.draw());
			}
			else {
				return winners;
			}
		}
		
		return winners;
	}
}
