import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence
{
  private int currentIndex;
  private int[] data;
  public ArraySequence(int[] other)
  {
    this.data = new int[other.length];
    for (int i = 0; i < other.length; i++)
    {
      this.data[i] = other[i];
    }
    this.currentIndex = 0;
  }
  public ArraySequence(IntegerSequence otherseq)
  {
    this.data = new int[otherseq.length()];
    otherseq.reset();
    for (int i = 0; i < otherseq.length(); i++)
    {
      this.data[i] = otherseq.next();
    }
    otherseq.reset();
  }
  public boolean hasNext()
  {
    return !(this.currentIndex >= this.data.length);
  }
  public int next()
  {
    if (!hasNext())
    {
      throw new NoSuchElementException("Index of " + this.currentIndex + " does not exist in this ArraySequence object");
    }
    int returnThisValue = this.data[this.currentIndex];
    this.currentIndex += 1;
    return returnThisValue;
  }
  public int length()
  {
    return this.data.length;
  }
  public void reset()
  {
    this.currentIndex = 0;
  }
}
