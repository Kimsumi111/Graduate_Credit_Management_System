package Public;

import java.io.Serializable;

public class Lecture implements Serializable
{
	private static final long serialVersionUID = 1L;
	public int code;
	public int grade;
	public String term;
	public String category;
	public String name;
	public double credit;
	public double score;
	public Lecture ()
	{
		this.code = -1;
		this.score = -1;
	}
	public void copy(Lecture lecture)
	{
		this.grade = lecture.grade;
		this.term = lecture.term;
		this.code = lecture.code;
		this.category = lecture.category;
		this.name = lecture.name;
		this.credit = lecture.credit;
	}
}
