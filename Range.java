import java.util.NoSuchElementException;
public class Range implements IntegerSequence
{
  private int start, end, current;
  public Range(int start, int end)
  {
    if (end < start)
    {
      throw new IllegalArgumentException("End value cannot be less than start");
    }
    this.start = start;
    this.end = end;
    current = start;
  }
  public void reset()
  {
    current = start;
  }
  public int length()
  {
    return (end - start) + 1;
  }
  public boolean hasNext()
  {
    return !(current > end);
  }
  public int next()
  {
    if (!hasNext())
    {
      throw new NoSuchElementException("Value of " + current + " does not exist in this Range object");
    }
    int returnThisValue = current;
    current += 1;
    return returnThisValue;
  }
}
