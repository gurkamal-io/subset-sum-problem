import java.util.ArrayList;

public class AlgorithmForiTunesEntry
{
   public static void iTunesEntrySubsetSumProblem() throws Exception
   {
      final int TARGET = 72;
      ArrayList<Integer> dataSet = new ArrayList<Integer>();
      ArrayList<SublistForInteger> choices = new ArrayList<SublistForInteger>();
      int j, k, maxSum, choiceCount, testSum, bestSum, bestSublistIndex;
      boolean foundPerfect;

      dataSet.add(2); dataSet.add(12); dataSet.add(22);
      dataSet.add(5); dataSet.add(15); dataSet.add(25);
      dataSet.add(9); dataSet.add(19); dataSet.add(29);

      System.out.println("Target Sum: " + TARGET);

      // Checking Algorithm Applicability
      maxSum = 0;
      for (j = 0; j < dataSet.size(); j++)
         maxSum += dataSet.get(j);
      if (maxSum < TARGET)
      {
         System.out.println("The target " + TARGET + " is too large.");
         System.exit(0);
      }

      // Algorithm for Subset Sum Problem of Positive Integers
      choices.add(new SublistForInteger(dataSet));
      bestSum = 0;
      bestSublistIndex = 0;
      foundPerfect = false;
      for (j = 0; (j < dataSet.size()); j++)
      {
         choiceCount = choices.size();
         for (k = 0; (k < choiceCount); k++)
         {
            testSum = choices.get(k).getSum() + dataSet.get(j);
            if (testSum <= TARGET)
            {
               choices.add(choices.get(k).addItem(j));
               if (testSum > bestSum)
               {
                  bestSum = testSum;
                  bestSublistIndex = choices.size() - 1;
               }
               if (testSum == TARGET)
               {
                  foundPerfect = true;
                  break;
               }
            }
         }
         if (foundPerfect)
            break;
      }
      choices.get(bestSublistIndex).showSublist();
   }
}
