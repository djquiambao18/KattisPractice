import java.util.Scanner;
import java.util.HashMap;
class Aaah{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] str = new String[2];
        str[0] = input.nextLine(); //what the guy can do that day
        str[1] = input.nextLine(); //what the dr. needs
        input.close();
        if(str[0].length() >= str[1].length() && str[0].charAt(str[0].length()-1) == 'h' && str[1].charAt(str[1].length()-1) == 'h' 
            && str[0].charAt(0) == 'a' && str[1].charAt(0) == 'a' && str[0].length() > 0 && str[1].length() > 0){
            char [] ch1 = str[0].toCharArray();
            char [] ch2 = str[1].toCharArray();
            int i = 0;
            int j = 0;
            while(i < ch1.length){
                if(ch1[i] != 'a' && i < ch1.length-1){
                    System.out.println("no");
                    return;
                }
                i++;
            }
            // need second while loop for input validation
            while(j < ch2.length){
                if(ch2[j] != 'a' && j < ch2.length-1){
                    System.out.println("no");
                    return;
                }
                j++;
            }
            if(i >= j){
                System.out.println("go");
            }
            else{
                System.out.println("no");
            }
        }
        else{
            System.out.println("no");
        }

    }
}