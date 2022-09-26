class CCount {

    // (a)
    public static int cnt = 0;
    CCount() {
        cnt++;
    }

    public static void count() {
        System.out.println(cnt);
    }

    // (b)

    public static void setZero() {
        cnt = 0;
    }

    // (c)

    public static void setValue(int n) {
        cnt = n;
    }
}

public class class05 {
    public static void main(String[] args) {
        CCount count = new CCount();
        CCount.count();
        CCount.setZero();
        CCount.count();
        CCount.setValue(8);
        CCount.count();
    }
}
