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
            System.out.print("Do\n");
        }

        int bottlesNum = 10;
        String word = "bottles";

        while (bottlesNum > 0){

            if(bottlesNum == 1){
                word = "bottle";
            }
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");
            bottlesNum = bottlesNum - 1;

            if (bottlesNum > 0) {
                System.out.println("There'll be " + bottlesNum +" green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            }
        }
    }
}