// get a number from user, create an array of size n, niput number and display their square 
// of numbers along with the original number
import java.util.Scanner;
public class SquareInArray {
    int[] getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    void printOut(int[] arr){
        for(int j = 0; j< arr.length;j++){
            System.out.println("The number entered is : "+ arr[j] + " and the square of the number is: " + arr[j]*arr[j] );
        }
    }
    public static void main(String[] args){
        SquareInArray run = new SquareInArray();
        int[] arr = run.getData();
        run.printOut(arr);
    }
}
