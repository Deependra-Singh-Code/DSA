package BigO_Notatiions;

public class Type5 { //Big O(1)

    public static int addItems(int n)
    {
        int i = n + n + n;
        System.out.println(i);
        return 0;

    }

    public static void main(String[] args) {
       addItems(10);
    }
}
