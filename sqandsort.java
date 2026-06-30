public class sqandsort {
    public static void main(String[] args) {
        int arr[]={-4,-2,-1,2,3};
        int n= arr.length;

        int i=0;
        int j=n-1;
        int k=n-1;
        int ans[]=new int[n];
        for(int l=0;l<=j;l++){
            arr[l]=arr[l]*arr[l];
            /*System.out.println(arr[l]);
            int arr[]={-9,-8,-7,0,1,5,6,15,16};
            int arr[]={-4,-2,-1,2,3};
            */
        }
        while (i<j) {
            if(arr[i]>arr[j]){
                ans[k]=arr[i];
                i++;
                
            }else  {
                ans[k]=arr[j];
                j--;
                
            }k--;
           
            
        }
         for(int m=0; m<=n-1;m++){
                System.out.println(ans[m]);
            }
    }
}
