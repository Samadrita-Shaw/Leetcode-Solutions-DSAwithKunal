//Check if the array is sorted or not.

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 30, 5, 7};
        System.out.println("Is the array sorted: "+sorted(arr, 0));
    }
    public static boolean sorted(int[]arr, int index){
        if(index == arr.length-1)
            return true;

        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
}
