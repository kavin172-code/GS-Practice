public class Question13 {
    public static void main(String[] args) {
        int [] a = {2,4,6,10,2,1};
        int k = 12;
        System.out.println(shortestSubArray(a, k));
    }
    public static  int shortestSubArray(int[] a, int k){
        int[] pf = calculatePfSum(a);
        int sum =0;
        int minVal = Integer.MAX_VALUE;
        for(int s = 0;s<a.length;s++){
            for(int e = s;e<a.length;e++){
                sum = pf[e]-(s>0?pf[s-1]:0);
                if(sum == k){
                    minVal = Math.min(minVal, e-s+1);
                }
            }
        }
        return minVal;
    }

    private static int[] calculatePfSum(int[] a) {
        int[] pf = new int[a.length];
        pf[0] = a[0];
        for(int i=1;i<a.length;i++){
            pf[i] = pf[i-1]+a[i];
        }
        return pf;
    }
}
