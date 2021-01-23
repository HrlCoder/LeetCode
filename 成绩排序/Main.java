package 益智.成绩排序;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            List<Person> list = new ArrayList<>();
            int numPerson = sc.nextInt();
            int option = sc.nextInt();
            for (int i = 0; i < numPerson; i++) {
                list.add(new Person(sc.next(),sc.nextInt()));
            }
            if(option == 0) {
                list.stream().sorted((Person o1, Person o2)->o2.score-o1.score).forEach(System.out::println);
            } else if(option == 1) {
                list.stream().sorted((Person o1, Person o2)->o1.score-o2.score).forEach(System.out::println);
            }
        }
    }
}
