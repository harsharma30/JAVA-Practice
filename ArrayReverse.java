//Method to find duplicate numbers in an array
//method to remove all duplicate numbers from an array
//or make unique elements of the array
import java.util.Scanner;
public class ArrayReverse {
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
}