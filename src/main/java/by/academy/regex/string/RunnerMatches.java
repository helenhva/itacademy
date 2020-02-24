package by.academy.regex.string;

public class RunnerMatches {

    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println(" 5678".matches("-?\\d+"));
        System.out.println("+9ll".matches("-?\\d+"));
        System.out.println("+911".matches("(-|\\+)?\\d+"));
    }
}
