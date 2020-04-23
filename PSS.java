import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class PSS
{
    private List<Task> schedule = new ArrayList<>();

    public void add(Task task)
    {

    }
    public void delete(Task task)
    {

    }
    public void edit(Task task)
    {

    }
    public static void main(String args[])
    {
        System.out.println("Welcome to PSS");
        JSONObject json = new JSONObject();
        int choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Choice: (1 for add), (2 for edit), (3 for delete)");
        choice = scan.nextInt();
        while(choice != 4) // there are more choices didnt add yet
        {
            switch(choice)
                case 1: //adding method

                case 2: // edit method
                case 3: // delete
                default:

        }
    }
}
