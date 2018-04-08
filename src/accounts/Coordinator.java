package accounts;

import schedualing.Job;

//account for coordinator user
public class Coordinator extends Account{

	public Coordinator(String login, String pWord) {
		super(login, pWord);
		}
	
	public void showCasuals() {
		//shows all Casuals in system
	}
	public void showsOpenings(Staff staff) {
		//Shows openings in a staffs timetable 
	}
	public void assignStaff(Staff staff, Job job) {
		//assign a staff to a job
	}
}
