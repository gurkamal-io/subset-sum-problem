import java.util.*;

//------------------------------------------------------
public class Foothill
{
   // ------- main --------------
   public static void main(String[] args) throws Exception
   {  
      int targetSum = 72;
      ArrayList<Integer> originalDataSet = new ArrayList<Integer>();
      ArrayList<Sublist> sublistChoices = new ArrayList<Sublist>();
      int k, j, numSets, max, kBest, masterSum;
      boolean foundPerfect;
      
      originalDataSet.add(2); originalDataSet.add(12); originalDataSet.add(22);
      originalDataSet.add(5); originalDataSet.add(15); originalDataSet.add(25);
      originalDataSet.add(9); originalDataSet.add(19); originalDataSet.add(29);
      
      // Implement Algorithm

      sublistChoices.get(kBest).showSublist();
      
   }
   
   public static void printArrayList(ArrayList<Integer> arrayListToPrint)
   {
      System.out.println(Arrays.deepToString(arrayListToPrint.toArray()));
   }
}