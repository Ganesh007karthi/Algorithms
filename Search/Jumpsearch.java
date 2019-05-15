package Search;

public class Jumpsearch {
    public static int jumpsearch(int arr[],int x){
        int n=arr.length;
        int step=(int)Math.floor(Math.sqrt(n));
        //find the block where the element is present
        int prev=0;
        while(arr[Math.min(step,n)-1]<x){
            prev=step;
            step+=(int)Math.floor(Math.sqrt(n));
            if(prev>=n)
                return -1;
        }
        //preform linear search
        while(arr[prev]<x) {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }
        if(arr[prev]==x)
            return prev;
        return -1;
        }

    public static void main(String args[]){
        int arr[]={1,3,4,5,6,7,8,10,15,16,17};
        int x=9;
        int index=jumpsearch(arr,x);
        System.out.println("The element is in the "+index+" index");
    }
}
