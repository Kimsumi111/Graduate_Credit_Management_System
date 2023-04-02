import java.util.Scanner;
public class menu
{
	public static void main(String[] args)
	{
		int Proc = 0; 
		
		int Id = 0;
		int Pass = 0;
		int UserE = 0;
		int UserCourse = 0;
		String[][] Course = new String[100][100];

		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i<100; i++)
			for(int j = 0; j<100; j++)
			{
						Course[i][j] = "";
			}
					
		Course = LoadCourseData();
		
		while(Proc == 0)
		{
			int Ans = 0;
			if(Id == 0)
			{
				System.out.println("학번을 입력해주세요 : ");
				Id = input.nextInt();
			}
			if(Pass == 0)
			{
				System.out.println("비밀번호를 설정해주세요 : ");
				Pass = input.nextInt();
			}
			System.out.println("비밀번호를 다시 한번 입력해주세요 : ");
			Ans = input.nextInt();
			if(Id != 0 && Pass == Ans)
				Proc++;
		}
		while(Proc == 1)
		{
			int tmp1 = 0;
			int tmp2 = 0;
			System.out.println("--------안내에 따라 정보를 입력해주세요---------");
			UserE = Id / 1000000;
			System.out.println("단과를 선택해주세요");
			for (int i = 1; i<100; i++ )
			{
				if(Course[i][0] != null)
					System.out.println(i + ":" + Course[i][0]);
				else
					break;
			}
			tmp1 = input.nextInt();
			System.out.println("전공을 선택해주세요");
			for (int i = 1; i<100; i++)
			{
				if(Course[tmp1][i] != null)
					System.out.println(i + ":" + Course[tmp1][i]);
				else
					break;
			}
			tmp2 = input.nextInt();
			if (UserE != 0 && Course[tmp1][tmp2] != null)
			{
				UserCourse = (tmp1*100)+(tmp2);
				Proc++;
			}
			else
				System.out.println("아직 준비되지 않은 정보이거나 잘못된 입력입니다.");
		}
		while(Proc == 2)
		{
			int Ans = 0;
			int Mode = 0;
			System.out.println("---------1~6번중 수행할 기능을 선택하세요---------");
			System.out.println("0 : 사용자 정보를 확인/수정합니다(관리자권한이 필요합니다.)");
			System.out.println("1 : 강의를 입력합니다");
			System.out.println("2 : 성적을 입력합니다");
			System.out.println("3 : 강의목록을 수정합니다");
			System.out.println("4 : 성적입력을 수정합니다");
			System.out.println("5 : 사용자의 수강 정보를 조회 합니다");
			System.out.println("6 : 종료합니다" );
			Mode = input.nextInt();
			switch(Mode)
			{
			case 0:
				System.out.println("관리자 권한이 필요합니다. 비밀번호를 입력하세요: ");
				Ans = input.nextInt();
				int state = 0;
				int tmp1 = 0;
				int tmp2 = 0;
				int Ans1 = 0;
				if (Ans != Pass)
				{
					System.out.println("비밀번호가 틀립니다.");
					break;
				}
				while (state == 0)
				{
					System.out.println(" 1: 사용자 정보 확인 / 2: 사용자 정보 수정 / 3 : 나가기");
					Ans1 = input.nextInt();
				
					if (Ans1 == 1)
					{
						System.out.println("---------사용자 정보---------");
						tmp1 = Id/1000000;
						System.out.println("입학 연도 : " + tmp1);
						tmp1 = UserCourse/100;
						System.out.println("단과 : " + Course[tmp1][0]);
						tmp2 = UserCourse%100;
						System.out.println("전공 : " + Course[tmp1][tmp2]);
						Ans1 = 0;
					}
					else if (Ans1 == 2)
					{
						System.out.println("아직 준비가 안되었습니다.");
						state = 0;
					}
					else if (Ans1 == 3)
						break;
					else
						System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요.");
				}
				break;
			case 1:
				System.out.println("아직 준비가 안되었습니다.1");
				break;
			case 2:
				System.out.println("아직 준비가 안되었습니다.2");
				break;
			case 3:
				System.out.println("아직 준비가 안되었습니다.3");
				break;
			case 4:
				System.out.println("아직 준비가 안되었습니다.");
				break;
			case 5:
				System.out.println("아직 준비가 안되었습니다.");
				break;
			case 6:
				System.out.println("이용해주셔서 감사합니다.");
				Proc = 10;
				break;
			}
		}
	}
	public static String[][] LoadCourseData()
	{
		String[][] Course = new String[100][100];
		Course[1][0] = "인문대학";
		Course[2][0] = "사회과학대학";
		Course[3][0] = "자연과학대학";
		Course[4][0] = "경영대학";
		
		Course[5][0] = "공과대학";
		Course[5][1] = "건축공학부 건축공학전공";
		Course[5][2] = "건축공학부 건축시스템공학전공";
		Course[5][3] = "기계공학부";
		Course[5][4] = "나노 신소재공학부 고분자공학전공";
		Course[5][5] = "나노 신소재공학부 금속재료공학전공";
		Course[5][6] = "나노 신소재공학부 세라믹공학전공";
		Course[5][7] = "산업시스템공학부";
		Course[5][8] = "항공우주및소프트웨어공학부";
		Course[5][9] = "건축학과";
		Course[5][10] = "도시공학과";
		Course[5][11] = "반도체공학과";
		Course[5][12] = "전기공학과";
		Course[5][13] = "전자공학과";
		Course[5][14] = "제어로봇공학과";
		Course[5][15] = "토목공학과";
		Course[5][16] = "화학공학과";
		
		Course[6][0] = "농업생명과학대학";
		Course[7][0] = "법과대학";
		Course[8][0] = "사범대학";
		Course[9][0] = "수의과대학";
		Course[10][0] = "의과대학";
		Course[11][0] = "간호대학";
		Course[12][0] = "해양과학대학";
		Course[13][0] = "약학대학";
		Course[14][0] = "본부대학1";
		Course[15][0] = "건설환경공과대학";
		Course[16][0] = "융합기술공과대학";
		Course[17][0] = "본부대학2";
		
		
		return Course;
	}
}
