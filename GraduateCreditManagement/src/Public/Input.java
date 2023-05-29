package Public;
import java.util.Scanner;

public class Input {
    Requ requ = new Requ();
    Print print = new Print();
    Search search = new Search();

    public int getInt(int a, int b, int c)
    {
        int tmp;
        while (true)
        {
            try
            {
                print.guide(c);
                Scanner input = new Scanner(System.in);
                tmp = input.nextInt();
                if (tmp >= a && tmp <= b)
                    return tmp;
                else
                    print.error(-1);
            }
            catch (Exception e) {print.error(-1);}
        }
    }

    public double getDouble(double a, double b, int c)
    {
        double tmp;
        while (true)
        {
            try
            {
                print.guide(c);
                Scanner input = new Scanner(System.in);
                tmp = input.nextDouble();
                if (tmp >= a && tmp <= b)
                    return tmp;
                else
                    print.error(-1);
            } 
            catch (Exception e) {print.error(-1);}
        }
    }

    public String getString(int c)
    {
        String tmp;
        while (true)
        {
            print.guide(c);
            Scanner input = new Scanner(System.in);
            tmp = input.nextLine();
            return tmp;
        }
    }

    public String getString(Requ requ, int c)
    {
        String tmp;
        while (true)
        {
            try
            {
                print.guide(c);
                Scanner input = new Scanner(System.in);
                tmp = input.nextLine();
                if (search.requCategory(tmp, requ) > -1)
                    return tmp;
                print.error(-1);
            }
            catch (Exception e) {print.error(-1);}
        }
    }

    public String getString(String str, int c)
    {
        String tmp;
        while (true)
        {
            switch (str)
            {
                case "Term":
                    print.guide(c);
                    Scanner input = new Scanner(System.in);
                    tmp = input.nextLine();
                    if (search.termEnum(tmp) != null)
                        return tmp;
                    else
                        print.error(-1);
                    break;
            }
        }
    }
}
 // camel case 완료