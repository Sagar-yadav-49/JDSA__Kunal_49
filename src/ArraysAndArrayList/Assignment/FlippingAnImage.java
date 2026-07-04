package ArraysAndArrayList.Assignment;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        for(int[] ele:flipAndInvertImage(image)){
            System.out.println(Arrays.toString(ele));
        }
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans=reverse(image);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                if(ans[i][j]==0){
                    ans[i][j]=1;
                } else{
                    ans[i][j]=0;
                }
            }
        }
        return ans;
    }
    static int[][] reverse(int[][] image){
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length/2; j++) {
                int temp=image[i][j];
                image[i][j]=image[i][image[i].length-1-j];
                image[i][image[i].length-1-j]=temp;
            }
        }
        return image;
    }
}