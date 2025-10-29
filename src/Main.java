import java.util.Random;

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

        String[] listOne = {"agnostic", "opinionated","voice activated", "haptically driven",
                "extensible","reactive", "agent based", "functional", "AI enabled","strongly typed"};

        String[] listTwo = {"loosely coupled", "six sigma","asynchronous", "event driven", "pub-sub",
                "IoT", "cloudnative", "service oriented", "containerized", "serverless","microservices",
                "distributed ledger"};
        String[] listThree = {"framework", "library","DSL", "REST API", "repository", "pipeline", "servicemesh",
                "architecture", "perspective", "design","orientation"};

        int lengthOne = listOne.length;
        int lengthTwo = listTwo.length;
        int lengthThree = listThree.length;

        Random randomGenerator = new Random();
        int rand1 = randomGenerator.nextInt(lengthOne);
        int rand2 = randomGenerator.nextInt(lengthTwo);
        int rand3 = randomGenerator.nextInt(lengthThree);

        String phrase = listOne[rand1] + " " + listTwo[rand2] + " " + listThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
}