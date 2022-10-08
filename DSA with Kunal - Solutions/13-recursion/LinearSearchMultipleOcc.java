import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchMultipleOcc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter search element: ");
        int sch = in.nextInt();
        int[] arr = {1, 20, 3, 4, 3, 10};
        ArrayList<Integer> list = search(arr, sch, 0, new ArrayList<Integer>());
        System.out.println(list);
    }
    public static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length)
            return list;

        if(target==arr[index])
            list.add(index);

        return search(arr, target, index+1, list);
    }
}
