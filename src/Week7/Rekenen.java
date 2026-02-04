package Week7;

public class Rekenen {
    public static void main(String[] args) {
        int[][] first = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] second = {{4, 5, 6}, {7, 8, 9}, {1, 2, 3}};
        int counter1 = 0;
        int counter2 = 0;
        int totalcounter;
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++)
                System.out.printf("%d ", first[i][j]);
        }

        for (int k = 0; k < second.length; k++) {
            for (int l = 0; l < second[k].length; l++) {
                counter2 = second[k][l];
            }
        }
        totalcounter = counter1 + counter2;
        System.out.println(totalcounter);
    }
}
