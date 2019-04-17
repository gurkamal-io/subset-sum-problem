package subset_sum_problem;

import abstract_data_type.*;


import java.util.ArrayList;

public class SublistForiTunesEntry implements Cloneable
{
   private int sum;
   private ArrayList<iTunesEntry> dataSet;
   private ArrayList<Integer> indices;

   public SublistForiTunesEntry(ArrayList<iTunesEntry> dataSet)
   {
      this.sum = 0;
      this.dataSet = dataSet;
      this.indices = new ArrayList<Integer>();
   }
   
   public SublistForiTunesEntry addItem(int index) throws CloneNotSupportedException
   {
      SublistForiTunesEntry newList = clone();
      newList.indices.add(index);
      newList.sum += dataSet.get(index).getTime();
      return newList;
   }
   
   @SuppressWarnings("unchecked") // Type Cast Warning
   public SublistForiTunesEntry clone() throws CloneNotSupportedException
   {
      SublistForiTunesEntry newList = (SublistForiTunesEntry)super.clone();
      newList.indices = (ArrayList<Integer>)indices.clone();
      return newList;
   }
   
   public String toString()
   {
      StringBuilder text = new StringBuilder();
      text.append("Sublist -----------------------------\n  sum: " + getSum());
      for(int index : indices)
         text.append("\n  array[" + index + "] = "
               + dataSet.get(index).getArtist()
               + " | "
               + dataSet.get(index).getTitle()
               + " | "
               + dataSet.get(index).convertTimeToString());
      return text.toString();
   }
   
   public void showSublist() { System.out.println(toString()); }
   
   public int getSum() { return sum; }
}