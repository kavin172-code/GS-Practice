public class Question2 {
    public static void main(String[] args) {
        String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
        String toSearch = "ODG";
        System.out.println(lengthOfLongestWord(dict, toSearch));
    }
    public static int lengthOfLongestWord(String[] dict, String toSearch){
        int maxVal = Integer.MIN_VALUE;
        for(int i=0;i<dict.length;i++){
            if(dict[i].contains(toSearch)){
                maxVal = Math.max(maxVal, dict[i].length());
            }
        }
        return maxVal;
    }
}
