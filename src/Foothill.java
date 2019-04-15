import java.util.*;

//------------------------------------------------------
public class Foothill
{
   // ------- main --------------
   public static void main(String[] args) throws Exception
   {  
      int target = 72;
      ArrayList<Integer> dataSet = new ArrayList<Integer>();
      ArrayList<Sublist> choices = new ArrayList<Sublist>();
      //int numSets, max, kBest, masterSum;
      boolean found = false;

      dataSet.add(2); dataSet.add(12); dataSet.add(22);
      dataSet.add(5); dataSet.add(15); dataSet.add(25);
      dataSet.add(9); dataSet.add(19); dataSet.add(29);
      
      choices.add(new Sublist(dataSet));
      Sublist perfectMatch;
      
      // k is index in dataSet
      
      int dataCount = dataSet.size();
      
      
      for (int k = 0; k < dataCount && !found; k++) 
      {
         int dataAtK = dataSet.get(k);
         int choiceCount = choices.size();
         
         for (int j = 0; j < choiceCount && !found; j++)
         {
            Sublist choiceAtJ = choices.get(j);
            int testSum = choiceAtJ.getSum() + dataAtK;
            
            if (testSum <= target) 
            {
               Sublist newChoice = choiceAtJ.addItem(k);
               choices.add(newChoice);
               
               if (testSum == target)
               {
                  found = true;
                  perfectMatch = newChoice;
                  perfectMatch.showSublist();
               }
            }
         }
      }

      
      //printArrayList(choices);
      
      
      
      
      
      
      
      
      // loop over all elements x in S
      
      
//      loop over all elements, L that already are members of Col
//      if sum(L) + x < t, add the sublist L + x to Col
//      if sum(L) + x == t, break from both loops
//      of the sublists that end up in Col, find the one, L', with the largest sum()
      
      //choices.get(kBest).showSublist();
      
   }
   
   public static <E> void printArrayList(ArrayList<E> arrayListToPrint)
   {
      System.out.println(Arrays.deepToString(arrayListToPrint.toArray()));
   }
   
   public static void printArrayList1(ArrayList<Integer> arrayListToPrint)
   {
      System.out.println(Arrays.deepToString(arrayListToPrint.toArray()));
   }
}