public class sumandduplicate {
    public static void main(String[] args) {
        int arr[]={1 , 1 ,1 ,2 ,2 ,3 ,3 ,4 ,4 ,4 ,5,5 ,5};
        int target=7;
    
        int i=0;

        int j=arr.length-1;
        while (i<j) {int sum = arr[i]+arr[j];
            if (sum==target){
                System.out.println(arr[i]+" "+arr[j]);
                while (arr[i]==arr[i+1]) {i++;
                    
                }
                while (arr[j]==arr[j-1]) {j--;
                    
                }

            }else if (sum>target) {j--;
                
            }else{
                i++;
            }
            
            
        }

    }
}
