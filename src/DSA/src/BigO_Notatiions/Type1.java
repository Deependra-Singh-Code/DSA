package BigO_Notatiions;

public class Type1 { //Big O(n)

    public  static void printItems(int n)
    {
        for(int i=0; i<n; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}
