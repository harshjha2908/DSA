public class duplicate{
public static void main(String[] args) {
    int arr[]={1,1,2,2,2,3,3,3};
int i=0 , j=1;
while (j<arr.length) {
    if (arr[j]==arr[j-1]) {
        j++;
        continue;
        
        
    }else{arr[i+1]=arr[j];
        i++;
        j++;
        
    }
   
}
for (int k=0; k<=i; k++){
    System.out.println(arr[k]+ "");

    } 
    
}
}