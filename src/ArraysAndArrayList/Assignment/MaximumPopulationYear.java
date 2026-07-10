package ArraysAndArrayList.Assignment;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs={
                {1993,1999},
                {2000,2010}
        };
        System.out.println(maximumPopulation(logs));
    }
    public static int maximumPopulation(int[][] logs) {
        int n=2050-1950;
        int [] ans=new int [n+1];
        for(int [] arr:logs){
            int m=arr[0];
            int l=arr[1];
            ans[m-1950]+=1;
            ans[l-1950]-=1;
        }
        int result=0;
        int mx=0;
        for(int i=1;i<n;i++){
            ans[i]=ans[i]+ans[i-1];
        }
        for(int i=0;i<n;i++){
            if(ans[i]>mx){
                mx=ans[i];
                result=i;

            }
        }
        return 1950+result;
    }
}