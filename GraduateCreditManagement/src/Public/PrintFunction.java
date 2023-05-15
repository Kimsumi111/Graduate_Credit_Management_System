package Public;

import Private.User;

interface PrintFunction
{
	public void Option(int n);
	public void Error(int n);
	public void Guide(int n);
	public void User(User User);
	public int User(User User, int n,String Str);
	public int User(User User, int n);
	public int User(User User, String Str);
	public void Requ(Requ Requ, int n);
}
