import java.util.*;

import accounts.*;
import request.*;
import reports.*;
import schedualing.*;

@SuppressWarnings("unused")
public class User_Interface{
	public String currentAccount;
	public Accounts accounts;//list of all accounts
	public RequestHandler requestHandler;//list of requests
	public Schedual schedual;//schedual class
	public Logs logs;//log of all past reports
	
	public User_Interface() {
		StartUp();
	}
	
	public void ShowSchedual(Schedual schedual) {
		//formats schedual into readable data
		Scanner scan = new Scanner(System.in);  // Reading from System.in
		boolean loopS = true;
		do {
			String n = scan.next();
		if (n.contains("Schedual")){
		System.out.print(schedual);
		loopS = false;
		}else{
			System.out.print("Enter a valid request");
		}
		}while (loopS==true);
	}
	public void ShowTimetable(Staff staff) {
		//formats timetable for current account
	}
	public void ShowRequests(RequestHandler requestHandler) {
		//formats requests for current account
	}
	public void login() {
		Account account = null;
		boolean loop=true;
		Scanner scan = new Scanner(System.in);  // Reading from System.in
		System.out.print("User Name>");
		do {
		String n = scan.next(); // Scans the next token of the input as a string
		
		if (SearchAccount(n)==null) 
			System.out.print("Re-Enter User Name>");
		else {
			account=SearchAccount(n);
			loop=false;
			}
			
		}while(loop==true);
		do {
			System.out.print("Password>");
			
			String n = scan.next(); // Scans the next token of the input as a string
			
			if (account.login(n)!=false) {
			currentAccount=account._Login;
			System.out.print("Password Accepted");
			loop=false;}
			else
				System.out.print("Password Rejected");
			}while(loop==true);
		
		scan.reset();
	}
	public void CreateRequest() {
		//process of creating a job assignment request
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		if (n.contains("CretReq")){
			System.out.print("Requests!");
			n = scan.next();
		}else{
			System.out.print("yay!");
		}
		
		
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
	private Account SearchAccount(String query) {
		Account result=null;
		for(Account account:accounts.accounts)
		{
			//System.out.print("does "+query+"="+account._Login);
			if(query.toLowerCase().equals(account._Login.toLowerCase()))
			{
				result=account;
			}
		}
		return (result);
	}
}
