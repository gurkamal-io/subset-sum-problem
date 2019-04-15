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
   
   public int getSum() 
   {
      return this.sum;
   }
   
   public Sublist addItem(int index) throws CloneNotSupportedException
   {
      Sublist newSublist = this.clone();
      newSublist.indices.add(index);
      newSublist.sum += this.sum;
      return newSublist;
   }
   
   public void showSublist()
   {
      System.out.println(this.toString());
   }
   
   @SuppressWarnings("unchecked") // Suppressing Unchecked Type Cast Warning
   public Sublist clone() throws CloneNotSupportedException
   {
      Sublist newSublist = (Sublist)super.clone();
      newSublist.indices = (ArrayList<Integer>)indices.clone();
      return newSublist;
   }
   
   public String toString()
   {
      StringBuilder text = new StringBuilder();
      text.append("Sublist -----------------------------");
      text.append("\n  sum: " + this.getSum());
      text.append("\n  size: " + this.getSize());
      for (int subIndex = 0; subIndex < this.getSize(); subIndex++)
      {
         int index = this.getIndex(subIndex);
         int value = this.getValue(subIndex);
         text.append("\n  array[" + index + "] = " + value);
      }
      return text.toString();
   }
   
   private int getSize() 
   {
      return this.indices.size(); 
   }
   
   private int getValue(int subIndex)
   {
      int index = this.getIndex(subIndex);
      return this.dataSet.get(index);
   }
   
   private int getIndex(int subIndex)
   {
      return this.indices.get(subIndex);
   }
}