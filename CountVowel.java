// Write a code to get a string nd find out number of vowel
//while
//do while
//for
import java.util.Scanner;
public class CountVowel{
    String str;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = sc.nextLine();
    }
    int countVowel(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        CountVowel run = new CountVowel();
        run.getData();
        System.out.println("Number of Vowels are: " + run.countVowel(run.str));
    }
}