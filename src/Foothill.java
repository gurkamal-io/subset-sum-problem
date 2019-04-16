import java.util.*;

//------------------------------------------------------
public class Foothill
{
   // ------- main --------------
   public static void main(String[] args) throws Exception
   {
      final int TARGET = 13;
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




/*
/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=56796:/Applications/IntelliJ IDEA CE.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_201.jdk/Contents/Home/lib/tools.jar:/Users/gurkamalpsc/Documents/repositories/subset-sum-problem/out/production/subset-sum-problem Foothill

j: 0
jthData: 2

k: 0
kthSum: 2

NEW BEST FOUND
kBest: 0
bestSum: 2
k: 0
kthSum: 2

Added new Sublist:
Sublist -----------------------------
  sum: 2
  array[0] = 2

final kBest: 0 at j: 0
final bestSum: 2 at j: 0

j: 1
jthData: 12

k: 0
kthSum: 12

NEW BEST FOUND
kBest: 0
bestSum: 12
k: 0
kthSum: 12

Added new Sublist:
Sublist -----------------------------
  sum: 12
  array[1] = 12

k: 1
kthSum: 14

NEW BEST FOUND
kBest: 1
bestSum: 14
k: 1
kthSum: 14

Added new Sublist:
Sublist -----------------------------
  sum: 14
  array[0] = 2
  array[1] = 12

final kBest: 1 at j: 1
final bestSum: 14 at j: 1

j: 2
jthData: 22

k: 0
kthSum: 22

NEW BEST FOUND
kBest: 0
bestSum: 22
k: 0
kthSum: 22

Added new Sublist:
Sublist -----------------------------
  sum: 22
  array[2] = 22

k: 1
kthSum: 24

NEW BEST FOUND
kBest: 1
bestSum: 24
k: 1
kthSum: 24

Added new Sublist:
Sublist -----------------------------
  sum: 24
  array[0] = 2
  array[2] = 22

k: 2
kthSum: 34

NEW BEST FOUND
kBest: 2
bestSum: 34
k: 2
kthSum: 34

Added new Sublist:
Sublist -----------------------------
  sum: 34
  array[1] = 12
  array[2] = 22

k: 3
kthSum: 36

NEW BEST FOUND
kBest: 3
bestSum: 36
k: 3
kthSum: 36

Added new Sublist:
Sublist -----------------------------
  sum: 36
  array[0] = 2
  array[1] = 12
  array[2] = 22

final kBest: 3 at j: 2
final bestSum: 36 at j: 2

j: 3
jthData: 5

k: 0
kthSum: 5

Added new Sublist:
Sublist -----------------------------
  sum: 5
  array[3] = 5

k: 1
kthSum: 7

Added new Sublist:
Sublist -----------------------------
  sum: 7
  array[0] = 2
  array[3] = 5

k: 2
kthSum: 17

Added new Sublist:
Sublist -----------------------------
  sum: 17
  array[1] = 12
  array[3] = 5

k: 3
kthSum: 19

Added new Sublist:
Sublist -----------------------------
  sum: 19
  array[0] = 2
  array[1] = 12
  array[3] = 5

k: 4
kthSum: 27

Added new Sublist:
Sublist -----------------------------
  sum: 27
  array[2] = 22
  array[3] = 5

k: 5
kthSum: 29

Added new Sublist:
Sublist -----------------------------
  sum: 29
  array[0] = 2
  array[2] = 22
  array[3] = 5

k: 6
kthSum: 39

NEW BEST FOUND
kBest: 6
bestSum: 39
k: 6
kthSum: 39

Added new Sublist:
Sublist -----------------------------
  sum: 39
  array[1] = 12
  array[2] = 22
  array[3] = 5

k: 7
kthSum: 41

NEW BEST FOUND
kBest: 7
bestSum: 41
k: 7
kthSum: 41

Added new Sublist:
Sublist -----------------------------
  sum: 41
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[3] = 5

final kBest: 7 at j: 3
final bestSum: 41 at j: 3

j: 4
jthData: 15

k: 0
kthSum: 15

Added new Sublist:
Sublist -----------------------------
  sum: 15
  array[4] = 15

k: 1
kthSum: 17

Added new Sublist:
Sublist -----------------------------
  sum: 17
  array[0] = 2
  array[4] = 15

k: 2
kthSum: 27

Added new Sublist:
Sublist -----------------------------
  sum: 27
  array[1] = 12
  array[4] = 15

k: 3
kthSum: 29

Added new Sublist:
Sublist -----------------------------
  sum: 29
  array[0] = 2
  array[1] = 12
  array[4] = 15

k: 4
kthSum: 37

Added new Sublist:
Sublist -----------------------------
  sum: 37
  array[2] = 22
  array[4] = 15

k: 5
kthSum: 39

Added new Sublist:
Sublist -----------------------------
  sum: 39
  array[0] = 2
  array[2] = 22
  array[4] = 15

k: 6
kthSum: 49

NEW BEST FOUND
kBest: 6
bestSum: 49
k: 6
kthSum: 49

Added new Sublist:
Sublist -----------------------------
  sum: 49
  array[1] = 12
  array[2] = 22
  array[4] = 15

k: 7
kthSum: 51

NEW BEST FOUND
kBest: 7
bestSum: 51
k: 7
kthSum: 51

Added new Sublist:
Sublist -----------------------------
  sum: 51
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[4] = 15

k: 8
kthSum: 20

Added new Sublist:
Sublist -----------------------------
  sum: 20
  array[3] = 5
  array[4] = 15

k: 9
kthSum: 22

Added new Sublist:
Sublist -----------------------------
  sum: 22
  array[0] = 2
  array[3] = 5
  array[4] = 15

k: 10
kthSum: 32

Added new Sublist:
Sublist -----------------------------
  sum: 32
  array[1] = 12
  array[3] = 5
  array[4] = 15

k: 11
kthSum: 34

Added new Sublist:
Sublist -----------------------------
  sum: 34
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[4] = 15

k: 12
kthSum: 42

Added new Sublist:
Sublist -----------------------------
  sum: 42
  array[2] = 22
  array[3] = 5
  array[4] = 15

k: 13
kthSum: 44

Added new Sublist:
Sublist -----------------------------
  sum: 44
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[4] = 15

k: 14
kthSum: 54

NEW BEST FOUND
kBest: 14
bestSum: 54
k: 14
kthSum: 54

Added new Sublist:
Sublist -----------------------------
  sum: 54
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[4] = 15

k: 15
kthSum: 56

NEW BEST FOUND
kBest: 15
bestSum: 56
k: 15
kthSum: 56

Added new Sublist:
Sublist -----------------------------
  sum: 56
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[4] = 15

final kBest: 15 at j: 4
final bestSum: 56 at j: 4

j: 5
jthData: 25

k: 0
kthSum: 25

Added new Sublist:
Sublist -----------------------------
  sum: 25
  array[5] = 25

k: 1
kthSum: 27

Added new Sublist:
Sublist -----------------------------
  sum: 27
  array[0] = 2
  array[5] = 25

k: 2
kthSum: 37

Added new Sublist:
Sublist -----------------------------
  sum: 37
  array[1] = 12
  array[5] = 25

k: 3
kthSum: 39

Added new Sublist:
Sublist -----------------------------
  sum: 39
  array[0] = 2
  array[1] = 12
  array[5] = 25

k: 4
kthSum: 47

Added new Sublist:
Sublist -----------------------------
  sum: 47
  array[2] = 22
  array[5] = 25

k: 5
kthSum: 49

Added new Sublist:
Sublist -----------------------------
  sum: 49
  array[0] = 2
  array[2] = 22
  array[5] = 25

k: 6
kthSum: 59

NEW BEST FOUND
kBest: 6
bestSum: 59
k: 6
kthSum: 59

Added new Sublist:
Sublist -----------------------------
  sum: 59
  array[1] = 12
  array[2] = 22
  array[5] = 25

k: 7
kthSum: 61

NEW BEST FOUND
kBest: 7
bestSum: 61
k: 7
kthSum: 61

Added new Sublist:
Sublist -----------------------------
  sum: 61
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[5] = 25

k: 8
kthSum: 30

Added new Sublist:
Sublist -----------------------------
  sum: 30
  array[3] = 5
  array[5] = 25

k: 9
kthSum: 32

Added new Sublist:
Sublist -----------------------------
  sum: 32
  array[0] = 2
  array[3] = 5
  array[5] = 25

k: 10
kthSum: 42

Added new Sublist:
Sublist -----------------------------
  sum: 42
  array[1] = 12
  array[3] = 5
  array[5] = 25

k: 11
kthSum: 44

Added new Sublist:
Sublist -----------------------------
  sum: 44
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[5] = 25

k: 12
kthSum: 52

Added new Sublist:
Sublist -----------------------------
  sum: 52
  array[2] = 22
  array[3] = 5
  array[5] = 25

k: 13
kthSum: 54

Added new Sublist:
Sublist -----------------------------
  sum: 54
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[5] = 25

k: 14
kthSum: 64

NEW BEST FOUND
kBest: 14
bestSum: 64
k: 14
kthSum: 64

Added new Sublist:
Sublist -----------------------------
  sum: 64
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[5] = 25

k: 15
kthSum: 66

NEW BEST FOUND
kBest: 15
bestSum: 66
k: 15
kthSum: 66

Added new Sublist:
Sublist -----------------------------
  sum: 66
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[5] = 25

k: 16
kthSum: 40

Added new Sublist:
Sublist -----------------------------
  sum: 40
  array[4] = 15
  array[5] = 25

k: 17
kthSum: 42

Added new Sublist:
Sublist -----------------------------
  sum: 42
  array[0] = 2
  array[4] = 15
  array[5] = 25

k: 18
kthSum: 52

Added new Sublist:
Sublist -----------------------------
  sum: 52
  array[1] = 12
  array[4] = 15
  array[5] = 25

k: 19
kthSum: 54

Added new Sublist:
Sublist -----------------------------
  sum: 54
  array[0] = 2
  array[1] = 12
  array[4] = 15
  array[5] = 25

k: 20
kthSum: 62

Added new Sublist:
Sublist -----------------------------
  sum: 62
  array[2] = 22
  array[4] = 15
  array[5] = 25

k: 21
kthSum: 64

Added new Sublist:
Sublist -----------------------------
  sum: 64
  array[0] = 2
  array[2] = 22
  array[4] = 15
  array[5] = 25

k: 22
kthSum: 74

k: 23
kthSum: 76

k: 24
kthSum: 45

Added new Sublist:
Sublist -----------------------------
  sum: 45
  array[3] = 5
  array[4] = 15
  array[5] = 25

k: 25
kthSum: 47

Added new Sublist:
Sublist -----------------------------
  sum: 47
  array[0] = 2
  array[3] = 5
  array[4] = 15
  array[5] = 25

k: 26
kthSum: 57

Added new Sublist:
Sublist -----------------------------
  sum: 57
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[5] = 25

k: 27
kthSum: 59

Added new Sublist:
Sublist -----------------------------
  sum: 59
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[5] = 25

k: 28
kthSum: 67

NEW BEST FOUND
kBest: 28
bestSum: 67
k: 28
kthSum: 67

Added new Sublist:
Sublist -----------------------------
  sum: 67
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[5] = 25

k: 29
kthSum: 69

NEW BEST FOUND
kBest: 29
bestSum: 69
k: 29
kthSum: 69

Added new Sublist:
Sublist -----------------------------
  sum: 69
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[5] = 25

k: 30
kthSum: 79

k: 31
kthSum: 81

final kBest: 29 at j: 5
final bestSum: 69 at j: 5

j: 6
jthData: 9

k: 0
kthSum: 9

Added new Sublist:
Sublist -----------------------------
  sum: 9
  array[6] = 9

k: 1
kthSum: 11

Added new Sublist:
Sublist -----------------------------
  sum: 11
  array[0] = 2
  array[6] = 9

k: 2
kthSum: 21

Added new Sublist:
Sublist -----------------------------
  sum: 21
  array[1] = 12
  array[6] = 9

k: 3
kthSum: 23

Added new Sublist:
Sublist -----------------------------
  sum: 23
  array[0] = 2
  array[1] = 12
  array[6] = 9

k: 4
kthSum: 31

Added new Sublist:
Sublist -----------------------------
  sum: 31
  array[2] = 22
  array[6] = 9

k: 5
kthSum: 33

Added new Sublist:
Sublist -----------------------------
  sum: 33
  array[0] = 2
  array[2] = 22
  array[6] = 9

k: 6
kthSum: 43

Added new Sublist:
Sublist -----------------------------
  sum: 43
  array[1] = 12
  array[2] = 22
  array[6] = 9

k: 7
kthSum: 45

Added new Sublist:
Sublist -----------------------------
  sum: 45
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[6] = 9

k: 8
kthSum: 14

Added new Sublist:
Sublist -----------------------------
  sum: 14
  array[3] = 5
  array[6] = 9

k: 9
kthSum: 16

Added new Sublist:
Sublist -----------------------------
  sum: 16
  array[0] = 2
  array[3] = 5
  array[6] = 9

k: 10
kthSum: 26

Added new Sublist:
Sublist -----------------------------
  sum: 26
  array[1] = 12
  array[3] = 5
  array[6] = 9

k: 11
kthSum: 28

Added new Sublist:
Sublist -----------------------------
  sum: 28
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[6] = 9

k: 12
kthSum: 36

Added new Sublist:
Sublist -----------------------------
  sum: 36
  array[2] = 22
  array[3] = 5
  array[6] = 9

k: 13
kthSum: 38

Added new Sublist:
Sublist -----------------------------
  sum: 38
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[6] = 9

k: 14
kthSum: 48

Added new Sublist:
Sublist -----------------------------
  sum: 48
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[6] = 9

k: 15
kthSum: 50

Added new Sublist:
Sublist -----------------------------
  sum: 50
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[6] = 9

k: 16
kthSum: 24

Added new Sublist:
Sublist -----------------------------
  sum: 24
  array[4] = 15
  array[6] = 9

k: 17
kthSum: 26

Added new Sublist:
Sublist -----------------------------
  sum: 26
  array[0] = 2
  array[4] = 15
  array[6] = 9

k: 18
kthSum: 36

Added new Sublist:
Sublist -----------------------------
  sum: 36
  array[1] = 12
  array[4] = 15
  array[6] = 9

k: 19
kthSum: 38

Added new Sublist:
Sublist -----------------------------
  sum: 38
  array[0] = 2
  array[1] = 12
  array[4] = 15
  array[6] = 9

k: 20
kthSum: 46

Added new Sublist:
Sublist -----------------------------
  sum: 46
  array[2] = 22
  array[4] = 15
  array[6] = 9

k: 21
kthSum: 48

Added new Sublist:
Sublist -----------------------------
  sum: 48
  array[0] = 2
  array[2] = 22
  array[4] = 15
  array[6] = 9

k: 22
kthSum: 58

Added new Sublist:
Sublist -----------------------------
  sum: 58
  array[1] = 12
  array[2] = 22
  array[4] = 15
  array[6] = 9

k: 23
kthSum: 60

Added new Sublist:
Sublist -----------------------------
  sum: 60
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[4] = 15
  array[6] = 9

k: 24
kthSum: 29

Added new Sublist:
Sublist -----------------------------
  sum: 29
  array[3] = 5
  array[4] = 15
  array[6] = 9

k: 25
kthSum: 31

Added new Sublist:
Sublist -----------------------------
  sum: 31
  array[0] = 2
  array[3] = 5
  array[4] = 15
  array[6] = 9

k: 26
kthSum: 41

Added new Sublist:
Sublist -----------------------------
  sum: 41
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[6] = 9

k: 27
kthSum: 43

Added new Sublist:
Sublist -----------------------------
  sum: 43
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[6] = 9

k: 28
kthSum: 51

Added new Sublist:
Sublist -----------------------------
  sum: 51
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[6] = 9

k: 29
kthSum: 53

Added new Sublist:
Sublist -----------------------------
  sum: 53
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[6] = 9

k: 30
kthSum: 63

Added new Sublist:
Sublist -----------------------------
  sum: 63
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[6] = 9

k: 31
kthSum: 65

Added new Sublist:
Sublist -----------------------------
  sum: 65
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[6] = 9

k: 32
kthSum: 34

Added new Sublist:
Sublist -----------------------------
  sum: 34
  array[5] = 25
  array[6] = 9

k: 33
kthSum: 36

Added new Sublist:
Sublist -----------------------------
  sum: 36
  array[0] = 2
  array[5] = 25
  array[6] = 9

k: 34
kthSum: 46

Added new Sublist:
Sublist -----------------------------
  sum: 46
  array[1] = 12
  array[5] = 25
  array[6] = 9

k: 35
kthSum: 48

Added new Sublist:
Sublist -----------------------------
  sum: 48
  array[0] = 2
  array[1] = 12
  array[5] = 25
  array[6] = 9

k: 36
kthSum: 56

Added new Sublist:
Sublist -----------------------------
  sum: 56
  array[2] = 22
  array[5] = 25
  array[6] = 9

k: 37
kthSum: 58

Added new Sublist:
Sublist -----------------------------
  sum: 58
  array[0] = 2
  array[2] = 22
  array[5] = 25
  array[6] = 9

k: 38
kthSum: 68

Added new Sublist:
Sublist -----------------------------
  sum: 68
  array[1] = 12
  array[2] = 22
  array[5] = 25
  array[6] = 9

k: 39
kthSum: 70

NEW BEST FOUND
kBest: 39
bestSum: 70
k: 39
kthSum: 70

Added new Sublist:
Sublist -----------------------------
  sum: 70
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[5] = 25
  array[6] = 9

k: 40
kthSum: 39

Added new Sublist:
Sublist -----------------------------
  sum: 39
  array[3] = 5
  array[5] = 25
  array[6] = 9

k: 41
kthSum: 41

Added new Sublist:
Sublist -----------------------------
  sum: 41
  array[0] = 2
  array[3] = 5
  array[5] = 25
  array[6] = 9

k: 42
kthSum: 51

Added new Sublist:
Sublist -----------------------------
  sum: 51
  array[1] = 12
  array[3] = 5
  array[5] = 25
  array[6] = 9

k: 43
kthSum: 53

Added new Sublist:
Sublist -----------------------------
  sum: 53
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[5] = 25
  array[6] = 9

k: 44
kthSum: 61

Added new Sublist:
Sublist -----------------------------
  sum: 61
  array[2] = 22
  array[3] = 5
  array[5] = 25
  array[6] = 9

k: 45
kthSum: 63

Added new Sublist:
Sublist -----------------------------
  sum: 63
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[5] = 25
  array[6] = 9

k: 46
kthSum: 73

k: 47
kthSum: 75

k: 48
kthSum: 49

Added new Sublist:
Sublist -----------------------------
  sum: 49
  array[4] = 15
  array[5] = 25
  array[6] = 9

k: 49
kthSum: 51

Added new Sublist:
Sublist -----------------------------
  sum: 51
  array[0] = 2
  array[4] = 15
  array[5] = 25
  array[6] = 9

k: 50
kthSum: 61

Added new Sublist:
Sublist -----------------------------
  sum: 61
  array[1] = 12
  array[4] = 15
  array[5] = 25
  array[6] = 9

k: 51
kthSum: 63

Added new Sublist:
Sublist -----------------------------
  sum: 63
  array[0] = 2
  array[1] = 12
  array[4] = 15
  array[5] = 25
  array[6] = 9

k: 52
kthSum: 71

NEW BEST FOUND
kBest: 52
bestSum: 71
k: 52
kthSum: 71

Added new Sublist:
Sublist -----------------------------
  sum: 71
  array[2] = 22
  array[4] = 15
  array[5] = 25
  array[6] = 9

k: 53
kthSum: 73

k: 54
kthSum: 54

Added new Sublist:
Sublist -----------------------------
  sum: 54
  array[3] = 5
  array[4] = 15
  array[5] = 25
  array[6] = 9

k: 55
kthSum: 56

Added new Sublist:
Sublist -----------------------------
  sum: 56
  array[0] = 2
  array[3] = 5
  array[4] = 15
  array[5] = 25
  array[6] = 9

k: 56
kthSum: 66

Added new Sublist:
Sublist -----------------------------
  sum: 66
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[5] = 25
  array[6] = 9

k: 57
kthSum: 68

Added new Sublist:
Sublist -----------------------------
  sum: 68
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[5] = 25
  array[6] = 9

k: 58
kthSum: 76

k: 59
kthSum: 78

final kBest: 52 at j: 6
final bestSum: 71 at j: 6

j: 7
jthData: 19

k: 0
kthSum: 19

Added new Sublist:
Sublist -----------------------------
  sum: 19
  array[7] = 19

k: 1
kthSum: 21

Added new Sublist:
Sublist -----------------------------
  sum: 21
  array[0] = 2
  array[7] = 19

k: 2
kthSum: 31

Added new Sublist:
Sublist -----------------------------
  sum: 31
  array[1] = 12
  array[7] = 19

k: 3
kthSum: 33

Added new Sublist:
Sublist -----------------------------
  sum: 33
  array[0] = 2
  array[1] = 12
  array[7] = 19

k: 4
kthSum: 41

Added new Sublist:
Sublist -----------------------------
  sum: 41
  array[2] = 22
  array[7] = 19

k: 5
kthSum: 43

Added new Sublist:
Sublist -----------------------------
  sum: 43
  array[0] = 2
  array[2] = 22
  array[7] = 19

k: 6
kthSum: 53

Added new Sublist:
Sublist -----------------------------
  sum: 53
  array[1] = 12
  array[2] = 22
  array[7] = 19

k: 7
kthSum: 55

Added new Sublist:
Sublist -----------------------------
  sum: 55
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[7] = 19

k: 8
kthSum: 24

Added new Sublist:
Sublist -----------------------------
  sum: 24
  array[3] = 5
  array[7] = 19

k: 9
kthSum: 26

Added new Sublist:
Sublist -----------------------------
  sum: 26
  array[0] = 2
  array[3] = 5
  array[7] = 19

k: 10
kthSum: 36

Added new Sublist:
Sublist -----------------------------
  sum: 36
  array[1] = 12
  array[3] = 5
  array[7] = 19

k: 11
kthSum: 38

Added new Sublist:
Sublist -----------------------------
  sum: 38
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[7] = 19

k: 12
kthSum: 46

Added new Sublist:
Sublist -----------------------------
  sum: 46
  array[2] = 22
  array[3] = 5
  array[7] = 19

k: 13
kthSum: 48

Added new Sublist:
Sublist -----------------------------
  sum: 48
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[7] = 19

k: 14
kthSum: 58

Added new Sublist:
Sublist -----------------------------
  sum: 58
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[7] = 19

k: 15
kthSum: 60

Added new Sublist:
Sublist -----------------------------
  sum: 60
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[7] = 19

k: 16
kthSum: 34

Added new Sublist:
Sublist -----------------------------
  sum: 34
  array[4] = 15
  array[7] = 19

k: 17
kthSum: 36

Added new Sublist:
Sublist -----------------------------
  sum: 36
  array[0] = 2
  array[4] = 15
  array[7] = 19

k: 18
kthSum: 46

Added new Sublist:
Sublist -----------------------------
  sum: 46
  array[1] = 12
  array[4] = 15
  array[7] = 19

k: 19
kthSum: 48

Added new Sublist:
Sublist -----------------------------
  sum: 48
  array[0] = 2
  array[1] = 12
  array[4] = 15
  array[7] = 19

k: 20
kthSum: 56

Added new Sublist:
Sublist -----------------------------
  sum: 56
  array[2] = 22
  array[4] = 15
  array[7] = 19

k: 21
kthSum: 58

Added new Sublist:
Sublist -----------------------------
  sum: 58
  array[0] = 2
  array[2] = 22
  array[4] = 15
  array[7] = 19

k: 22
kthSum: 68

Added new Sublist:
Sublist -----------------------------
  sum: 68
  array[1] = 12
  array[2] = 22
  array[4] = 15
  array[7] = 19

k: 23
kthSum: 70

Added new Sublist:
Sublist -----------------------------
  sum: 70
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[4] = 15
  array[7] = 19

k: 24
kthSum: 39

Added new Sublist:
Sublist -----------------------------
  sum: 39
  array[3] = 5
  array[4] = 15
  array[7] = 19

k: 25
kthSum: 41

Added new Sublist:
Sublist -----------------------------
  sum: 41
  array[0] = 2
  array[3] = 5
  array[4] = 15
  array[7] = 19

k: 26
kthSum: 51

Added new Sublist:
Sublist -----------------------------
  sum: 51
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[7] = 19

k: 27
kthSum: 53

Added new Sublist:
Sublist -----------------------------
  sum: 53
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[7] = 19

k: 28
kthSum: 61

Added new Sublist:
Sublist -----------------------------
  sum: 61
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[7] = 19

k: 29
kthSum: 63

Added new Sublist:
Sublist -----------------------------
  sum: 63
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[7] = 19

k: 30
kthSum: 73

k: 31
kthSum: 75

k: 32
kthSum: 44

Added new Sublist:
Sublist -----------------------------
  sum: 44
  array[5] = 25
  array[7] = 19

k: 33
kthSum: 46

Added new Sublist:
Sublist -----------------------------
  sum: 46
  array[0] = 2
  array[5] = 25
  array[7] = 19

k: 34
kthSum: 56

Added new Sublist:
Sublist -----------------------------
  sum: 56
  array[1] = 12
  array[5] = 25
  array[7] = 19

k: 35
kthSum: 58

Added new Sublist:
Sublist -----------------------------
  sum: 58
  array[0] = 2
  array[1] = 12
  array[5] = 25
  array[7] = 19

k: 36
kthSum: 66

Added new Sublist:
Sublist -----------------------------
  sum: 66
  array[2] = 22
  array[5] = 25
  array[7] = 19

k: 37
kthSum: 68

Added new Sublist:
Sublist -----------------------------
  sum: 68
  array[0] = 2
  array[2] = 22
  array[5] = 25
  array[7] = 19

k: 38
kthSum: 78

k: 39
kthSum: 80

k: 40
kthSum: 49

Added new Sublist:
Sublist -----------------------------
  sum: 49
  array[3] = 5
  array[5] = 25
  array[7] = 19

k: 41
kthSum: 51

Added new Sublist:
Sublist -----------------------------
  sum: 51
  array[0] = 2
  array[3] = 5
  array[5] = 25
  array[7] = 19

k: 42
kthSum: 61

Added new Sublist:
Sublist -----------------------------
  sum: 61
  array[1] = 12
  array[3] = 5
  array[5] = 25
  array[7] = 19

k: 43
kthSum: 63

Added new Sublist:
Sublist -----------------------------
  sum: 63
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[5] = 25
  array[7] = 19

k: 44
kthSum: 71

Added new Sublist:
Sublist -----------------------------
  sum: 71
  array[2] = 22
  array[3] = 5
  array[5] = 25
  array[7] = 19

k: 45
kthSum: 73

k: 46
kthSum: 83

k: 47
kthSum: 85

k: 48
kthSum: 59

Added new Sublist:
Sublist -----------------------------
  sum: 59
  array[4] = 15
  array[5] = 25
  array[7] = 19

k: 49
kthSum: 61

Added new Sublist:
Sublist -----------------------------
  sum: 61
  array[0] = 2
  array[4] = 15
  array[5] = 25
  array[7] = 19

k: 50
kthSum: 71

Added new Sublist:
Sublist -----------------------------
  sum: 71
  array[1] = 12
  array[4] = 15
  array[5] = 25
  array[7] = 19

k: 51
kthSum: 73

k: 52
kthSum: 81

k: 53
kthSum: 83

k: 54
kthSum: 64

Added new Sublist:
Sublist -----------------------------
  sum: 64
  array[3] = 5
  array[4] = 15
  array[5] = 25
  array[7] = 19

k: 55
kthSum: 66

Added new Sublist:
Sublist -----------------------------
  sum: 66
  array[0] = 2
  array[3] = 5
  array[4] = 15
  array[5] = 25
  array[7] = 19

k: 56
kthSum: 76

k: 57
kthSum: 78

k: 58
kthSum: 86

k: 59
kthSum: 88

k: 60
kthSum: 28

Added new Sublist:
Sublist -----------------------------
  sum: 28
  array[6] = 9
  array[7] = 19

k: 61
kthSum: 30

Added new Sublist:
Sublist -----------------------------
  sum: 30
  array[0] = 2
  array[6] = 9
  array[7] = 19

k: 62
kthSum: 40

Added new Sublist:
Sublist -----------------------------
  sum: 40
  array[1] = 12
  array[6] = 9
  array[7] = 19

k: 63
kthSum: 42

Added new Sublist:
Sublist -----------------------------
  sum: 42
  array[0] = 2
  array[1] = 12
  array[6] = 9
  array[7] = 19

k: 64
kthSum: 50

Added new Sublist:
Sublist -----------------------------
  sum: 50
  array[2] = 22
  array[6] = 9
  array[7] = 19

k: 65
kthSum: 52

Added new Sublist:
Sublist -----------------------------
  sum: 52
  array[0] = 2
  array[2] = 22
  array[6] = 9
  array[7] = 19

k: 66
kthSum: 62

Added new Sublist:
Sublist -----------------------------
  sum: 62
  array[1] = 12
  array[2] = 22
  array[6] = 9
  array[7] = 19

k: 67
kthSum: 64

Added new Sublist:
Sublist -----------------------------
  sum: 64
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[6] = 9
  array[7] = 19

k: 68
kthSum: 33

Added new Sublist:
Sublist -----------------------------
  sum: 33
  array[3] = 5
  array[6] = 9
  array[7] = 19

k: 69
kthSum: 35

Added new Sublist:
Sublist -----------------------------
  sum: 35
  array[0] = 2
  array[3] = 5
  array[6] = 9
  array[7] = 19

k: 70
kthSum: 45

Added new Sublist:
Sublist -----------------------------
  sum: 45
  array[1] = 12
  array[3] = 5
  array[6] = 9
  array[7] = 19

k: 71
kthSum: 47

Added new Sublist:
Sublist -----------------------------
  sum: 47
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[6] = 9
  array[7] = 19

k: 72
kthSum: 55

Added new Sublist:
Sublist -----------------------------
  sum: 55
  array[2] = 22
  array[3] = 5
  array[6] = 9
  array[7] = 19

k: 73
kthSum: 57

Added new Sublist:
Sublist -----------------------------
  sum: 57
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[6] = 9
  array[7] = 19

k: 74
kthSum: 67

Added new Sublist:
Sublist -----------------------------
  sum: 67
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[6] = 9
  array[7] = 19

k: 75
kthSum: 69

Added new Sublist:
Sublist -----------------------------
  sum: 69
  array[0] = 2
  array[1] = 12
  array[2] = 22
  array[3] = 5
  array[6] = 9
  array[7] = 19

k: 76
kthSum: 43

Added new Sublist:
Sublist -----------------------------
  sum: 43
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 77
kthSum: 45

Added new Sublist:
Sublist -----------------------------
  sum: 45
  array[0] = 2
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 78
kthSum: 55

Added new Sublist:
Sublist -----------------------------
  sum: 55
  array[1] = 12
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 79
kthSum: 57

Added new Sublist:
Sublist -----------------------------
  sum: 57
  array[0] = 2
  array[1] = 12
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 80
kthSum: 65

Added new Sublist:
Sublist -----------------------------
  sum: 65
  array[2] = 22
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 81
kthSum: 67

Added new Sublist:
Sublist -----------------------------
  sum: 67
  array[0] = 2
  array[2] = 22
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 82
kthSum: 77

k: 83
kthSum: 79

k: 84
kthSum: 48

Added new Sublist:
Sublist -----------------------------
  sum: 48
  array[3] = 5
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 85
kthSum: 50

Added new Sublist:
Sublist -----------------------------
  sum: 50
  array[0] = 2
  array[3] = 5
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 86
kthSum: 60

Added new Sublist:
Sublist -----------------------------
  sum: 60
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 87
kthSum: 62

Added new Sublist:
Sublist -----------------------------
  sum: 62
  array[0] = 2
  array[1] = 12
  array[3] = 5
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 88
kthSum: 70

Added new Sublist:
Sublist -----------------------------
  sum: 70
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[6] = 9
  array[7] = 19

k: 89
kthSum: 72

NEW BEST FOUND
kBest: 89
bestSum: 72
k: 89
kthSum: 72

Added new Sublist:
Sublist -----------------------------
  sum: 72
  array[0] = 2
  array[2] = 22
  array[3] = 5
  array[4] = 15
  array[6] = 9
  array[7] = 19
FOUND_PERFECT 72at k: 89 and j: 7
189
* */