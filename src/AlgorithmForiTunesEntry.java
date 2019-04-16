import java.text.*;
import java.util.*;

import java.util.ArrayList;

public class AlgorithmForiTunesEntry
{
   public static void iTunesEntrySubsetSumProblem() throws Exception
   {
      final int TARGET = 3600;
      ArrayList<iTunesEntry> dataSet = new ArrayList<iTunesEntry>();
      ArrayList<SublistForiTunesEntry> choices = new ArrayList<SublistForiTunesEntry>();
      int dataIndex, choiceIndex, bestChoiceIndex;
      int maxSum, newSum, bestSum, choiceCount;
      boolean foundPerfect;

      System.out.println("Target Sum: " + TARGET);

      // for formatting and timing
      NumberFormat tidy = NumberFormat.getInstance(Locale.US);
      tidy.setMaximumFractionDigits(4);
      long startTime, stopTime;
























      /*
      // Checking Algorithm Applicability
      maxSum = 0;
      for (dataIndex = 0; dataIndex < dataSet.size(); dataIndex++)
         maxSum += dataSet.get(dataIndex);
      if (maxSum < TARGET)
      {
         System.out.println("The target " + TARGET + " is too large.");
         System.exit(0);
      }

      // Algorithm for Subset Sum Problem of Positive Integers
      choices.add(new SublistForInteger(dataSet));
      bestSum = 0;
      bestChoiceIndex = 0;
      foundPerfect = false;
      for (dataIndex = 0; (dataIndex < dataSet.size()); dataIndex++)
      {
         choiceCount = choices.size();
         for (choiceIndex = 0; (choiceIndex < choiceCount); choiceIndex++)
         {
            newSum = choices.get(choiceIndex).getSum() + dataSet.get(dataIndex);
            if (newSum <= TARGET)
            {
               choices.add(choices.get(choiceIndex).addItem(dataIndex));
               if (newSum > bestSum)
               {
                  bestSum = newSum;
                  bestChoiceIndex = choices.size() - 1;
               }
               if (newSum == TARGET)
               {
                  foundPerfect = true;
                  break;
               }
            }
         }
         if (foundPerfect)
            break;
      }
      choices.get(bestChoiceIndex).showSublist();

       */
   }
}
