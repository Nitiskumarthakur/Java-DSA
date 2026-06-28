// For a given integer array of size N. You have to find all the occurrences 
//(indices) of a given element (Key) and print them
public class Q1 {

    public static void find(int arr[], int key,int n){
        if(n==arr.length){
            return; 
        }
        if(arr[n]==key){
            System.out.print(n+" ");
        }
        find(arr, key, n+1);
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,5,6,5};
        int key=5;
        int n=0;
        find(arr, key,n);
    }
}
