package Public;

import Private.User;

public class Print implements PrintFunction
{
	int[] IntMem = new int[10];
	String[] StrMem = new String[10];
	User User = new User();
	Requ Requ = new Requ();
	public void Option(int n)
	{
		System.out.println("---------수행할 기능을 선택하세요---------");
		switch (n)
		{
			case 0:
				System.out.println("1번 : 회원가입을 합니다.");
				System.out.println("2번 : 로그인을 합니다.");
				System.out.println("3번 : 종료합니다.");
				break;
			case 1:
				System.out.println("0~n:일치하는 정보의 번호를 입력해주세요.");
				System.out.println("-1 :일치하는 정보가 없음");
				break;
			case 2:
				System.out.println("0번 : 사용자 정보를 조회/수정합니다");
				System.out.println("1번 : 강의 정보를 입력합니다.");
				System.out.println("2번 : 강의 정보를 삭제합니다.");
				System.out.println("3번 : 수강 정보를 조회합니다.");
				System.out.println("4번 : 로그아웃 합니다." );
				break;
			case 20:
				System.out.println("1번 : 사용자 기본 정보를 조회합니다.");
				System.out.println("2번 : 사용자 기본 정보를 수정합니다.");
				System.out.println("3번 : 사용자 기본 정보 조회/수정을 종료합니다.");
				break;
			case 21:
				System.out.println("1번 : 강의 정보를 입력합니다.");
				System.out.println("2번 : 강의 점수를 입력합니다.");
				System.out.println("3번 : 강의 정보/점수 입력을 종료합니다.");
				break;
			case 23:
				System.out.println("1번 : 학기별로 조회합니다.");
				System.out.println("2번 : 과목코드별로 조회합니다.");
				System.out.println("3번 : 이수구분별로 조회합니다.");
				System.out.println("4번 : 전체 조회 합니다.");
				System.out.println("5번 : 수강 정보 조회를 종료합니다.");
				break;
			case 100:
				System.out.println("1번 : 작업을 계속합니다.");
				System.out.println("2번 : 작업을 완료합니다.");
				break;
		}
	}
	public void Error(int n)
	{
		switch (n)
		{
			case 0:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				break;
			case -1:
				System.out.println("일치하는 정보가 없습니다.");
				break;
			case -2:
				System.out.println("입력된 정보가 없습니다.");
				break;
			case -3:
				System.out.println("이미 가입되어 있는 회원입니다.");
				break;
			case -4:
				System.out.println("비밀번호가 일치하지 않습니다.");
				break;
			case -5:
				System.out.println("입력되지 않은 정보가 있어 산출이 어렵습니다.");
				break;
			
		}
	}
	public void Guide(int n)
	{
		switch (n)
		{
			case -1:
				System.out.print("번호를 입력해주세요:");
				break;
			case 0:
				System.out.print("비밀번호를 입력해주세요:");
				break;
			case 1:
				System.out.print("학번을 입력해주세요:");
				break;
			case 2:
				System.out.print("전공을 입력해주세요:");
				break;
			case 3: 
				System.out.print("사용자의 현재 학년을 입력해주세요:");
				break;
			case 4:
				System.out.print("사용자의 현재 학기를 입력해주세요:");
				break;
			case 5 :
				System.out.print("학년정보를 입력해주세요:");
				break;
			case 6 : 
				System.out.print("학기정보를 입력해주세요:");
				break;
			case 7 :
				System.out.print("코드정보를 입력해주세요:");
				break;
			case 8 :
				System.out.print("이수구분 정보를 입력해주세요:");
				break;
			case 9 :
				System.out.print("과목명을 입력해주세요:");
				break;
			case 10 :
				System.out.print("학점을 입력해주세요:");
				break;
			case 11 : 
				System.out.print("성적을 입력해주세요:");
				break;
			case 20 :
				System.out.println("---------아래와 같이 입력해주세요---------");
				System.out.println("1학기|하계|2학기|동계");
				break;
			case 21 :
				System.out.println("---------수정 할 항목을 입력해주세요--------");
				break;
			case 22 :
				System.out.println("학번과 관련된 정보입니다. 학번을 수정하세요.");
				break;
			case 23 :
				System.out.println("졸업요건과 관련된 정보입니다. 유의하여 입력해주세요.");
				break;
			case 24 :
				System.out.println("---------졸업요건 정보를 불러옵니다.---------");
				break;
			case 25 :
				System.out.println("---------졸업요건 정보를 입력하세요.---------");
				break;
			case 26 : 
				System.out.println("---------강의 정보를 입력하세요.---------");
				break;
			case 100 :
				System.out.println("프로그램을 종료합니다.");
				break;
		}
	}
	public void User(User User)
	{
		System.out.println("--------- 사용자의 기본 정보 입니다.---------");
		System.out.println("1. 학번 : " + User.getInt("Id",0));
		System.out.println("2. 비밀번호 : " + User.getString("Password",0));
		System.out.println("3. 입학연도 : " + User.getInt("Admi",0));
		System.out.println("4. 전공 : " + User.getString("Major",0));
		System.out.println("5. 학년 : " + User.getInt("UserLevel", 0));
		System.out.println("6. 학기 : " + User.getString("UserTerm",0));
	}
	public int User(User User, int n,String Str)
	{
		double sum = 0;
		double sum1 = 0;
		double tot = 0;
		if (n != 5)
		{
			for(int i = 0; i<100; i++)
			{
				if(User.getInt("Level",i) == n && User.getString("Term",i).equals(Str))
				{
					System.out.print("과목 수강학년 : " + User.getInt("Level", i));
					System.out.print("|과목 수강학기 : " + User.getString("Term", i));
					System.out.print("|이수 구분 : " + User.getString("Classify", i));
					System.out.print("|과목 코드 : " + User.getInt("Code", i));
					System.out.print("|과목 명 : " + User.getString("ClassName",i));
					System.out.print("|과목 학점 : " + User.getDouble("Credit",i));
					if(User.getDouble("Grade",i) == -1.0)
					{
						System.out.println("|과목 성적 : 입력되지 않은 정보입니다.");
						sum = sum + User.getDouble("Credit",i);
					}
					else 
					{
						System.out.println("|과목 성적 : " + User.getDouble("Grade",i));
						sum1 = sum1 + User.getDouble("Credit",i);
						tot = tot + (User.getDouble("Credit",i) * User.getDouble("Grade",i));
					}
				}
			}
		}
		else
			for(int i = 4; i<20; i++)
			{
				IntMem[0] = i/4;
				IntMem[1] = i%4;
				for(int j = 0; j<100; j++)
				{
					if(User.getInt("Level",j) == IntMem[0] && User.getString("Term",j).equals(Requ.Term[IntMem[1]]))
					{
						System.out.print("과목 수강학년 : " + User.getInt("Level", j));
						System.out.print("|과목 수강학기 : " + User.getString("Term", j));
						System.out.print("|이수 구분 : " + User.getString("Classify", j));
						System.out.print("|과목 코드 : " + User.getInt("Code", j));
						System.out.print("|과목 명 : " + User.getString("ClassName",j));
						System.out.print("|과목 학점 : " + User.getDouble("Credit",j));
						if(User.getDouble("Grade",j) == -1.0)
						{
							System.out.println("|과목 성적 : 입력되지 않은 정보입니다.");
							sum = sum + User.getDouble("Credit",j);
						}
						else 
						{
							System.out.println("|과목 성적 : " + User.getDouble("Grade",j));
							sum1 = sum1 + User.getDouble("Credit",j);
							tot = tot + (User.getDouble("Credit",j) * User.getDouble("Grade",j));
						}
					}
				}
			}
		if(sum == 0 && sum1 == 0)
			return -2;
		else
		{
			System.out.print("총 이수 학점 : " + (sum+sum1));
			System.out.println("| 평균 성적 : " + (tot/sum1));
			return 1;
		}
	}
	public int User(User User, int n)
	{
		for(int i = 0; i<100; i++)
		{
			if(User.getInt("Code",i) == n)
			{
				System.out.print("과목 수강학년 : " + User.getInt("Level", i));
				System.out.print("|과목 수강학기 : " + User.getString("Term", i));
				System.out.print("|이수 구분 : " + User.getString("Classify", i));
				System.out.print("|과목 코드 : " + User.getInt("Code", i));
				System.out.print("|과목 명 : " + User.getString("ClassName",i));
				System.out.print("|과목 학점 : " + User.getDouble("Credit",i));
				if(User.getDouble("Grade",i) == -1.0)
					System.out.println("|과목 성적 : 입력되지 않은 정보입니다.");
				else
					System.out.println("|과목 성적 : " + User.getDouble("Grade",i));
				return i;
			}
		}
		return -2;
	}
	public int User(User User, String Str)
	{
		double sum = 0;
		double sum1 = 0;
		double tot = 0;
		for(int i = 0; i<100; i++)
		{
			StrMem[1] = User.getString("Classify",i);
			if(StrMem[1]!=null)
			{
				if(StrMem[1].equals(Str))
				{
					System.out.print("과목 수강학년 : " + User.getInt("Level", i));
					System.out.print("|과목 수강학기 : " + User.getString("Term", i));
					System.out.print("|이수 구분 : " + User.getString("Classify", i));
					System.out.print("|과목 코드 : " + User.getInt("Code", i));
					System.out.print("|과목 명 : " + User.getString("ClassName",i));
					System.out.print("|과목 학점 : " + User.getDouble("Credit",i));
					if(User.getDouble("Grade",i) == -1.0)
					{
						System.out.println("|과목 성적 : 입력되지 않은 정보입니다.");
						sum = sum + User.getDouble("Credit",i);
					}
					else 
					{
						System.out.println("|과목 성적 : " + User.getDouble("Grade",i));
						sum1 = sum1 + User.getDouble("Credit",i);
						tot = tot + (User.getDouble("Credit",i) * User.getDouble("Grade",i));
					}
				}
			}
		}
		if(sum == 0 && sum1 == 0)
			return -2;
		else
		{
			System.out.print("총 이수 학점 : " + (sum+sum1));
			System.out.println("| 평균 성적 : " + (tot/sum1));
			return -1;
		}
	}
	
	public void Requ(Requ Requ, int n)
	{
		switch (n)
		{
			case 0 :
				System.out.print("입학연도 : " + Requ.Admi);
				System.out.println("|전공 : " + Requ.Major);
				break;
			case 1 :
				System.out.print("이수 구분 : ");
				for(int i = 0; Requ.Classify[i] != null; i++)
				{
					System.out.print(Requ.Classify[i] + "|");
				}
				System.out.println("");
				break;	
			case 10 :
				System.out.println("---------사용자의 필요 요건 입니다.---------");
				System.out.println("1.입학연도 : " + Requ.Admi);
				System.out.println("2.전공 : " + Requ.Major);
				System.out.println("3.필요 이수 학점 : ");
				for(int i = 0; Requ.Classify[i] != null; i++)
					System.out.printf("구분 : %s , 학점 : %lf\n",Requ.Classify[i],Requ.Credit[i]);
				break;
		}
	}
}
