package Public;

import Private.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Search
{
	public boolean user(String str,User user)
	{
		String relativePath = "Userdata"+ "\\"+ String.valueOf(user.getInt("Id", 0));
	    String absolutePath = System.getProperty("user.dir") + "\\" + relativePath;
	    String filepath = absolutePath + "\\" + str;
	    File directory = new File(absolutePath);
	    if (!directory.exists() || !directory.isDirectory())
	        return false;
	    File file = new File(filepath);
	    return file.exists() && file.isFile();
	}
	public int lecture(Lecture[] lecture, int code)
	{
		for(int i = 0; i<100; i++)
		{
			if(lecture[i].code == code)
				return i;
		}
		return -1;
	}
	public boolean userDirect(User user)
	{
		String relativePath = "Userdata";
	    String absolutePath = System.getProperty("user.dir") + "\\" + relativePath;
		String searchDirectoryPath = absolutePath;
	    String targetDirectoryName = String.valueOf(user.getInt("Id", 0));

	    File searchDirectory = new File(searchDirectoryPath);
	    if (searchDirectory.exists() && searchDirectory.isDirectory())
	    {
	    	File[] directories = searchDirectory.listFiles(File::isDirectory);
	        if (directories != null)
	            for (File directory : directories) 
	                if (directory.getName().equals(targetDirectoryName))
	                    return true;
	        return false;
	    } 
	    else
	    {
	    	return false;
	    }
	}
	public String termEnum(String value)
	{
		for(TermEnum TermEnum : TermEnum.values())
			if(TermEnum.name().equals(value))
				return value;
		return null;
	}
	public int requCategory(String str,Requ requ)
	{
		int i = 0;
		while(true)
		{
			if(requ.category[i] != null)
			{
				if(requ.category[i].equals(str))
					return i;
			}
			else
				return -1;
			i++;
		}
	}

}
