import java.util.*;

public class Sublist implements Cloneable
{
   private ArrayList<Integer> originalDataSet;
   private ArrayList<Integer> indices; // Represents the data in this Sublist
   
   // Constructor
   public Sublist(ArrayList<Integer> originalDataSet) 
   {
      this.originalDataSet = originalDataSet;
      this.indices = new ArrayList<Integer>();
   }
   
   public int getSum() 
   {
      int sum = 0;
      if (this.getSize() == 0) 
      {
         return sum;
      }
      for (int sublistIndex = 0; sublistIndex < this.getSize(); sublistIndex++)
      {
         sum += this.getValue(sublistIndex);
      }
      return sum;
   }
   
   private int getSize()
   {
      return this.indices.size(); 
   }
   
   private int getValue(int sublistIndex)
   {
      int index = this.getIndex(sublistIndex);
      return this.originalDataSet.get(index);
   }
   
   private int getIndex(int sublistIndex)
   {
      return this.indices.get(sublistIndex);
   }
   
   public Sublist clone() throws CloneNotSupportedException
   {
      Sublist clonedSublist = (Sublist)super.clone();
      clonedSublist.indices = (ArrayList<Integer>)indices.clone();
      return clonedSublist;
   }
   
   public Sublist addItem(int originalIndex) throws CloneNotSupportedException
   {
      Sublist appendedSublist = this.clone();
      appendedSublist.indices.add(originalIndex);
      return appendedSublist;
   }
   
   public void showSublist()
   {
      System.out.println(this.toString());
   }
   
   public String toString()
   {
      StringBuilder display = new StringBuilder();
      display.append("Sublist -----------------------------");
      display.append("\n  sum: " + this.getSum());
      display.append("\n  size: " + this.getSize());
      
      for (int sublistIndex = 0; sublistIndex < this.getSize(); sublistIndex++)
      {
         int index = this.getIndex(sublistIndex);
         int value = this.getValue(sublistIndex);
         display.append("\n  array[" + index + "] = " + value);
      }
      return display.toString();
   }
}