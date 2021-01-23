package 益智.成绩排序;

public class Person {
    public String name;
    public int score;

    public Person(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.name + '\'' + this.score;
    }
}
