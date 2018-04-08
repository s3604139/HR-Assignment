package accounts;
//Parent Class to all account types
public abstract class Account {
	public String _Login;//public username, for login system
	protected String _PWord;//security password, for login system
	public Account(String login, String pWord)
	{
		_Login=login;
		_PWord=pWord;
	}
	public boolean login(String input)/*compares input to password*/ {
		if (input.equals(_PWord))
		{
			return true;
		}
		else
		return false;
		
	}
}
