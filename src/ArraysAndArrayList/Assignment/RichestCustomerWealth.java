package ArraysAndArrayList.Assignment;

public class RichestCustomerWealth {
    public static void main(String[] args) {
//        int[][] acc={{1,2,3},{3,2,1}};
        int[][] acc={{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(acc));

    }
    public static int maximumWealth(int[][] accounts) {
        int wealth=0;
        for (int i = 0; i < accounts.length; i++) {
        int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if(sum>wealth){
                wealth=sum;
            }

        }
        return wealth;
    }
}