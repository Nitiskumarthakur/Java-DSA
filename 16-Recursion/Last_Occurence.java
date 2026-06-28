public class Last_Occurence {

    public static int last_Occur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = last_Occur(arr, key, i+1);
        if(isFound ==  -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9,0,5,7,8};
        int i =0, key =5;
        System.out.println(last_Occur(arr, key, i));
    }
}
