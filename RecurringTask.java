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
    public void setStartDate(int date)
    {
        startDate = date;
    }
    public void setEndDate(int date)
    {
        endDate = date;
    }
    public void setFrequency(int freq)
    {
        frequency = freq;
    }
    public int getStartDate()
    {
        return startDate;
    }
    public int getEndDate()
    {
        return endDate;
    }
    public int getFrequency()
    {
        return frequency;
    }
}
