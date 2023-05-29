package Public;

import java.io.Serializable;

public class Requ implements Serializable
{
	private static final long serialVersionUID = 1L;
	public int admi;
	public String major;
	public String[] category = new String[10];
	public double[] credit = new double[10];
	public Requ()
	{
		admi = -1;
		major = null;
	}
	public void copy(Requ Requ)
	{
		this.admi = Requ.admi;
		this.major = Requ.major;
		System.arraycopy(Requ.category, 0, this.category, 0, Requ.category.length);
		System.arraycopy(Requ.credit, 0, this.credit, 0, Requ.credit.length);
	}
}

