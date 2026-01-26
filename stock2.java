public class stock2 {
    public static void main(String[] args) {
        int[] prices={3,8,1,8};
        int n=prices.length,Tprofit=0,profit=0;
        if(n==1){
           System.out.print("0");
           return;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Tprofit=prices[j]-prices[i];
                profit=Math.max(Tprofit, profit);
            }
        }
        System.out.print(profit);
        
    }
}
