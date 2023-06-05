package Public;

import java.io.File;

import Private.User;

public class CreateFile 
{
	public boolean userData(User user)
	{
		String relativePath = "Userdata";
	    String parentDirectoryPath = System.getProperty("user.dir") + "\\" + relativePath;
        String directoryName = String.valueOf(user.getInt("Id", 0));
        String directoryPath = parentDirectoryPath + File.separator + directoryName;

        File directory = new File(directoryPath);

        if (!directory.exists())
        {
            if (directory.mkdirs())
                return true;
            else
                return false;
        } 
        else
            return false;
	}

}