package lab1;

public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiples());
    }

    static int multiples() {
        int numberOfMultiples = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numberOfMultiples++;
            }
        }
        return numberOfMultiples;
    }

    static int multiples(int n, int a, int b) {
        int numberOfMultiples = 0;
        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                numberOfMultiples++;
            }
        }
        return numberOfMultiples;
    }
}
