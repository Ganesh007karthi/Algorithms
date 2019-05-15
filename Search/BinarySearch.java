package Search;

import java.util.Scanner;

public class BinarySearch {

    public static  int binarysearch(int a[],int l,int n,int x){
      if (l<n){
          int mid=l+(n-l)/2;
          if(x<a[mid]){
              return binarysearch(a,l,mid,x);
          }else if(a[mid]<x){
              return binarysearch(a,mid+1,n,x);
          }else{
              return 1;
          }
      }return -1;
    }




public static void main(String args[]){
    System.out.println("Enter  the number of elements");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=in.nextInt();
    }
    System.out.println("Enter the elements to be find:");
    int x=in.nextInt();
    int result=binarysearch(a,0,n-1,x);
    if(result==1){
        System.out.println("Element is found!");
    }else{
        System.out.println("Element is not found!");
    }

}

}
