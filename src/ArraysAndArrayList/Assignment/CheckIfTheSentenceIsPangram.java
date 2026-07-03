package ArraysAndArrayList.Assignment;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
//        String sentence="thequickbrownfoxjumpsoverthelazydog";
        String sentence="leetcode";
        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {
        if(sentence==null){
            return false;
        }
        boolean[] arr=new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i)-'a']=true;
        }
        for(boolean ele:arr){
            if(ele==false){
                return false;
            }
        }
        return true;
    }
}