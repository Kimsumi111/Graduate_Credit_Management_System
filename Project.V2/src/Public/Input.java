package Public;
import java.util.Scanner;

class Input
{
	Requ Requ = new Requ();
	Print Print = new Print();
	public int Int(int a, int b, int c)
	{
		Print.Guide(c);
		int tmp;
		while(true)
		{
			Print Print = new Print();
			Scanner input = new Scanner(System.in);
			tmp = input.nextInt();
			if(tmp>=a && tmp<=b)
				return tmp;
			else
				Print.Error(0);
		}
	}
	public double Double(double a, double b, int c)
	{
		Print.Guide(c);
		double tmp;
		while(true)
		{
			Print Print = new Print();
			Scanner input = new Scanner(System.in);
			tmp = input.nextDouble();
			if(tmp>=a && tmp<=b)
				return tmp;
			else
				Print.Error(0);
		}
	}
	public String String(int c)
	{
		Print.Guide(c);
		String tmp;
		while(true)
		{
			Scanner input = new Scanner(System.in);
			tmp = input.nextLine();
			return tmp;
		}
	}
	public String String(Requ Requ,int c)
	{
		Print.Guide(c);
		String tmp;
		while(true)
		{
			Scanner input = new Scanner(System.in);
			tmp = input.nextLine();
			switch (c)
			{
				case 8 :
					for(int i = 0; Requ.Classify[i] != null; i++)
					{
						if(Requ.Classify[i].equals(tmp))
							return tmp;
					}
					Print.Error(0);
					break;
				case 4:
				case 6:
					for(int i = 0; i<Requ.Term.length ; i++)
					{
						if(Requ.Term[i].equals(tmp))
							return tmp;
					}
					Print.Error(0);
			}
		}
	}

}
