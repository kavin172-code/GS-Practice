public class Question18 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {0,1,3,4};
        System.out.println(smallestMissingInteger(a));
        System.out.println(smallestMissingInteger(b));
    }

    private static int smallestMissingInteger(int[] a) {

        for(int i=0;i<a.length;i++){
            if(i<a[i]){
                return i;
            }
        }
        return -1;
    }
}
