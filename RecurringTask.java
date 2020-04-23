public class RecurringTask extends Task
{
    private int startDate;
    private int endDate;
    private int frequency;

    public RecurringTask(String name, String type, int startTime, int duration, int startDate, int endDate, int frequency)
    {
        super(name, type, startTime, duration);
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
    }
}
