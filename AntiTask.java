public class AntiTask extends Task
{
    private int date;

    public AntiTask(String name, String type, int startTime, int duration, int date)
    {
        super(name, type, startTime, duration);
        this.date = date;
    }
}
