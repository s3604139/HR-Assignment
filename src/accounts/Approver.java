package accounts;
//account for the approver user
public class Approver extends Account {

	public Approver(String login, String pWord) {
		super(login, pWord);
		}
	public void showRequests() {
		//shows THIS approvers requests
	}
	public void acceptRequest(/*add request class here*/) {
		//accepts a request and begins the assignment process
	}
	public void denyRequest(/*add request class here*/) {
		//denies requests and alerts the coordinator
	}
}
