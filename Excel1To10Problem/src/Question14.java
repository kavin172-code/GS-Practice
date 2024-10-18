public class Question14 {
    public static void main(String[] args) {
        System.out.println(isPowerOf10(1000));
        System.out.println(isPowerOf10(-1000));

    }
    public static boolean isPowerOf10(int num){
     if(num<=0)return false;
     while (num%10==0){
         num/=10;
     }
     return num==1;
    }
}
