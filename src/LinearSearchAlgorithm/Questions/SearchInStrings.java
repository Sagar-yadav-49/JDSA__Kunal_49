package LinearSearchAlgorithm.Questions;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String str="Sagar";
        char ch='a';
        boolean ans=search(str,ch);
        System.out.println(ans);
//        System.out.println(Arrays.toString(str.toCharArray()));
    }
    // using standard for loop
//    static boolean search(String str, char ch){
//        if(str.isEmpty()){
//            return false;
//        }
//        for (int i= 0; i < str.length(); i++) {
//            if(str.charAt(i)==ch){
//                return true;
//            }
//        }
//        return false;
//    }

    // using for-each loop
    static boolean search(String str, char ch){
        if(str.isEmpty()){
            return false;
        }
        for(char ele:str.toCharArray()){ // [S, a, g, a, r]
            if(ele==ch){
                return true;
            }
        }
        return false;
    }
}