import java.util.*;
public class BinarySearchRecur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 20, 32, 54, 70, 90, 100};
        System.out.println("Enter Search Value: ");
        int target = in.nextInt();
        System.out.print("Search value is at index: ");
        if(search(arr, target, 0, arr.length-1)==-1){
            System.out.println("Search item does not exist.");
        }
        else{
            System.out.println(search(arr, target, 0, arr.length-1));
        }
    }

    public static int search(int[] arr, int target, int start, int end) {
        if (start>end){
            return -1;
        }

        int mid = start + (end - start)/2;

        if(target == arr[mid])
            return mid;

        if(target<arr[mid])
            return search(arr, target, start, mid-1);

        return search(arr, target, mid+1, end);
    }
}
