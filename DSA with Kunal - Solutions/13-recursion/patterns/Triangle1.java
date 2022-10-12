package patterns;
/*

* * * *
* * *
* *
*

 */
public class Triangle1 {
    public static void main(String[] args) {
        triangle1(4, 0);
    }

    public static void triangle1(int r, int c) {
        if(r==0)
            return;
        if(c<r){
            System.out.print("* ");
            triangle1(r, c+1);
        }
        else {
            System.out.println();
            triangle1(r-1, 0);
        }
    }
}
