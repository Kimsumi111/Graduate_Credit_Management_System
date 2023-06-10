package Public;
import java.io.Serializable;

import Function.Windows;
import Private.User;
import Private.Process;
import Function.Windows;


public class Main implements Serializable
{
	private static final long serialVersionUID = 1L;
	public static int process;
	public static User user;
	public static Requ requ;
	public static Lecture[] lecture;
	
	public static void main(String[] args)
	{
		Main.reset();
		Process process = new Process();
		//process.start();
		Windows window = new Windows();
		window.signup();
	}
	public static void reset()
	{
		Main.user = new User();
		Main.requ = new Requ();
		Main.lecture = new Lecture[100];
		for(int i = 0; i<Main.lecture.length; i++)
			Main.lecture[i] = new Lecture();
	}
}