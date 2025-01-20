// write  a method to calculate the sum of all element in an array
//find sum of even and odd number
import java.util.Scanner;
public class SumAllArray {
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
    int calSumOfAllElement(int arr[]){
        int temp = 0;
        for(int i = 0; i<arr.length;i++){
            temp = temp +arr[i];
        }
        return temp;
    }
    int sumEven(int arr[]){
        int even = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                even = even+arr[i];
            }
        }
        return even;
    }
    int sumOdd(int arr[]){
        int odd = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2!=0){
                odd = odd + arr[i];
            }
        }
        return odd;
    }
    public static void main(String[] args){
        SumAllArray run = new SumAllArray();
        int arr[] = run.getData();

        System.out.println("===========================================================");
        System.out.println("Sum of all element of the array is: "+ run.calSumOfAllElement(arr));
        System.out.println("Sum of all even element of the array is: "+ run.sumEven(arr));
        System.out.println("Sum of all odd element of the array is: "+ run.sumOdd(arr));
        System.out.println("===========================================================");

    }
}
