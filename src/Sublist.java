import java.util.*;

public class Sublist implements Cloneable
{
   private int sum = 0;
   private ArrayList<Integer> originalDataSet;
   private ArrayList<Integer> indices; // Represents the data in this Sublist
   
   // Constructor creates an empty Sublist (no indices)
   public Sublist(ArrayList<Integer> originalDataSet) 
   {
      this.sum = 0;
      this.originalDataSet = originalDataSet;
      this.indices = new ArrayList<Integer>();
   }
   
   // Getter Method
   public int getSum() 
   {
      return this.sum; 
   }
   
   public Sublist clone() throws CloneNotSupportedException
   {
      Sublist clonedSublist = (Sublist)super.clone();
      clonedSublist.indices = (ArrayList<Integer>)indices.clone();
      return clonedSublist;
   }
   
   public Sublist addItem(int indexOfItemToAdd) throws CloneNotSupportedException
   {
      Sublist newSublist = this.clone();
      
      return newSublist;
   }
   
   public void showSublist(){ /* TBD */ }
   
}