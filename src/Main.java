public class Main {
    public static void main(String[] args) {
        int x = 2;
        if (x == 3) {
            System.out.println("x must be 3");
        } else {
            System.out.println("x is not 3");
        }
        System.out.println("This run no matter what");


        int a = 1;
        while (a < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            a = a + 1;
        }
        if( a == 3){
            System.out.print("Do");
        }
    }
}