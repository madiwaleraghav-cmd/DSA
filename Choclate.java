import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class choclate {
    public static int min(int[] nums,int m){
        int dif=0;
        int a,b;
        ArrayList<Integer> a1=new ArrayList<>();
        for(int x:nums){
            a1.add(x);
        }
        a1.sort(null);
        for(int i=0;i<m;i++){
            a=a1.get(0);
            b=a1.get(m-1);
            dif=b-a;
        } 
        return dif;
    }

   
    public static void main(String[] args) {
        int[] nums={7, 3, 2, 4, 9, 12, 56};
       int result=choclate.min(nums,5);
       System.out.print(result);
        
    }
}
