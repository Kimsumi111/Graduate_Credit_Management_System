package Protected;
	
import Public.Requ;

import java.io.Serializable;

import Public.Lecture;
	
	public abstract class UserForm implements Serializable
	{
		private static final long serialVersionUID = 1L;
		protected String password;
		protected int id;
		protected String major;
		protected int grade;
		protected String term;
		protected int lectureSize;
	}
	