import java.util.NoSuchElementException;
public class RangeTester
{
  public static void main(String[] args)
  {
    IntegerSequence r = new Range(10,20);
    while (r.hasNext())
    {
      System.out.print(r.next());
      {
        if (r.hasNext())
        {
          System.out.print(", ");
        }
      }
    }
    System.out.println();
    IntegerSequence s = new Range(-5,5);
    while (s.hasNext())
    {
      System.out.print(s.next());
      {
        if (s.hasNext())
        {
          System.out.print(", ");
        }
      }
    }
    System.out.println();
    IntegerSequence t = new Range(-20,-10);
    while (t.hasNext())
    {
      System.out.print(t.next());
      {
        if (t.hasNext())
        {
          System.out.print(", ");
        }
      }
    }
    System.out.println();
    IntegerSequence f = new Range(-5,-6);
    try
    {
      System.out.println(f.next());
    }
    catch (NoSuchElementException e)
    {
      System.out.println(e);
    }
    IntegerSequence g = new Range(-4,-3);
    System.out.println(g.next());
    System.out.println(g.next());
    try
    {
      System.out.println(g.next());
    }
    catch (NoSuchElementException e)
    {
      System.out.println(e);
    }
  }
}
