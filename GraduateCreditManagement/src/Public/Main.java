package Public;

import Private.User;
import Private.Process;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date; // 첫번쩨 import sql 하면 안됨.
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import Public.Load;
import Public.Store;


public class Main implements Serializable
{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{	
		int mode = -1;
		Load load = new Load();
		Store store = new Store();
		Input input = new Input();
		Print print = new Print();
		Search search = new Search();
		Process process = new Process();
		LogManage logManage = new LogManage();
		int[] intMem = new int [10];
		String[] strMem = new String [10];
		logManage.logger("Program Start");
		while(mode > -2)
		{
			User user = new User();
			Requ requ = new Requ();
			Lecture[] lectureList = new Lecture[100];
			if (user != null && requ != null)
				mode++;
			while(mode == 0)
			{
				print.option(0);
				switch (input.getInt(1, 3, -1))
				{
					case 1 :
						user = process.signup(user);
						break;
					case 2 :
						user = process.login(user);
						break;
					case 3 :
						print.guide(100);
						logManage.logger("Terminate program");
						mode = -3;
						break;
				}
				if (user != null)
					mode++;
				else
					mode--;
			}
			while(mode == 1)
			{
				requ = process.setRequ(user);
				lectureList = process.setLectureList(user);
				if(requ != null)
				{
					logManage.logger("Success Login");
					mode++;
				}
				else
					mode--;
			}
			while(mode == 2)
			{
				print.option(2);
				switch (input.getInt(0, 4, -1))
				{
					case 0:
						user = process.inform(user);
						break;
					case 1:
						lectureList = process.lecture(user,requ,lectureList);
						break;
					case 2:
						process.retrieveLecture(requ, lectureList);
						break;
					case 3:
						process.logout(user,requ,lectureList);
						logManage.logger("User Logout");
						mode = -1;
						break;
				}
			}
		}
	}
}
