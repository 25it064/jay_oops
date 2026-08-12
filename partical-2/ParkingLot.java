public class ParkingLot
{
    private int twowheelers;
    private int fourwheelers;
    
    private final int TwoCap;
    private final int fourCap;
    
    private static long revenue = 0;
    
    public ParkingLot(int twoCap, int fourCap)
    {
        this.twoCap = twoCap;
        this.fourCap = fourCap;
        twowheelers = 0;
        fourwheelers = 0;
    }
    
    public void park(String type)
    {
        if (type.equals("two"))
        {
            if (twowheelers < TwoCap)
            {
                twowheelers++;
                revenue = revenue + 20;
                System.out.println("Two Wheeler Parked");
            }
            else
            {
                System.out.println("Two Wheeler Section Full");
            }
        }
        else if (type.equals("four"))
        {
            if (fourwheelers < fourCap)
            {
                // Note: The image cuts off here
