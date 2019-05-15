public class Insertionsort{
    void sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
           while(j>=0&&arr[j]>temp){//does swap util condition fails
               arr[j+1]=arr[j];
               j=j-1;//to sort the j-1 terms
           }
           arr[j+1]=temp;
        }
    }

    void disp(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"");
        }
    }



    public static void main(String args[]){
        int arr[]={25,56,21,35,14};
        Insertionsort ob=new Insertionsort();
        ob.sort(arr);
        ob.disp(arr);

    }
}



