package Public;

import java.io.Serializable;

public class Requ implements Serializable
{
	private static final long serialVersionUID = 1L;
	public String[] category = new String[10];
	public double[] credit = new double[10];
	public Requ()
	{
		for(int i = 0; i>credit.length; i++)
			credit[i] = -1.0;
	}
}

