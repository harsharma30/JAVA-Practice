//method to check if an array is sorted in ascending order
import java.util.Scanner;
public class SortAscending{
    int[] getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Provided array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        return arr;
    }
    void ascOrder(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                System.out.println("Yes, it is sorted..");
            }
            else{
                System.out.println("No it is not sorted");
            }
        }
    }
    public static void main(String[] args){
        SortAscending run = new SortAscending();
        int arr[] = run.getData();
        run.ascOrder(arr);
    }
}
