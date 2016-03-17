import java.util.*;
import java.util.ArrayList;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        if (n <= 0) // The smallest list we can make
        {
            return new ArrayList<Integer>();
        }
        else // All other size lists are created here
        {
            tempList.add(n);
            tempList.addAll(makeList(n-1));
        }
        Collections.sort(tempList);
        return tempList;
    }

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list)
    {
        ArrayList<Integer> list = ListMethods.deepClone(tList);
        if ((list.size() == 1) || (list.size() == 0))
        {
            return list;
        }
        else
        {
            Interger tempList = list.remove(0);
            list = ListMethods.reverseList(list);
            list.add(tempInt);
        }
        return list;
        
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = ListMethods.makeList(100);
   

        if (tempList.size() == 0)

        {
            System.out.println("The list is empty");
        }
        else
        {
            for (Integer i : tempList)
            {
                System.out.println(i);
            }
        }
    }

}