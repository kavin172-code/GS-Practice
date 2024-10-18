public class Question28 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 3, 2, 20, 100, 80};
        waveSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void waveSort(int[] arr) {
       for(int i=0;i<arr.length-1;i++){
           if(i%2==0 && arr[i]<arr[i+1]){
               swap(arr, i, i+1);
           }
           if(i%2!=0 && arr[i]>arr[i+1]){
               swap(arr, i, i+1);
           }
       }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
