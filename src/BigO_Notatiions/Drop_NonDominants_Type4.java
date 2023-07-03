package BigO_Notatiions;

public class Drop_NonDominants_Type4 { //Big O(n^2)

    public  static  void printItems(int n)
    {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
            {
                System.out.println(i + " " + j);
            }
        }

        for(int k=0; k<n; k++)
        {
            System.out.println(k);
        }
    }

    public static void main(String[] args) {
        printItems(3);
    }
}
// This for loops runs as O(n^2 + n) so,
// by rule of simplification we dropped n . and  it looks like O(n^2) because n^2 grows faster
