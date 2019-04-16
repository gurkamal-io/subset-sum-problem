import java.util.ArrayList;

public class SublistForiTunesEntry implements Cloneable
{
   private int sum;
   private ArrayList<Integer> dataSet;
   private ArrayList<Integer> indices;

   public SublistForiTunesEntry(ArrayList<Integer> dataSet)
   {
      this.sum = 0;
      this.dataSet = dataSet;
      this.indices = new ArrayList<Integer>();
   }
   
   public SublistForiTunesEntry addItem(int index) throws CloneNotSupportedException
   {
      SublistForiTunesEntry newList = clone();
      newList.indices.add(index);
      newList.sum += dataSet.get(index);
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
      text.append("SublistForInteger -----------------------------\n  sum: " + getSum());
      for(int index : indices)
         text.append("\n  array[" + index + "] = " + dataSet.get(index));
      return text.toString();
   }
   
   public void showSublist() { System.out.println(toString()); }
   
   public int getSum() { return sum; }
}