import java.util.*;

public class IntegerSublist implements Cloneable
{
   private int sum;
   private ArrayList<Integer> dataSet;
   private ArrayList<Integer> indices;
   
   public IntegerSublist(ArrayList<Integer> dataSet)
   {
      this.sum = 0;
      this.dataSet = dataSet;
      this.indices = new ArrayList<Integer>();
   }
   
   public IntegerSublist addItem(int index) throws CloneNotSupportedException
   {
      IntegerSublist newList = clone();
      newList.indices.add(index);
      newList.sum += dataSet.get(index);
      return newList;
   }
   
   @SuppressWarnings("unchecked") // Type Cast Warning
   public IntegerSublist clone() throws CloneNotSupportedException
   {
      IntegerSublist newList = (IntegerSublist)super.clone();
      newList.indices = (ArrayList<Integer>)indices.clone();
      return newList;
   }
   
   public String toString()
   {
      StringBuilder text = new StringBuilder();
      text.append("IntegerSublist -----------------------------\n  sum: " + getSum());
      for(int index : indices)
         text.append("\n  array[" + index + "] = " + dataSet.get(index));
      return text.toString();
   }
   
   public void showSublist() { System.out.println(toString()); }
   
   public int getSum() { return sum; }
}