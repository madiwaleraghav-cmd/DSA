public class contains {
    public static boolean duplicate(int[] arr){
        boolean flag=false;
         for(int i=0;i<arr.length;i++){
            
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        flag=true;
                    }
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,5};
        contains.duplicate(arr);
       
    }
}
