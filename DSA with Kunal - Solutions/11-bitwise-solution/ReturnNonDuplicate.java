//Given an array, each element appears twice except one. Return that element.

public class ReturnNonDuplicate {
    public static void main(String[] args) {
        int[] arr={2,4,6,2,6};
        System.out.println(uniqueElement(arr));
    }
    public static int uniqueElement(int[] arr)
    {
        int unique=0;
        for(int n: arr){
            unique ^= n;
        }
        return unique;
    }
}
