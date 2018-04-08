package accounts;

import request.*;
import schedualing.*;

public class Staff extends Account{
	public StaffTimetable staffTimetable;
	
	public Staff(String login, String pWord) {
		super(login, pWord);
		}
	public void showRequests(){
		//shows all requests for this account
	}
	public void acceptAssignment(Request request) {
		//accepts given assignment
	}
	public void denyAssignment(Request request) {
		//deny given assignment
	}
}
