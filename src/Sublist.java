import java.util.*;

public class Sublist implements Cloneable
{
   private int sum;
   private ArrayList<Integer> dataSet;
   private ArrayList<Integer> indices;
   
   public Sublist(ArrayList<Integer> dataSet) 
   {
      this.sum = 0;
      this.dataSet = dataSet;
      this.indices = new ArrayList<Integer>();
   }
   
   public Sublist addItem(int index) throws CloneNotSupportedException
   {
      Sublist newList = clone();
      newList.indices.add(index);
      newList.sum += dataSet.get(index);
      return newList;
   }
   
   @SuppressWarnings("unchecked") // Type Cast Warning
   public Sublist clone() throws CloneNotSupportedException
   {
      Sublist newList = (Sublist)super.clone();
      newList.indices = (ArrayList<Integer>)indices.clone();
      return newList;
   }
   
   public String toString()
   {
      StringBuilder text = new StringBuilder();
      text.append("Sublist -----------------------------\n  sum: " + getSum());
      for(int index : indices)
         text.append("\n  array[" + index + "] = " + dataSet.get(index));
      return text.toString();
   }
   
   public void showSublist() { System.out.println(toString()); }
   
   public int getSum() { return sum; }
}