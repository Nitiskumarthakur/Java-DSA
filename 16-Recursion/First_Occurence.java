public class First_Occurence {

    public static int fir_Occur(int arr[], int i){
        
        if(arr[i] == 5){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }
        return fir_Occur(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,3,6,7,5,8};
        int i=0;
        System.out.println(fir_Occur(arr, i));
    }
}
