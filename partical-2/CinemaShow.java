public class CinemaShow
{
    private String title;
    private int seatsAvailable;
    private final int capacity;
    private private static int totalBooked = 0;
    public CinemaShow(String title, int capacity)
    {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }
    public CinemaShow(String title)
    {
        this(title, 100);
    }
    public boolean book(int n)
    {
        if (n <= seatsAvailable)
        {
            seatsAvailable = seatsAvailable - n;
            totalBooked = totalBooked + n;
            return true;
        }
        else
        {
            return false;
        }
    }
    public void cancel(int n)
    {
        seatsAvailable = seatsAvailable + n;
        if (seatsAvailable > capacity)
        {
            seatsAvailable = capacity;
        }
    }
    public int getSeatsAvailable()
    {
        return seatsAvailable;
    }
}
