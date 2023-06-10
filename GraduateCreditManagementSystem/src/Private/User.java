package Private;

import java.io.Serializable;

import Protected.UserForm;
import Public.Requ;
import Public.Lecture;

public class User extends UserForm implements Serializable
{
	private static final long serialVersionUID = 1L;
	public User()
	{
		super();
		password = null;
		id = -1;
		major = null;
		grade = -1;
		term = null;
		lectureSize = 0;
	}
	public int getInt(String Str, int n)
	{
		switch (Str)
		{
			case "Id" :
				return this.id;
			case "Grade" :
				return this.grade;
			case "Admi" :
				return this.id/1000000;
			case "LectureSize" :
				return this.lectureSize;
			default :
				return -1;
		}
	}
	public String getString(String str, int n)
	{
		switch (str)
		{
			case "Password" :
				return this.password;
			case "Major" :
				return this.major;
			case "Term" :
				return this.term;
			default :
				return null;
		}
	}

	public void setInt(String str, int n, int m)
	{
		switch (str)
		{
			case "Id" :
				this.id = m;
				break;
			case "Grade" :
				this.grade = m;
				break;
			case "LectureSize" :
				this.lectureSize = m;
				break;
		}
	}
	public void setString(String str, int n, String str1)
	{
		switch (str)
		{
			case "Password" :
				this.password = str1;
				break;
			case "Major" :
				this.major= str1;
				break;
			case "Term" :
				this.term = str1;
				break;
		}
	}
	public void setUser(String str,User user)
	{
		switch (str)
		{
			case "Copy":
				this.password = user.password;
				this.id = user.id;
				this.major = user.major;
				this.grade = user.grade;
				this.term = user.term;
				this.lectureSize = user.lectureSize;
				break;
		}
	}
}