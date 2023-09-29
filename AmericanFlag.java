public class AmericanFlag {
    public static void main(String[] args) {
        printAmericanFlag();
    }

    public static void printAmericanFlag() {
        String stripe = "* * * * * * ==================================";
        String spaceStripe = " * * * * *  ==================================";

        for (int i = 0; i < 4; i++) {
            System.out.println(stripe);
            System.out.println(spaceStripe);
        }

        System.out.println("* * * * * * ==================================");

        for (int i = 0; i < 6; i++) {
            System.out.println(stripe);
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("=========================================");
        }
    }
}
