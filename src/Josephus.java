public class Josephus {
    int number;
    int password;
    Josephus next;

    public Josephus init(int n, int[] array) {
        int i = 1;
        Josephus head;
        Josephus cur = new Josephus();
        Josephus next;
        cur.number = i;
        cur.password = array[i - 1];
        head = cur;
        for (i = 2; i <= n; ++i) {
            next = new Josephus();
            next.number = i;
            next.password = array[i - 1];
            cur.next = next;
            cur = next;

        }
        cur.next = head;
        return head;
    }

    public void func(Josephus head, int length, int password) {
        Josephus pre = new Josephus();
        Josephus next;
        Josephus temp;
        next = head;
        for (int i = 1; i <length; ++i) {
            pre = next.next;
            next = next.next;
        }
        for (int i = 1; i <= length; ++i) {
            for (int j = 1; j < password; ++j) {
                pre = pre.next;
            }
            temp = pre.next;
            next = temp.next;
            password = temp.password;
            System.out.print(temp.number + " ");
            pre.next = next;
            temp = null;
        }
    }
}
