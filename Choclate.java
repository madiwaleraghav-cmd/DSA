class Main {
    public static void main(String[] args) {
        int[] a={12,41,23,53,32};
        // 12 23 32 41 53 
        int temp=0,m=3;
        int diff=0,j,fmin=0,mindiff=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            for( j=0;j<a.length;j++){
                if(a[i]<a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
          for(j=i;j<m;j++){
              System.out.print(a[j]+" ");
           diff=a[j]-a[i];
           
             
          }
         mindiff=Math.min(mindiff,diff);
          m+=1;
          if(j==a.length){
              break;
          }
          System.out.println();
         
        }
        System.out.print(mindiff);

    }
}