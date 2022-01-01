//Question: https://leetcode.com/problems/goal-parser-interpretation/

public class Goal_Parser {
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));

    }
    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
        if( command==null || command.length()==0)
            return command;

        for(int i = 0; i< command.length(); i++)
        {
            if(command.charAt(i)=='(')
            {
                if(command.charAt(i+1)=='a')
                {
                    str.append("al");
                    i=i+3;
                }
                else
                {
                    str.append("o");
                    i++;
                }
            }
            else
            {
                str.append(command.charAt(i));
            }
        }
        return str.toString();
    }
}