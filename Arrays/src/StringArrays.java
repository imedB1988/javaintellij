public class StringArrays {
    public static void main(String[] args) {
        String [] names= getNames();

        for (int i = 0; i< names.length;i++)
        {
            if(names[i] != null)
            {
                System.out.println(names[i].charAt(1));
            }

        }
    }

    public static  String [] getNames()
    {
        String [] names= new String [6];
        names[0]="ab";
        names[1]="bc";
        names[2]="cd";
        names[3]="de";
        names[4]=null;
        names[5]="fg";


        return names;
    }
}
