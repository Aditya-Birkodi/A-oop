import java.io.*;

class tw1 {
    public static void main(String[] args) {
        try {
            int c = 5 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            int[] ar = new int[-3];
            ar[5] = 100;
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            String test = null;
            System.out.println(test.charAt(0));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}