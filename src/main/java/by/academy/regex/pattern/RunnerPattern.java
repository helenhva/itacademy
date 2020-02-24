package by.academy.regex.pattern;

public class RunnerPattern {

    public static void main(String[] angs) {
        for (String pattern : new String[]{"Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"})
            System.out.println("Rudolph".matches(pattern));
    }
}
