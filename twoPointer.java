public class twoPointer {
public static void main (String[] args) {
    int arr []= {7,9,1,12,18,29,10};
    int target =19;

    int  i=0 ,j= arr.length-1;
for (int k=0; k<arr.length-1;k++){
    for(int l=0;l<arr.length-1-k;l++){
        if (arr[l]>arr[l+1]) {
            int temp=arr[l];
            arr[l]=arr[l+1];
            arr[l+1]=temp;
            
        }
    }
}
    while (i<j){
         int sum=arr[i]+arr[j];
         if (sum==target) {System.out.println(i+" "+j+" "+arr[i]+" "+arr[j]
            
          );
            
          i++;
            j--;  
            
         }
         else if (sum<target){
            i++;
    
         }else  {
            j--;
         }
        
    }

    }}