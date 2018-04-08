import accounts.*;
import request.*;
import reports.*;
import schedualing.*;

public class User_Interface{
	//add variable to refrence current account
	public Accounts accounts;//list of all accounts
	public RequestHandler requestHandler;//list of requests
	public Schedual schedual;//schedual class
	public Logs logs;//log of all past reports
	
	public User_Interface() {
		StartUp();
	}
	
	public void ShowSchedual(Schedual schedual) {
		//formats schedual into readable data
	}
	public void ShowTimetable(Staff staff) {
		//formats timetable for current account
	}
	public void ShowRequests(RequestHandler requestHandler) {
		//formats requests for current account
		//test
		//test 2
		//test 3 xD
	}
	public void login() {
		//walk through the login process
		//get login(search through all accounts)
		//get password(login function from account)
	}
	public void CreateRequest() {
		//process of creating a job assignment request
	}
	public void CreateReport() {
		//generates a report of system
	}
	public void ShowMenu(Account account) {
		//shows menu of options for each account
	}
	public void StartUp() {
		//for first time initialisation 
		accounts = new Accounts();
		requestHandler = new RequestHandler();
		schedual = new Schedual();
		logs = new Logs();
	}
	//utility methods
	private void AddAccount(Account account) {
		accounts.addAccount(account);//adds account to the list
	}
}
