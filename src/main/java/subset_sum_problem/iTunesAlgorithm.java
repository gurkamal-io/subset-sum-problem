package subset_sum_problem;

import abstract_data_type.*;
import java.text.*;
import java.util.*;

public class iTunesAlgorithm
{
   public static void iTunesEntrySubsetSumProblem() throws Exception
   {
      final int TARGET = 3600;
      ArrayList<iTunesEntry> dataSet = new ArrayList<iTunesEntry>();
      ArrayList<iTunesSublist> choices = new ArrayList<iTunesSublist>();
      int dataIndex, choiceIndex, bestChoiceIndex, k;
      int maxSum, newSum, bestSum, choiceCount;
      int arraySize;
      boolean foundPerfect;

      // for formatting and timing
      NumberFormat tidy = NumberFormat.getInstance(Locale.US);
      tidy.setMaximumFractionDigits(4);
      long startTime, stopTime;

      // read the iTunes Data
      iTunesEntryReader tunesInput = new iTunesEntryReader("itunes_file.txt");

      // test the success of the read:
      if (tunesInput.readError())
      {
         System.out.println("couldn't open " + tunesInput.getFileName()
               + " for input.");
         return;
      }

      // load the dataSet ArrayList with the iTunes:
      arraySize = tunesInput.getNumTunes();
      for (k = 0; k < arraySize; k++)
         dataSet.add(tunesInput.getTune(k));

      choices.clear();
      System.out.println("Target time: " + TARGET);

      // check algorithm applicability
      maxSum = 0;
      for (dataIndex = 0; dataIndex < dataSet.size(); dataIndex++)
         maxSum += dataSet.get(dataIndex).getTime();
      if (maxSum < TARGET)
      {
         System.out.println("The target " + TARGET + " is too large.");
         System.exit(0);
      }

      // algorithm for subset sum problem of iTunesEntry abstract data type
      choices.add(new iTunesSublist(dataSet));
      bestSum = 0;
      bestChoiceIndex = 0;
      foundPerfect = false;
      for (dataIndex = 0; (dataIndex < dataSet.size()); dataIndex++)
      {
         choiceCount = choices.size();
         for (choiceIndex = 0; (choiceIndex < choiceCount); choiceIndex++)
         {
            newSum = choices.get(choiceIndex).getSum()
                  + dataSet.get(dataIndex).getTime();
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

class iTunesSublist implements Cloneable
{
   private int sum;
   private ArrayList<iTunesEntry> dataSet;
   private ArrayList<Integer> indices;

   public iTunesSublist(ArrayList<iTunesEntry> dataSet)
   {
      this.sum = 0;
      this.dataSet = dataSet;
      this.indices = new ArrayList<Integer>();
   }
   
   public iTunesSublist addItem(int index) throws CloneNotSupportedException
   {
      iTunesSublist newList = clone();
      newList.indices.add(index);
      newList.sum += dataSet.get(index).getTime();
      return newList;
   }
   
   @SuppressWarnings("unchecked") // Type Cast Warning
   public iTunesSublist clone() throws CloneNotSupportedException
   {
      iTunesSublist newList = (iTunesSublist)super.clone();
      newList.indices = (ArrayList<Integer>)indices.clone();
      return newList;
   }
   
   public String toString()
   {
      StringBuilder text = new StringBuilder();
      text.append("Sublist -----------------------------\n  sum: " + getSum());
      for(int index : indices)
         text.append("\n  array[" + index + "] = "
               + dataSet.get(index).getArtist()
               + " | "
               + dataSet.get(index).getTitle()
               + " | "
               + dataSet.get(index).convertTimeToString());
      return text.toString();
   }
   
   public void showSublist() { System.out.println(toString()); }
   
   public int getSum() { return sum; }
}