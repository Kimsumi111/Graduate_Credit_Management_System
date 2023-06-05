package Public;

import java.io.File;
import Public.Load;
import Private.User;

public class Print
{
	int[] intMem = new int[10];
	String[] strMem = new String[10];
	User user = new User();
	Requ requ = new Requ();
	Lecture lecture = new Lecture();
	Load load = new Load();
	public void option(int n)
	{
		System.out.println("---------Select Option---------");
		switch (n)
		{
			case 0:
				System.out.println("1 : Sign Up");
				System.out.println("2 : Log in");
				System.out.println("3 : Exit");
				break;
			case 1:
				System.out.println("n: Enter the Code of matching information.");
				System.out.println("-1 : Not exist information");
				break;
			case 2:
				System.out.println("0 : Retrieve/Update user information.");
				System.out.println("1 : Update lecture information.");
				System.out.println("2 : Retrieve enrollment information.");
				System.out.println("3 : Log out." );
				break;
			case 20:
				System.out.println("1 : Retrieve user information.");
				System.out.println("2 : Update user information.");
				System.out.println("3 : Exit.");
				break;
			case 21:
				System.out.println("1 : Insert lecture information.");
				System.out.println("2 : Update lecture score.");
				System.out.println("3 : Delete lecture information");
				System.out.println("4 : Exit.");
				break;
			case 23:
				System.out.println("1 : Retrieve information by semester.");
				System.out.println("2 : Retrieve information by code.");
				System.out.println("3 : Retrieve information by completion category.");
				System.out.println("4 : Retrieve information for all records.");
				System.out.println("5 : Exit.");
				break;
			case 100:
				System.out.println("1 : Continue with the task");
				System.out.println("2 : Completed the task.");
				break;
		}
	}
	public void error(int n)
	{
		switch (n)
		{
			case -1:
				System.out.println("Invalid input. Please enter again.");
				break;
			case -2:
				System.out.println("No matching information found.");
				break;
			case -3:
				System.out.println("The information does not exist.");
				break;
			case -4:
				System.out.println("Already registered.");
				break;
			case -5:
				System.out.println("The password does not match.");
				break;
			case -6:
				System.out.println("Some information is missing and it's difficult to generate output.");
				break;
			case -7:
				System.out.println("I apologize. We are no longer accepting new data.");
				break;
			case -100:
				System.out.println("An unexpected error has occurred.");
		}
	}
	public void guide(int n)
	{
		switch (n)
		{
			case -1:
				System.out.print("Please select the Option:");
				break;
			case 0:
				System.out.print("Please enter the password:");
				break;
			case 1:
				System.out.print("Please enter the student ID:");
				break;
			case 2:
				System.out.print("Please enter the Major:");
				break;
			case 3: 
				System.out.print("Please enter the current year of the user:");
				break;
			case 4:
				System.out.print("Please enter the current Term of the user:");
				break;
			case 5 :
				System.out.print("Please enter the Grade :");
				break;
			case 6 : 
				System.out.print("Please enter the Term :");
				break;
			case 7 :
				System.out.print("Please enter the Code :");
				break;
			case 8 :
				System.out.print("Please enter the Category:");
				break;
			case 9 :
				System.out.print("Please enter the Name :");
				break;
			case 10 :
				System.out.print("Please enter the Credit :");
				break;
			case 11 : 
				System.out.print("Please enter the Score :");
				break;
			case 20 :
				System.out.println("---------Please enter as shown below.---------");
				break;
			case 21 :
				System.out.println("---------Please enter the item to be modified.--------");
				break;
			case 22 :
				System.out.println("This is the information related to your student ID. Please update your student ID.");
				break;
			case 23 :
				System.out.println("This is the information related to graduation requirements. Please enter the information carefully.");
				break;
			case 24 :
				System.out.println("---------I will retrieve the graduation requirements information.---------");
				break;
			case 25 :
				System.out.println("---------please enter the graduation requirements information.---------");
				break;
			case 26 : 
				System.out.println("---------please enter the lecture information.---------");
				break;
			case 100 :
				System.out.println("The program is terminating. Thank you!");
				break;
		}
	}
	public void user(User user)
	{
		System.out.println("---------User's information---------");
		System.out.println("1. StudentID : " + user.getInt("Id",0));
		System.out.println("2. Password : " + user.getString("Password",0));
		System.out.println("3. Admission Year : " + user.getInt("Admi",0));
		System.out.println("4. Major : " + user.getString("Major",0));
		System.out.println("5. Grade : " + user.getInt("Grade", 0));
		System.out.println("6. Term : " + user.getString("Term",0));
	}

	
	public void lecture(Lecture[] lecture,String str)
	{
		int i = 0;
		double totCredit = 0;
		double avgCredit = 0;
		double totScore = 0;
		while(i<100)
		{
			if (lecture[i].code != -1 &&(lecture[i].term.equals(str) || lecture[i].category.equals(str)))
			{
				System.out.print("Lecture Code : " + lecture[i].code);
				System.out.print("| Lecture Grade : " + lecture[i].grade);
				System.out.print("| Lecture Term : " + lecture[i].term);
				System.out.print("| Lecture Category : " + lecture[i].category);
				System.out.print("| Lecture Name : " + lecture[i].name);
				System.out.print("| Lecture credit : " + lecture[i].credit);
				if (lecture[i].score == -1)
					System.out.println("| Lecture Score : Score not yet entered.");
				else
					System.out.println("| Lecture Score : " + lecture[i].score);
				totCredit = totCredit + lecture[i].credit;
				if(lecture[i].score > 0)
				{
					avgCredit = avgCredit + lecture[i].credit;
					totScore = totScore + (lecture[i].credit*lecture[i].score);
				}
			}
			i++;
		}
		if(totCredit > 0)
			System.out.println("Total Credit : " + totCredit +" | Average Score : " + totScore/avgCredit);
		else
			System.out.println("The information does not exist.");
		return;
	}
	public void lecture(Lecture[] lecture, int n)
	{
		int i = 0;
		while(i<100)
		{
			if (lecture[i].code == n)
			{
				System.out.print("Lecture Code : " + lecture[i].code);
				System.out.print("| Lecture Grade : " + lecture[i].grade);
				System.out.print("| Lecture Term : " + lecture[i].term);
				System.out.print("| Lecture Category : " + lecture[i].category);
				System.out.print("| Lecture Name : " + lecture[i].name);
				System.out.print("| Lecture credit : " + lecture[i].credit);
				if (lecture[i].score == -1)
					System.out.println("| Lecture Score : Score not yet entered.");
				else
					System.out.println("| Lecture Score : " + lecture[i].score);
				return;
			}
			i++;
		}
		System.out.println("The information does not exist.");
		return;
	}
	public void lecture(Lecture[] lecture)
	{
		String[] array = {"First_Semester","Summer_Session","Second_Semester","Winter_Session"};
		double totCredit = 0;
		double avgCredit = 0;
		double totScore = 0;
		for (int j = 4; j<20; j++)
		{
			for (int i = 0; i<100; i++)
			{
				if (lecture[i].code != -1 && lecture[i].grade == (j/4) && lecture[i].term.equals(array[j%4]))
				{
					System.out.print("Lecture Code : " + lecture[i].code);
					System.out.print("| Lecture Grade : " + lecture[i].grade);
					System.out.print("| Lecture Term : " + lecture[i].term);
					System.out.print("| Lecture Category : " + lecture[i].category);
					System.out.print("| Lecture Name : " + lecture[i].name);
					System.out.print("| Lecture credit : " + lecture[i].credit);
					if (lecture[i].score == -1)
						System.out.println("| Lecture Score : Score not yet entered.");
					else
						System.out.println("| Lecture Score : " + lecture[i].score);
					totCredit = totCredit + lecture[i].credit;
					if(lecture[i].score > 0)
					{
						avgCredit = avgCredit + lecture[i].credit;
						totScore = totScore + (lecture[i].credit*lecture[i].score);
					}
				}
			}
		}
		if(totCredit > 0)
			System.out.println("Total Credit : " + totCredit +" | Average Score : " + totScore/avgCredit);
		else
			System.out.println("The information does not exist.");
		return;
	}
	
	public void list(String str)
	{
		switch (str)
		{
			case "Term" :
				TermEnum[] values = TermEnum.values();
				for(TermEnum value : values)
					System.out.print("|"+value);
				System.out.println();
				break;
		}
	}
	public int list(String str, Requ requ)
	{
		int i =0;
		switch (str)
		{
			case "Category":
				while(true)
				{
					if(requ.category[i] != null)
					{
						System.out.print("|" + requ.category[i]);
						i++;
					}
					else
					{
						System.out.println();
						return i;
					}
					
				}		
		}
		return i;
	}
}