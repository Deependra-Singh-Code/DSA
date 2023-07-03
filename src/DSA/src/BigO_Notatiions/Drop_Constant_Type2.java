package BigO_Notatiions;

public class Drop_Constant_Type2 {  //Big (2n) ?

    public  static  void printItems(int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.println(i);
        }

        for(int j=0; j<n; j++){
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }
}

//It is not called as a Big(2n) because of 2 variable i and j constant must be dropped so, 2 is eliminated
