//Question: https://leetcode.com/problems/defanging-an-ip-address/

public class Defanging_IPaddress {
    public static void main(String[] args) {

        String s="255.100.50.0";
        System.out.println(defangIPaddr(s));

    }
    public static String defangIPaddr(String address) {
        StringBuilder defanged = new StringBuilder();
        if(address==null || address.length()==0)
            return address;

        for(int i=0; i<address.length(); i++)
        {
            if(address.charAt(i)=='.')
                defanged.append("[.]");
            else
                defanged.append(address.charAt(i));
        }
        return defanged.toString();
    }
}