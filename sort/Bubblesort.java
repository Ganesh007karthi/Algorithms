public class Bubblesort {
    void bubble(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    void dis(int arr[])
    {
       int n=arr.length;
       for(int i=0;i<n;i++){
           System.out.println(arr[i]+"");
       }
    }

    public static void main(String args[]){
        Bubblesort ob=new Bubblesort();
        int arr[]={25,65,21,14,68};
        ob.bubble(arr);
        ob.dis(arr);
    }
}
