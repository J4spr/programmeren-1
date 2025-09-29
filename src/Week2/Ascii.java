package Week2;

public class Ascii {
    public static void main(String[] args) {
        for (int i = 32; i <= 127; i++) {
            if (i % 4 == 0) {
                System.out.print("\n");
            }
                System.out.printf("%s(%d)\t", getCharForAsciiCharacter(i), i);
        }
    }

    static char getCharForAsciiCharacter(int num) {
        return (char) num;
    }
}
