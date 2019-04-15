import java.util.*;

//------------------------------------------------------
public class Foothill
{
   // ------- main --------------
   public static void main(String[] args) throws Exception
   {
      int targetSum = 15;
      
      
      
      // originalDataSet represents the Set S of integers
      ArrayList<Integer> originalDataSet = new ArrayList<Integer>();
      originalDataSet.add(98);
      originalDataSet.add(51);
      originalDataSet.add(9);
      
      Sublist a = new Sublist(originalDataSet);
      a.showSublist();
      
      Sublist b = a.addItem(2);
      b.showSublist();
      
      Sublist c = b.addItem(0);
      c.showSublist();
      
      Sublist d = c.addItem(1);
      d.showSublist();
      
     printArrayList(originalDataSet);
  
      // sublistCollection represents the Set Col of Sublists
//      ArrayList<Sublist> sublistCollection = new ArrayList<Sublist>();
//      
//      int k, j, numSets, max, kBest, masterSum;
//      boolean foundPerfect;
//
//      dataSet.add(2);
//      dataSet.add(12);

      // code supplied by student

      //choices.get(kBest).showSublist();
   }
   
   public static void printArrayList(ArrayList<Integer> arrayListToPrint)
   {
      System.out.println(Arrays.deepToString(arrayListToPrint.toArray()));
   }
}