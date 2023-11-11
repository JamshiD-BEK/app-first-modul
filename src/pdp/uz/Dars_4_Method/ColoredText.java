package pdp.uz.Dars_4_Method;

public class ColoredText {
    public static void main(String[] args) {

        // ANSI escape codes for different colors
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[60m";
        String reset = "\u001B[0m";

        // Print colored text
        System.out.println(red + "This is red text!" + reset);
        System.out.println(green + "This is green text!" + reset);
        System.out.println(yellow + "This is yellow text!" + reset);

    }
}
