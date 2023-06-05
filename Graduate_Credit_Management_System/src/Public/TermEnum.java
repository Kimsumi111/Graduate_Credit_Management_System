package Public;

public enum TermEnum
{
	First_Semester,
	Summer_Session,
	Second_Semester,
	Winter_Session;
	public static int Ordinal(String Str)
	{
		if(Str == "First_Semester")
			return 1;
		if(Str == "Summer_Session")
			return 2;
		if(Str == "Second_Semester")
			return 3;
		if(Str == "Winter_Session")
			return 4;
		return -1;
	}
}