public class CompareArrays {

    public static void main(String[] args) {
        int [] numbers1={2,4,6,8,10};
        int [] numbers2={2,4,6,8,10};

        /*int [] numbers2=numbers1;

        if(numbers1 == numbers2)
        {
            System.out.println("they are the same");
        }
        else
        {
            System.out.println("not the same");
        }*/

        boolean arraysEqual = true;
        int i = 0;

        if(numbers1.length!=numbers2.length)
        {
            arraysEqual = false;
        }

        while (arraysEqual && i < numbers1.length)
        {
            if(numbers1[i]!=numbers2[i])
            {
                arraysEqual = false;
            }

            i++;
        }

        if(arraysEqual)
        {
            System.out.println("they are the same");
        }
        else
        {
            System.out.println("not the same");
        }
    }
}
