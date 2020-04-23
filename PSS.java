import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class PSS
{
    private List<Task> schedule;
    Scanner scan;
    public PSS()
    {
        schedule = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void add()
    {
        System.out.println("adding");
    }
    public void delete()
    {
        System.out.println("adding");
    }
    public void edit()
    {
        System.out.println("adding");
    }
    public static void main(String args[])
    {
        System.out.println("Welcome to PSS");
        PSS schedule = new PSS();
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Choice: (1 for add), (2 for edit), (3 for delete)");
        choice = scan.nextInt();
        while(choice != 4) // there are more choices didnt add yet
        {

            switch(choice)
            {
                case 1: //adding method
                    schedule.add();
                    break;
                case 2: // edit method
                    schedule.edit();
                    break;
                case 3: // delete
                    schedule.delete();
                    break;
                default:
                    System.out.println("Exiting. Goodbye");
                    System.exit(0);
            }
            System.out.println("Enter Choice: (1 for add), (2 for edit), (3 for delete)");
            choice = scan.nextInt();

        }
    }
}
