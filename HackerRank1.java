import java.util.Scanner;
public class HackerRank1 {
    int num;
    double dec;
    String str;
    void getData(){  
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        num = sc.nextInt();
        dec = sc.nextDouble();
    }
    void showData(){
        System.out.println("Int: " + num);
        System.out.println("String: " + str);
        System.out.println("Double: " + dec);
        //System.out.println("Int: " + num);
    }
    public static void main(String[] args){
        HackerRank1 run = new HackerRank1();
        run.getData();
        run.showData();
    }
}
