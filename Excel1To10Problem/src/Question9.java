public class Question9 {
    public static void main(String[] args) {
        String str = "the quick the brown quick brown the frog";
        String word1 = "quick";
        String word2 = "frog";
        System.out.println(minimumDistance(str,word1,word2));
    }
    public static int minimumDistance(String str, String word1, String word2){
        int wordOneLastOccur = -1;
        int wordTwoLastOccur = -1;
        int minValue = Integer.MAX_VALUE;
        String[] itr = str.split(" ");
       for(int i=0;i<itr.length;i++){
           if(itr[i].equals(word1)){
               wordOneLastOccur = i;
               if(wordTwoLastOccur!=-1){
                   minValue = Math.min(minValue, (wordOneLastOccur-wordTwoLastOccur));
               }
           }
           if(itr[i].equals(word2)){
               wordTwoLastOccur=i;
               if(wordOneLastOccur!=-1){
                   minValue = Math.min(minValue, (wordTwoLastOccur-wordOneLastOccur));
               }
           }
       }
       return (minValue==Integer.MAX_VALUE)?-1:minValue-1;
    }
}
