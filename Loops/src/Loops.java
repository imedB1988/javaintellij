public class Loops {

    public static void main(String[] args) {
        //the while loop

        int x = 0; // loop control variable

        System.out.println("the while loop");
        while(x<5){
            x = x+1;
            System.out.println(x );
        }
        System.out.println("-------------------------------------");
        // the do-while loop
        System.out.println("the do while loop");
        do{
            x = x+1;
            System.out.println(x );
        }
        while (x < 5);
        System.out.println("------------------------------------------");
        // the for loop
        System.out.println("the for loop");
        for (int i=0;i<5; i++)
        {
            x = x+i;
            System.out.println(x);
        }


    }
}
