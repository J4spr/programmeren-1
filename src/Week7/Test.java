package Week7;

public class Test {
    public static void main(String[] args) {
        int[][] tstm = {
                {5,45,76,5,7,7,8,7,9},
                {5,45,76,5,7,56,8,77,9},
                {5,45,76,5,7,733,8,76,9},
                {5,4335,76,5,7,7,8,7,9}
        };

        for (int i = 0;i<tstm.length;i++){
            for (int j = 0;j<tstm[i].length;j++){
                System.out.println(tstm[i][j]);
            }
        }
    }
}
