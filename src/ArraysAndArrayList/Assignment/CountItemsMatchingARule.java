package ArraysAndArrayList.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items=new ArrayList<>();
        // initialization
        items.add(Arrays.asList("phone","blue","pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));
        String ruleKey="color";
        String ruleValue="silver";
        int ans=countMatches(items,ruleKey,ruleValue);
        System.out.println(ans);

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key=0;
        int count=0;
        if(ruleKey.equals("type")) key=0;
        else if(ruleKey.equals("color")) key=1;
        else if (ruleKey.equals("name")) key=2;


        for(List<String> ele:items){
            if(ele.get(key).equals(ruleValue)) count++;
        }
        return count;
    }
}