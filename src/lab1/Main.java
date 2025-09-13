package lab1;

public class Main {
    public static void main(String[] args) {
        FizzBuzz.doFizzBuzz(5);
        String[] arr = new String[0];
        FizzBuzz.main(arr); // FizzBuzz.main() doesn't work because main() requires a String[] parameter
    }
}