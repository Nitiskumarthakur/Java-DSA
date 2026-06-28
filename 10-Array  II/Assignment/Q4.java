public class Q4 {

    public static void ty(int num[], int val){
        int count = 0;
        int arr[] = new int[count];
        for(int i=0;i<=num.length-1;i++){
            if(num[i] !=val){
                //arr.add(num[i]);
                arr[count] = num[i];
                count++;
            }
        }
        System.out.println("count: "+count);
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        int val=4;
        ty(num, val);
    }
}
