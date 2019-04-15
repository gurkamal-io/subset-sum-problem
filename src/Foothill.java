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
      int k, j, numSets, max, kBest, masterSum;
      boolean foundPerfect;

      dataSet.add(2); dataSet.add(12); dataSet.add(22);
      dataSet.add(5); dataSet.add(15); dataSet.add(25);
      dataSet.add(9); dataSet.add(19); dataSet.add(29);
      
      //choices.add(new Sublist(dataSet));
      
      Sublist a = new Sublist(dataSet);
      a.showSublist();
      Sublist b = a.addItem(0);
      b.showSublist();
      Sublist c = b.addItem(4);
      c.showSublist();
      Sublist d = c.addItem(2);
      d.showSublist();
      Sublist e = d.addItem(3);
      e.showSublist();
      Sublist f = e.addItem(1);
      f.showSublist();
      Sublist g = f.addItem(5);
      g.showSublist();
      
      
      // loop over all elements x in S
      
      
//      loop over all elements, L that already are members of Col
//      if sum(L) + x < t, add the sublist L + x to Col
//      if sum(L) + x == t, break from both loops
//      of the sublists that end up in Col, find the one, L', with the largest sum()
      
      //choices.get(kBest).showSublist();
      
   }
   
   public static void printArrayList(ArrayList<Integer> arrayListToPrint)
   {
      System.out.println(Arrays.deepToString(arrayListToPrint.toArray()));
   }
}