//Question: https://leetcode.com/problems/robot-return-to-origin/

public class Robot_Origin {
    public static void main(String[] args) {
        String moves = "ULDRUULDDR";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
        int ud=0, lr=0;     //ud represent up and down movement, lr represents left right movement
        moves = moves.toUpperCase();
        for(int i=0; i<moves.length(); i++)
        {
            if(moves.charAt(i)=='U')
                ud++;   //moves up
            if(moves.charAt(i)=='D')
                ud--;   //moves down
            if(moves.charAt(i)=='L')
                lr++;   //moves left
            if(moves.charAt(i)=='R')
                lr--;   //moves right
        }
        return (ud==0 && lr==0);    //zero means that number of steps moved upward is same as number of steps moved downward, thus cancelling, which implies that it returned to the origin.
    }
}
