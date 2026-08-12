public class Thermostat
{
    private String location;
    private int temperature;

    private static final int MIN = 10;
    private static final int MAX = 30;

    private static int activeCount = 0;

    public Thermostat(String location, int startTemp)
    {
        this.location = location;
        if (startTemp >= MIN && startTemp <= MAX) {
            temperature = startTemp;
        }
        else
        {
            temperature = 22;
        }

        activeCount++;
    }

    public Thermostat(String location)
    {
        this(location, 22);
    }

    public void raise()
    {
        if (temperature < MAX)
        {
            temperature++;
        }
    }
}
