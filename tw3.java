import java.util.Scanner;

public class tw3 {
    public static void main(String[] args) throws Exception {
        String test;
        Scanner sc = new Scanner(System.in);
        test = sc.next();
        if (!test.contains("SDMCET")) {
            throw new SubStringNotFoundException();
        } else
            System.out.println("SDMCET found in string");
    }
}

class SubStringNotFoundException extends Exception {
    @Override
    public String toString() {
        return "Substring SDMCET not found";
    }
}