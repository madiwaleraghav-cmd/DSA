import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;
public class Nextpermutation {
    public static void main(String[] args) {
        int ind=-1,max=0,temp=0;
        
        int[] arr={1,3,2};
       ArrayList<Integer> a1=new ArrayList<>(arr.length);
       for(int i=arr.length-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
            ind=i;
            
            break;
        }
       }
       if(ind==-1 || arr.length<=2){
         int i=0,j=arr.length-1;
         while(i<=j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
         }
         for(int x:arr){
            a1.add(x);
         }
         System.out.print(a1);
         return;
       }
       for(int i=arr.length-1;i>ind;i--){
            if(arr[i]>arr[ind]){
                temp=arr[ind];
                arr[ind]=arr[i];
                arr[i]=temp;
                break;

            }
       }
       for(int i=ind+1;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
         }
       }
       for(int x: arr){
            a1.add(x);
       }
       System.out.print(a1);
        
    }

}
