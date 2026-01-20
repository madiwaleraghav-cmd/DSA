

public class MaAndMi {

 
     

     public static void main(String[] args) {
       
               int temp=0,min=0,max=0;
             int[] arr={4,2,5,3,1};
          for(int i=0;i<arr.length;i++){
              for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                }
              }
          }
          for(int i=0;i<arr.length;i++){
            min=arr[0];
            max=arr[arr.length-1];
          }
          System.out.print("min="+min+","+"max="+max);
    
}
}
