package Java;

public class Beginners {
    //create and intilization array
    public static void main (String []args)
     {
         int arr[]={1,2,3,4,5};
         for(int i:arr)
         {
        System.out.println(i);
     }

    //Accessing elements of an array

    int arr1[]={1,2,3,4,5};
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(arr1[1]);
        System.out.println(arr1[4]);
    
   // Modifying elements of an array
      int arr2[] = {1, 2, 3, 4, 5};
        arr2[2] = 7;
        System.out.println("Array after modification: " + java.util.Arrays.toString(arr2));


    // Finding the length of an array
    int arr3[] = {1, 2, 3, 4, 6};
    System.out.println("The length of the array is: " + arr3.length);

    //Looping through an array
    int arr4[] = {1, 2, 3, 4, 5};
    for (int i = 0; i < arr4.length; i++)
    {
        System.out.println("index of elements " +i+ ": " + arr4[i]);
    }

   //Multi-dimensional Arrays
   int[][] arr5 = { {1,2,3}, {3,4,5}, {5,6,7},{8,9,4}};
        System.out.println("Element at row 3 column 2: " + arr5[2][1]);

       
        

}
}


