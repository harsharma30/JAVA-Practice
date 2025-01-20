import java.util.Scanner;

public class SecondLargest {
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
    void largestNum(int arr[]){
        int max = arr[0];
        for(int i :arr){
            if(i>max){
                max = i;
            }
        }
        // abhi karna hai pending hai
        int max = arr[0];
        for(int i :arr){
            if(i>max){
                max = i;
            }
        }

        System.out.println("The maximum value in the array is: "+ max);
    }
    public static void main(String[] args){
        GreatestInArray run = new GreatestInArray();
        int arr[] = run.getData();
        run.largestNum(arr);
    }
}
