public class Arrays {
    public static void main(String[] args) {

        int [] numbers = new int[4];
        numbers[0]=10;
        numbers[1]=15;
        numbers[2]=20;
        numbers[3]=25;

        //int [] numbers = {10,15,20,25};
       // System.out.println(numbers[1]);

        for(int i = 0; i <numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        System.out.println("-----------------------------");

        for(int val : numbers){
            System.out.println(val );
        }




    }
}
