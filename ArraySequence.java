import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence
{
  int currentIndex;
  int[] data;
  public ArraySequence(int[] other)
  {
    data = new int[other.length];
    for (int i = 0; i < other.length; i++)
    {
      data[i] = other[i];
    }
  }
  public boolean hasNext()
  {
    if (currentIndex >= data.length)
    {
      return false;
    }
    else
    {
      return true;
    }
  }
  public int next()
  {
    int returnThisValue = data[currentIndex];
    currentIndex += 1;
    return returnThisValue;
  }
  public int length()
  {
    return data.length;
  }
  public void reset()
  {
    currentIndex = 0;
  }
}
