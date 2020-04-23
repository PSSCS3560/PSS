public class TransientTask extends Task
{
    private int date;

    public TransientTask(String name, String type, int startTime, int duration, int date)
    {
        super(name, type, startTime, duration);
        this.date = date;
    }
}
