public class Methods {
    public static void main(String[] args) {

        // A void method is one that simply performs a task and then terminates
        //System.out.println("this is a void method");
        //int number =Integer.parseInt("700");
        //printAverage(10,50);
        //double average= getAverage(10,50);
        //System.out.println(average);
        String fullname = setFullName("imed eddine", "benzarti");
        System.out.println(fullname);

       if (isValid(500))
       {
           System.out.println("in range");
       }
       else
       {
           System.out.println("not in range");
       }


    }

    public static void printAverage(int value1, int value2) {
        double average = (value1 + value2) / 2.0;
        System.out.println(average);
    }

    public static double getAverage(int value1, int value2) {
        double average = (value1 + value2) / 2.0;
        return average;
    }

    public static String setFullName(String name, String lastname) {
        String fullname = name + " " + lastname;
        return fullname;
    }

    public static boolean isValid(int number) {
        boolean status;
        if(number>=1 && number <=100)
        {
            status = true;
        }
        else
        {
            status = false;
        }
        return status;

        / /return (number>=1 && number <=100);
    }
}
