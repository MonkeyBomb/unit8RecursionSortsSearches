
/*
Java Bubble Sort Example
This Java bubble sort example shows how to sort an array of int using bubble
sort algorithm. Bubble sort is the simplest sorting algorithm.
 */

public class BubbleSort 
{
    public static void main(String[] args)
    {
        int intArray[] = new int[]{5,90,35,45,150,3,98,100,39,47,89,53,91,77,62,19 };
        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
        bubbleSort(intArray);
        System.out.println("");
        System.out.println("Array After Bubble Sort");
        for(int i=0; i < intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }

    private static void bubbleSort(int[] intArray) 
    {
        int n = intArray.length;
        int temp = 0;
        for(int i=0; i < n; i++)
        {
            for(int j=1; j < (n-i); j++)
            {
                if(intArray[j-1] > intArray[j])
                {
                 
                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j] = temp;
                }

            }
        }

    }
}

