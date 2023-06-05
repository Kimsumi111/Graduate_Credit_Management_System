package Public;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import Private.User;

public class Load
{
	public User userInfo (User user)
	{
		String relativePath = "Userdata"+ "\\" + String.valueOf(user.getInt("Id", 0));
	    String absolutePath = System.getProperty("user.dir") + "\\" + relativePath;
	    String filepath = absolutePath + "\\" + "Info";
	    
		User tempUser = null;
		FileInputStream file = null;
		ObjectInputStream read = null;
		try
		{
			file = new FileInputStream(filepath);
			read = new ObjectInputStream(file);
			tempUser = (User)read.readObject();
			return tempUser;
		}
		catch (IOException e) {e.printStackTrace();}
		catch (ClassNotFoundException e) {e.printStackTrace();}
		finally
		{
			try {
                if (read != null)
                    read.close();
                if (file != null)
                    file.close();
                }
			catch (IOException e) {e.printStackTrace();}
		}
		return null;
	}
	public Requ userRequ (User user)
	{
		String relativePath = "Userdata"+ "\\" + String.valueOf(user.getInt("Id", 0));
	    String absolutePath = System.getProperty("user.dir") + "\\" + relativePath;
	    String filepath = absolutePath + "\\" + "Requ";
	    
		Requ tempRequ = null;
		FileInputStream file = null;
		ObjectInputStream read = null;
		try
		{
			file = new FileInputStream(filepath);
			read = new ObjectInputStream(file);
			tempRequ = (Requ)read.readObject();
			return tempRequ;
		}
		catch (IOException e) {e.printStackTrace();}
		catch (ClassNotFoundException e) {e.printStackTrace();}
		finally
		{
			try {
                if (read != null)
                    read.close();
                if (file != null)
                    file.close();
                }
			catch (IOException e) {e.printStackTrace();}
		}
		return null;
	}
	public Lecture[] userLecture (User user)
	{
		String relativePath = "Userdata"+ "\\" + String.valueOf(user.getInt("Id", 0));
	    String absolutePath = System.getProperty("user.dir") + "\\" + relativePath;
	    String filepath = absolutePath + "\\" + "Lecture";
	    
	    Lecture[] tempLecture = null;
		FileInputStream file = null;
		ObjectInputStream read = null;
		try
		{
			file = new FileInputStream(filepath);
			read = new ObjectInputStream(file);
			tempLecture = (Lecture[])read.readObject();
			return tempLecture;
		}
		catch (IOException e) {e.printStackTrace();}
		catch (ClassNotFoundException e) {e.printStackTrace();}
		finally
		{
			try {
                if (read != null)
                    read.close();
                if (file != null)
                    file.close();
                }
			catch (IOException e) {e.printStackTrace();}
		}
		return null;
		
	}

}