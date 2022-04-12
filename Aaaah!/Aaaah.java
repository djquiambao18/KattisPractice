import java.util.Scanner;
import java.util.HashMap;
class Aaah{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] str = new String[2];
        str[0] = in.nextLine(); //what the guy can do that day
        str[1] = in.nextLine(); //what the dr. needs
        if(str[0].length() >= str[1].length() && str[0].charAt(str[0].length()-1) == 'h' && str[1].charAt(str[0].length()-1) == 'h' 
            && str[0].charAt(0) == 'a' && str[1].charAt(0) == 'a'){
            char [] ch1 = str[0].toCharArray();
            char [] ch2 = str[1].toCharArray();
            int i = 0;
            HashMap<Character, Charac
            while(ch1[i] == 'a' || ch1[i] == 'h' && i < ch1.length){
                
            }
            
        }
        else{
            System.out.println("no");
        }
    }
}