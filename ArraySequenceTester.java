public class ArraySequenceTester
{
  public static void main(String[] args)
  {
    int[]nums = {1,3,5,0,-1,3,9};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println("ArraySequence(array):");
    while(as.hasNext()){
    System.out.print(as.next()+", ");
}
System.out.println();
IntegerSequence r = new Range(10,20);
IntegerSequence As = new ArraySequence(r);

System.out.println("ArraySequence(seq):");
while(As.hasNext()){
System.out.print(As.next()+", ");
}
System.out.println();
  }
}
