package integer_algorithm;

import java.util.ArrayList;

public class App
{
   public static void main(String[] args) throws Exception
   {
      final int TARGET = 72;
      ArrayList<Integer> dataSet = new ArrayList<Integer>();
      ArrayList<Sublist> choices = new ArrayList<Sublist>();
      int dataIndex, choiceIndex, bestChoiceIndex;
      int maxSum, newSum, bestSum, choiceCount;
      boolean foundPerfect;

      dataSet.add(2); dataSet.add(12); dataSet.add(22);
      dataSet.add(5); dataSet.add(15); dataSet.add(25);
      dataSet.add(9); dataSet.add(19); dataSet.add(29);

      System.out.println("Target Sum: " + TARGET);

      // check algorithm applicability
      maxSum = 0;
      for (dataIndex = 0; dataIndex < dataSet.size(); dataIndex++)
         maxSum += dataSet.get(dataIndex);
      if (maxSum < TARGET)
      {
         System.out.println("The target " + TARGET + " is too large.");
         System.exit(0);
      }

      // algorithm for subset sum problem of positive integers
      choices.add(new Sublist(dataSet));
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
   }
}