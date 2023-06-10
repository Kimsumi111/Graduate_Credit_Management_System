package Function;

import Public.Requ;

public class Input
{
    Requ requ = new Requ();
    Search search = new Search();
    Windows windows = new Windows();
    public int stringToInt(String text, int a, int b)
    {
        try
        {
        	int temp = Integer.parseInt(text);
            if (temp >= a && temp <= b)
            	return temp;
            else
            	return -1;
        }
        catch (Exception e) {return -1;}
    }

    public double stringToDouble(String text, double a, double b)
    {
        {
            try
            {
            	double temp = Double.parseDouble(text);
                if (temp >= a && temp <= b)
                	return temp;
                else
                	windows.error(0);
                return -1.0;
            }
            catch (Exception e) {windows.error(0);}
            return -1.0;
        }
    }

    public String Category(Requ requ,String text)
    {
    	try
        {
    		if (search.requCategory(text, requ) > -1)
    			return text;
    		return null;
        }
        catch (Exception e) {return null;}
    }

    public String term(String text)
    {
    	try
    	{
    		if (search.termEnum(text) != null)
    			return text;
    		else
    			return null;
    	}
        catch (Exception e) {return null;}
    }
}