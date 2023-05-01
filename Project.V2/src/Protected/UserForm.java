	package Protected;
	
	import Public.Requ;
	
	public class UserForm
	{
		protected String Password;
		protected int Id;
		protected String Major;
		protected int UserLevel;
		protected String UserTerm;
		protected int[] Level = new int[100];
		protected String[] Term = new String[100];
		protected int[] Code = new int[100];
		protected String[] Classify = new String[100];
		protected String[] ClassName = new String[100];
		protected double[] Credit = new double[100];
		protected double[] Grade = new double[100];
		protected Requ[] UserRequ = new Requ[1];
		
		public void init()
		{
			for(int i = 0 ; i < 100 ; i++)
			{
				this.Code[i] = -1;
				this.Grade[i] = -1.0;
			}
		}
	}
	
