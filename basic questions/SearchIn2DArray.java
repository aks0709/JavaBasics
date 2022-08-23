import java.util.Arrays;

public class SearchIn2DArray
{
    public static void main(String[] args)
    {
     int arr[][]={
             {23,4,1},
             {18,12,3,9},
             {78,99,34,56},
             {18,12}
     };
     int target=56;
     int ans[]=search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println("maximum no. in 2D array is "+max(arr,target));
    }

    static int[] search(int arr[][],int target) //take 2Darray as an input and return type is arr={row,column}
    {
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++)  //every row is a array
            {
                if (arr[row][col]==target)
                    return new int[]{row,col};  //this make a new array {row,column }and return it
            }
        }
        return new int[]{-1,-1};  //return -1 as a index of row and col for not founding of number
    }

    static int max(int arr[][],int target){
        int max=Integer.MIN_VALUE;
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col]>max ) {
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
}
