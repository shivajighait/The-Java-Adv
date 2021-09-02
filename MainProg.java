import java.util.Scanner;

public class MainProg {
    static final int limit = 300;

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.print("enter the paragraph or sentense: ");
        String msg = user.nextLine();
        int count[] = new int[limit];
        for (int i = 0; i < msg.length(); i++) {
            count[msg.charAt(i)]++;
            char ch[] = new char[msg.length()];
            for (int x = 0; x < ch.length; x++) {
                ch[x] = msg.charAt(x);
                int get = 0;
                for (int k = 0; k < ch.length; k++) {
                    if (msg.charAt(k) == ch[k]) {
                        get += 1;
                    }
                }
                if (get == 1) {
                    System.out.println(msg.charAt(i) + "\t" + count[msg.charAt(i)]);

                }
            }
        }

    }
}