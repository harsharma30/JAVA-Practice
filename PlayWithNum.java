/*
 * Kavita wants to make an application for her kids to play with numbers. She wants to get following functionality:
 * 1. get any three numbers and find out their sum 
 * 2. get any three numbers and find difference of smallest and biggest number
 * 3. get any three numbers and find sum of if all of them are even otherwise their product 
 * 
 * Class: PlayWithNum
 * Properties: num1, num2, num3, option
 * Methods: getData(), numSum(), numDiff(), smallestNum(), largestNum(), opt3()
 * Main Method: 
 */

import java.util.Scanner;
class PlayWithNum{
    int num1;
    int num2;
    int num3;
    int opt;

    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter Third number: ");
        num3 = sc.nextInt();

        System.out.println("1. Find out their sum ");
        System.out.println("2. Find difference of smallest and biggest number");
        System.out.println("3. find sum of if all of them are even otherwise their product");
        System.out.println("Enter Option: ");
        opt = sc.nextInt();

    }

    int largestNum(){
        if(num1>num2 && num1>num3){
            return num1;
        }
        else if(num2>num3 && num2>num1){
            return num2;
        }
        else{
            return num3;
        }
    }

    int smallestNum(){
        if(num2>num1 && num3>num1){
            return num1;
        }
        else if(num1>num2 && num3>num2){
            return num2;
        }
        else{
            return num3;
        }
    }

    int numSum(){
        return num1+num2+num3;
    }

    int numDiff(){
        return largestNum()-smallestNum();
    }

    int opt3(){
        if(num1%2==0 && num2%2==0 && num3%2==0){
            return num1+num2+num3;
        }
        else{
            return num1*num2*num3;
        }
    }
    public static void main(String[] args){
        PlayWithNum H = new PlayWithNum();

        H.getData();

        switch(H.opt){
            case 1:
            System.out.println("Sum of all numbers is: " + H.numSum());
            break;
            case 2:
            System.out.println("Difference of Largest and smallest num is: " + H.numDiff());
            break;
            case 3:
            System.out.println("If even then sum is else product is: " + H.opt3());
            break;
            default:
            System.err.println("Enter among the provided options.");
        }
        System.out.println("-----------------------------------------------");
    }
} 