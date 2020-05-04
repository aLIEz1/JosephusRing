import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Josephus jo = new Josephus();
        Scanner in = new Scanner(System.in);
        int times = in.nextInt();
        for (int i = 0; i < times; i++) {
            int person = in.nextInt();
            int[] mi = new int[person];
            for (int j = 0; j < person; j++) {
                mi[j] = in.nextInt();
            }
            int passwd = in.nextInt();
            if (person!=1){
                Josephus head = jo.init(person, mi);
                jo.func(head, person, passwd);
            }else {
                System.out.print(1);
            }

            System.out.println();
        }
    }
}
