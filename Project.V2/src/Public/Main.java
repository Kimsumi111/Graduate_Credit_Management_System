package Public;

import Private.User;

class Main
{
	public static void main(String[] args)
	{
		int Process = -1;
		int Mode = 0;
		Input Input = new Input();
		Print Print = new Print();
		int[] IntMem = new int [10];
		String[] StrMem = new String [10];
		
		Requ accRequ = new Requ();
		Requ[] Requlist = new Requ[100];
		User accUser = new User();
		User[] Userlist = new User[100];
		Process++;
		while(true)
		{
			while (Process	== 0)
			{
				Print.Option(0);
				switch (Input.Int(1, 3,-1))
				{
					case 1:
						User NewUser = new User(Input.Int(2014000000, 2023999999,1),Input.String(0));
						for(int i = 0; i<100 ; i++)
						{
							if(Userlist[i] == null)
								IntMem[0] = i;
							else if(Userlist[i].getInt("Id",0) == NewUser.getInt("Id",0))
									IntMem[0] = -1;
						}
						if (IntMem[0] == -1)
						{
							Print.Error(3);
							continue;
						}
						Userlist[IntMem[0]] = NewUser;
						Process ++;
						break;
					case 2:
						IntMem[0] = -1;
						IntMem[1] = Input.Int(2014000000, 2023999999,1);
						StrMem[0] = Input.String(0);
						for(int i = 0; i<100; i++)
						{
							if(Userlist[i] != null)
							{
								if(Userlist[i].getInt("Id",0) == IntMem[1] && Userlist[i].getString("Password",0).equals(StrMem[0]))
								{
									IntMem[0] = i;
									break;
								}
							}
						}
						if (IntMem[0] == -1)
						{
							Print.Error(1);
							continue;
						}
						Process ++;
						break;
					case 3:
						Print.Guide(100);
						Process = 100;
						break;
				}
			}
			while(Process == 1)
			{
				accUser = Userlist[IntMem[0]];
				if (accUser.getRequ("Requ") == null)
				{
					accUser.init();
					accUser.setInt("UserLevel",0,Input.Int(1,4,3));
					Print.Guide(20);
					accUser.setString("UserTerm",0,Input.String(accRequ,4));
					Print.Guide(24);
					for(IntMem[1] = 0; Requlist[IntMem[1]] != null; IntMem[1]++)
					{
						System.out.print(IntMem[1] + " : ");
						Print.Requ(Requlist[IntMem[1]], 0);
					}
					Print.Option(1);
					Print.Guide(23);
					IntMem[2] = Input.Int(-1,IntMem[1]-1,-1);
					switch (IntMem[2])
					{
						case  -1:
							accRequ.Admi = accUser.getInt("Admi",0);
							accRequ.Major = Input.String(2);
							accUser.setString("Major",0, accRequ.Major);
							Print.Guide(25);
							int i =0;
							while(true)
							{
								accRequ.Classify[i] = Input.String(8);
								accRequ.Credit[i] = Input.Double(0.5,50,10);
								i++;
								Print.Option(100);
								if(Input.Int(1,2,-1) == 2)
								{
									Requlist[IntMem[1]] = new Requ();
									Requlist[IntMem[1]].init();
									Requlist[IntMem[1]].copy(accRequ);
									break;
								}
							}
							break;
						default :
							accRequ.copy(Requlist[IntMem[2]]);
							accUser.setString("Major",0, accRequ.Major);
							break;
					}
				}
				Process ++;
			}
			while(Process == 2)
			{
				Print.Option(2);
				switch (Input.Int(0,4,-1))
				{
					case 0 :
						Mode = 1;
						while (Mode == 1)
						{
							Print.Option(20);
							switch (Input.Int(1, 3, -1))
							{
								case 1:
									Print.User(accUser);
									break;
								case 2:
									Print.User(accUser);
									Print.Guide(21);
									switch (Input.Int(1, 6, -1))
									{
										case 1:
											Print.Guide(23);
											accUser.setInt("Id",0,Input.Int(2014000000, 2023999999,1));
											break;
										case 2:
											accUser.setString("Password",0,Input.String(0));
											break;
										case 3:
											Print.Guide(23);
											Print.Guide(22);
											accUser.setInt("Id",0,Input.Int(2014000000, 2023999999,1));
											break;
										case 4:
											Print.Guide(23);
											accUser.setString("Major",0,Input.String(2));
											break;
										case 5:
											accUser.setInt("UserLevel",0,Input.Int(1,4,3));
											break;
										case 6:
											Print.Guide(20);
											accUser.setString("UserTerm",0,Input.String(accRequ,4));
											break;		
									}
									break;
								case 3:
									Mode = 0;
									break;
							}
						}
						break;
					case 1:
						IntMem[1] = 0;
						Print.Guide(26);
						while(true)
						{
							if(accUser.getInt("Code",IntMem[1]) == -1)
							{
								accUser.setInt("Level",IntMem[1], Input.Int(1, 4, 5));
								Print.Guide(20);
								accUser.setString("Term",IntMem[1], Input.String(accRequ,6));
								accUser.setInt("Code",IntMem[1], Input.Int(10000000,99999999,7));
								Print.Requ(accRequ,1);
								accUser.setString("Classify",IntMem[1],Input.String(accRequ,8));
								accUser.setString("ClassName",IntMem[1],Input.String(9));
								accUser.setDouble("Credit",IntMem[1],Input.Double(0.5, 4.0, 10));
								Print.Option(100);
								if(Input.Int(1,2,-1) == 2)
									break;
							}
							IntMem[1]++;
						}
						
						break;
					case 2:
						System.out.println("아직 기능을 구현하지 못했습니다.");
						break;
					case 3:
						Mode = 1;
						while(Mode == 1)
						{
							Print.Option(23);
							switch (Input.Int(1, 5, -1))
							{
								case 1 :
									Print.Guide(20);
									IntMem[1] = Print.User(accUser,Input.Int(1, 4, 5),Input.String(accRequ,6));
									Print.Error(IntMem[1]);
									break;
								case 2 :
									IntMem[1] = Print.User(accUser,Input.Int(10000000, 99999999,7));
									Print.Error(IntMem[1]);
									break;
								case 3 :
									Print.Requ(accRequ,1);
									IntMem[1] = Print.User(accUser,Input.String(accRequ,8));
									Print.Error(IntMem[1]);
									break;
								case 4 :
									IntMem[1] = Print.User(accUser,5,"All");
									Print.Error(IntMem[1]);
									break;
								case 5 :
									Mode = 0;
									break;
							}
						}
						break;
					case 4:
						Process = 0;
						accUser.setRequ("Requ",accRequ);
						break;
				}
			}
			if(Process == 100)
				break;
		}
	}
}