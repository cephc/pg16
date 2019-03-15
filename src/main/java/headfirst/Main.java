package headfirst;

public class Main {
    public static void main(String[] args) {
        String[] wordListOne = {"win-win", "dynamic", "B-to-B"};
        String[] wordListTwo = {"outside-the-box", "sticky", "distributed"};
        String[] wordListThree = {"process", "solution", "space"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int randOne = (int) (Math.random() * oneLength);
        int ranTwo = (int) (Math.random() * twoLength);
        int ranThree = (int) (Math.random() * threeLength);

        String phrase = wordListOne[randOne] + "" + wordListTwo[ranTwo] + "" + wordListThree[ranThree];
        System.out.println("What we need is a " + phrase);

    }
}
