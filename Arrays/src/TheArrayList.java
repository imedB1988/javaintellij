import java.util.ArrayList;

public class TheArrayList {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();

        names.add("abcd");
        names.add("efgh");
        names.add(2,"ijkl");
        names.set(1,"imed");
        names.remove(2);
        for (int i=0; i<names.size(); i++)
        {
            System.out.println(names.get(i));
        }

    }
}
