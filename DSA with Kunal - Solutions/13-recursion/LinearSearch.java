import java.util.Scanner;

//Linear search in array
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int sch = in.nextInt();
        int[] arr = {12, 4, 30, 8, 64, 100};
        System.out.println("Present at index: "+search(arr, sch, 0));
    }

    public static int search(int[] arr, int target, int index) {
        if(index == arr.length)
            return -1;

        if(arr[index]==target)
            return index;

        return  search(arr, target, index+1);
    }

}
