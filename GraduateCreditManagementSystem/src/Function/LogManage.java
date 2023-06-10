package Function;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogManage
{
	FileWriter filewriter = null;
	PrintWriter writer = null;
	LogManager logmanager;
	Logger logger;
	FileHandler filehandler = null;
	public void logger (String Message)
	{
		try
		{
			System.out.println("");
			filehandler = new FileHandler("Log.txt",true);
			logmanager = LogManager.getLogManager();
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
			logger.info(Message);
		}
		catch (IOException e) {e.printStackTrace();}
	}
}
