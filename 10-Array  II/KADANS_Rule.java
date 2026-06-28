public class KADANS_Rule {

    public static void Max_subArray_KEDANS(int num[]){
        int MAX_Sum=Integer.MIN_VALUE;
        int currsum=0;
   
        for(int i=0;i<num.length;i++){
            currsum=currsum+num[i];
            // KEDANES Algoritham.3s
            if(currsum < 0){
                currsum = 0;
            }

            MAX_Sum=Math.max(currsum , MAX_Sum); // If currsum MAX_Sum se bara hoga to currsum ka value Max ME store ho jay ga.
        }
        System.out.println("Maximum of sum = "+MAX_Sum);
    }
    public static void main(String args[]){
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        Max_subArray_KEDANS(num);
    }    
}
