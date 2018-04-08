package accounts;
//account for the admin user
public class Admin extends Account {
	
	public Admin(String login, String pWord) {
		super(login, pWord);
		}
	public void prepareSemester() {
	//prepares the semester for use
	}
	public void generateReport() {
	//for getting data while system is running	
	}
	public void changePword(Account account, String newPWord) {
	//changes password of selected account
	}

	
}
