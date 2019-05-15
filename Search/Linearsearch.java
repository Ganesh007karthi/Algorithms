package Search;

import java.util.Scanner;

public class Linearsearch {
    public static int linearsearch(int a[],int n,int x){
        for(int i=0;i<n;i++){
            if(a[i]==x){
                return 1;
            }
        }return -1;
    }




    public static void main(String args[]){
        System.out.println("Enter the length of the array");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter the Element to be find:");
        int x=in.nextInt();
        int result=linearsearch(a,n,x);
        if(result==1){
            System.out.println("Element is found in the array");
        }else{
            System.out.println("Element is not found in the array");
        }
    }
}
