
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0.0,total=0.0;
        int n=nums1.length+nums2.length;
        ArrayList<Integer> a1=new ArrayList<>(n);
        for(int x:nums1){
            a1.add(x);
        }
        for(int x:nums2){
            a1.add(x);
        }
        Collections.sort(a1);
        if((n%2)!=0){
            int totallength=n+1;
            int index=totallength/2;
            median=a1.get(index-1);
        }else{
         
         int point=n/2;
         int diff=a1.get(point)-a1.get(point-1);
         double add=(double)diff/2;
         median=a1.get(point-1)+add;
        
        }
        return median;
    }
}
