public class Testing
{
    public static void main( String[] args ) {

        for (int i = 0; i < 4; i++){
            System.out.print("x");
        }

        System.out.println();

        int size = 4;
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("A");
            }
            System.out.println();
        }



    }
}
