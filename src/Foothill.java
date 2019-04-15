import java.util.*;

//------------------------------------------------------
public class Foothill
{
   // ------- main --------------
   public static void main(String[] args) throws Exception
   {
      int targetSum = 15;
      
      // dataSet represents the Set S of integers
      ArrayList<Integer> originalDataSet = new ArrayList<Integer>();
      originalDataSet.add(98);
      originalDataSet.add(51);
      originalDataSet.add(9);
      originalDataSet.add(106);
      originalDataSet.add(77);
      originalDataSet.add(18);
      
      printArrayList(originalDataSet);
      
      // choices represents the Set Col of Sublists
//      ArrayList<Sublist> choices = new ArrayList<Sublist>();
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