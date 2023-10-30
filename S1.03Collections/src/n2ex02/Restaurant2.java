package n2ex02;

import java.util.Objects;

public class Restaurant2 {
    private String name;
    private int score;

    public Restaurant2(String name, int score) {
        this.name = name;
        this.score = score;
    }

	public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "name: " + name + ", score: " + score;
    }
}
