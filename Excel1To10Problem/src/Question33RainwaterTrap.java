
public class Question33RainwaterTrap {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
        int lMax=Integer.MIN_VALUE;
        int rMax = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length-1;
        int result = 0;
        while(l<r){
            if(height[l]>lMax){
                lMax = height[l];
            }
            if(height[r]> rMax){
                rMax = height[r];
            }
           if(lMax<rMax){
               result = result+ (lMax-height[l]);
               l++;
           }
            else{
                result = result+ (rMax-height[r]);
                r--;
            }
        }

        System.out.println(result);

    }
}
