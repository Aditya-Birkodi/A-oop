import java.util.Scanner;

class negativeNumberNotAllowed extends Exception {
    @Override
    public String toString() {
        return "Negative number not allowed";
    }
}

class NumberNotPrimeException extends Exception {
    public String toString() {
        return "Not a prime number";
    }
}

public class tw2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            throw new negativeNumberNotAllowed();
        } else if (isPrime(n)) {
            System.out.println(n + " is a prime number ");
        } else {
            throw new NumberNotPrimeException();
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
