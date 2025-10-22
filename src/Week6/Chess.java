package Week6;

import java.util.Random;

public class Chess {
    public static void main(String[] args) {
        //TODO make the player class and make the code below function as instructed.
        //TODO Uncomment the code below to test your solution. Do NOT change any code here beyond uncommenting it.
        //Negative age should not be allowed!
        Player player1 = new Player("Sebastiaan", 2993, 0.5f, false);
        //Fixing negative age
        player1.setAge(1993);
        //Win ratio should not be higher than 1!
        Player player2 = new Player("Wim", 1963, 75, false);
        //Fixing win ratio
        player2.setWinRatio(0.73f);

        System.out.println(player1 + " win? " + player1.play());
        System.out.println(player2 + " win? " + player2.play());

        if (player1.play(player2)) {
            System.out.println(player1 + " wins!");
        } else {
            System.out.println(player2 + " wins!");
        }
    }
}

class Player {
    private final int CURRENT_YEAR = 2025;
    private String name;
    private boolean retired;
    private int age;
    private float winRatio;

    public Player(String name, int age, float winRatio, boolean retired) {
        this.name = name;
        this.age = age;
        this.winRatio = winRatio;
        this.retired = retired;
    }

    private boolean verifyAge() {
        return this.age <= CURRENT_YEAR && (this.age - CURRENT_YEAR) < 120;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float getWinRatio() {
        return this.winRatio;
    }

    public void setWinRatio(float winRatio) {
        this.winRatio = winRatio;
    }

    public boolean getRetirement() {
        return this.retired;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (verifyAge()) {
            this.age = 0;
        }
        this.age = age;
    }

    public Boolean play() {
        Random generator = new Random();
        int num = generator.nextInt();
        boolean win;
        if (num < this.winRatio) {
            win = false;
        } else {
            win = true;
        }
        return win;

    }

    public boolean play(Player player) {
        Random generator = new Random();
        float num1 = generator.nextFloat(0, 1);
        float num2 = generator.nextFloat(0, 1);
        boolean win;
        float result1 = num1 - this.getWinRatio();
        float result2 = num2 - player.getWinRatio();
        if (result1 < result2) {
            return true;
        }
        return false;
    }

}

