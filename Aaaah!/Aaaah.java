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
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            while(i < ch1.length && ch1[i] == 'a'){
                if(map.containsKey(ch1[i])){
                    map.put(ch1[i], map.get(ch1[i])+1);
                }
                else{
                    map.put(ch1[i], 1);
                }
                i++;
            }
            int count = 0;
            i = 0;
            if(ch2[ch2.length-1] != 'h'){
                System.out.println("no");
                return;
            }
            while(i < ch2.length && ch2[i] == 'a'){
                count++;
                i++;
            }
            if(count <= map.get('a')){
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