package Public;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Private.User;
public class Store
{
	public void user(User user)
	{
		String relativePath = "Userdata"+ "\\"+String.valueOf(user.getInt("Id", 0));
	    String absolutePath = System.getProperty("user.dir") + "\\" + relativePath;
	    String filepath = absolutePath + "\\" + "Info";
		FileOutputStream file = null;
		ObjectOutputStream write = null;
		try
		{
			file = new FileOutputStream(filepath);
			write = new ObjectOutputStream(file);
			write.writeObject(user);
		}
		catch (IOException e) {e.printStackTrace();}
		finally
		{
            try
            {
                if (write != null)
                    write.close();
                if (file != null)
                    file.close();
            } 
            catch (IOException e) {e.printStackTrace();}
		}
	}
	public void userRequ (User user, Requ requ)
	{
		String relativePath = "Userdata"+ "\\"+ String.valueOf(user.getInt("Id", 0));
	    String absolutePath = System.getProperty("user.dir") + "\\" + relativePath;
	    String filepath = absolutePath + "\\" + "Requ";
	    FileOutputStream file = null;
		ObjectOutputStream write = null;
		try
		{
			file = new FileOutputStream(filepath);
			write = new ObjectOutputStream(file);
			write.writeObject(requ);
		}
		catch (IOException e) {e.printStackTrace();}
		finally
		{
            try
            {
                if (write != null)
                    write.close();
                if (file != null)
                    file.close();
            } 
            catch (IOException e) {e.printStackTrace();}
		}
	}
	public void userLecture (User user, Lecture[] lecture)
	{
		String relativePath = "Userdata"+ "\\"+ String.valueOf(user.getInt("Id", 0));
	    String absolutePath = System.getProperty("user.dir") + "\\" + relativePath;
	    String filepath = absolutePath + "\\" + "Lecture";
	    FileOutputStream file = null;
		ObjectOutputStream write = null;
		try
		{
			file = new FileOutputStream(filepath);
			write = new ObjectOutputStream(file);
			write.writeObject(lecture);
		}
		catch (IOException e) {e.printStackTrace();}
		finally
		{
            try
            {
                if (write != null)
                    write.close();
                if (file != null)
                    file.close();
            } 
            catch (IOException e) {e.printStackTrace();}
		}
	}

}
