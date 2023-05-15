package Public;

public class Requ
{
	int Admi;
	String Major;
	String[] Classify = new String[100];
	double[] Credit = new double[100];
	String[] Term = {"1학기","하계","2학기","동계"};

	public void init()
	{
		this.Admi = -1;
		this.Major = null;
		for(int i = 0; i < 100; i++)
		{
			this.Classify[i] = null;
			this.Credit[i] = -1.0;
		}
	}
	public void copy(Requ requ)
	{
		this.Admi = requ.Admi;
		this.Major = requ.Major;
		System.arraycopy(requ.Classify, 0, this.Classify, 0, requ.Classify.length);
		System.arraycopy(requ.Credit, 0, this.Credit, 0, requ.Credit.length);
	}
}

