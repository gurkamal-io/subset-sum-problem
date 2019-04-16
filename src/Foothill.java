import java.util.*;

public class Foothill
{
   public static void main(String[] args) throws Exception
   {
      final int TARGET = 72;
      ArrayList<Integer> dataSet = new ArrayList<Integer>();
      ArrayList<Sublist> choices = new ArrayList<Sublist>();
      int j, k, choiceCount, testSum, bestSum, bestSublistIndex;
      boolean foundPerfect;

      dataSet.add(2); dataSet.add(12); dataSet.add(22);
      dataSet.add(5); dataSet.add(15); dataSet.add(25);
      dataSet.add(9); dataSet.add(19); dataSet.add(29);

      choices.add(new Sublist(dataSet));
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