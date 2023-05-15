package Private;

import Protected.UserForm;
import Public.Requ;

public class User extends UserForm
{
	public User() {}
	public User(int Id, String Password)
	{
		this.Id = Id;
		this.Password = Password;
	}
	public int getInt(String Str, int n)
	{
		switch (Str)
		{
			case "Id" :
				return this.Id;
			case "UserLevel" :
				return this.UserLevel;
			case "Level" :
				return this.Level[n];
			case "Code" :
				return this.Code[n];
			case "Admi" :
				return this.Id/1000000;
			default :
				return -1;
		}
	}
	public String getString(String Str, int n)
	{
		switch (Str)
		{
			case "Password" :
				return this.Password;
			case "Major" :
				return this.Major;
			case "ClassName" : 
				return this.ClassName[n];
			case "UserTerm" :
				return this.UserTerm;
			case "Classify" :
				return this.Classify[n];
			case "Term" :
				return this.Term[n];
			default :
				return null;
		}
	}
	public double getDouble(String Str, int n)
	{
		switch (Str)
		{
			case "Credit" :
				return this.Credit[n];
			case "Grade" :
				return this.Grade[n];
			default :
				return -1;
		}
	}
	public Requ getRequ(String Str)
	{
		switch (Str)
		{
			case "Requ" :
				return this.UserRequ[0];
			default :
				return null;
		}
	}
	public void setInt(String Str, int n, int m)
	{
		switch (Str)
		{
			case "Id" :
				this.Id = m;
				break;
			case "UserLevel" :
				this.UserLevel = m;
				break;
			case "Level" :
				this.Level[n] = m;
				break;
			case "Code" :
				this.Code[n] = m;
				break;
		}
	}
	public void setString(String Str, int n, String Str1)
	{
		switch (Str)
		{
			case "Password" :
				this.Password = Str1;
				break;
			case "Major" :
				this.Major= Str1;
				break;
			case "ClassName" : 
				this.ClassName[n]= Str1;
				break;
			case "UserTerm" :
				this.UserTerm = Str1;
				break;
			case "Classify" :
				this.Classify[n] = Str1;
				break;
			case "Term" :
				this.Term[n] = Str1;
				break;
		}
	}
	public void setDouble(String Str, int n, double m)
	{
		switch (Str)
		{
			case "Credit" :
				this.Credit[n] = m;
				break;
			case "Grade" :
				this.Grade[n] = m;
				break;
		}
	}
	public void setRequ(String Str, Requ requ)
	{
		switch (Str)
		{
			case "Requ" :
				 this.UserRequ[0] = requ;
				 break;
		}
	}
}