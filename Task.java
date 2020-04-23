public class Task
{
    private String name;
    private String type;
    private int startTime;
    private int duration;

    public Task(String name, String type, int startTime, int duration)
    {
        this.name = name;
        this.type = type;
        this.startTime = startTime;
        this.duration = duration;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setType(String type)
    {
        this.type = type;
    }
    public void setStartTime(int time)
    {
        startTime = time;
    }
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    public String getName()
    {
        return name;
    }
    public String getType()
    {
        return type;
    }
    public int getStartTime()
    {
        return startTime;
    }
    public int getDuration()
    {
        return duration;
    }



}
