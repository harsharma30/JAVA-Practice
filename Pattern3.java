/*
 * 1.
*****
****
***
**
*

2.
*
**
***
****
*****

3.
    *
   **
  ***
 ****
*****
 
4.
*****
****
***
**
*
**
***
****
*****

5.
    *
   ***
  *****
 *******
*********
 */
import java.util.Scanner;
 public class Pattern3{
    int num;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the max number of stars: ");
        num = sc.nextInt();
    }
    void designPattern(){
        for(int i=num;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Pattern3 H = new Pattern3();
        H.getData();
        H.designPattern();
    }
 }