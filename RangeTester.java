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
  }
}
