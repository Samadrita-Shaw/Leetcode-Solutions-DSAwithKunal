package patterns;
/*

*
* *
* * *
* * * *

 */
public class Triangle2 {
    public static void main(String[] args) {
        triangle2(4, 0);
    }
    public static void triangle2(int r, int c){
        if(r==0)
            return;
        if(c<r){
            triangle2(r, c+1);
            System.out.print("* ");
        }
        else {
            triangle2(r-1, 0);
            System.out.println();
        }
    }
}
