import accounts.*;
import schedualing.*;

public class Application {

	public static void main(String[] args) {
	User_Interface system=new User_Interface();
	system.accounts.addAccount(new Admin("login","pword"));
	system.accounts.addAccount(new Staff("staff","pword"));
	
	for(Account account:system.accounts.accounts)
	{
		System.out.println(account._Login);
	}
	System.out.println("'Schedual' for schedual");
	system.login();
	system.ShowSchedual(system.schedual);
	}
}
