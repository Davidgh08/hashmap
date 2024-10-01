import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> hash = new HashMap<>();

        hash.put(19,"Juan");
        hash.put(30,"Maria");
        hash.put(27,"Pedro");

        String nombre1 = hash.get(19);
        String nombre2 = hash.get(30);
        String nombre3 = hash.get(27);


        personas p1 = new personas(nombre1,29);
        personas p2 = new personas(nombre2, 20);
        personas p3 = new personas(nombre3, 50);

        System.out.println(hash);

            //Juan David Garzon Herrera
            //890802
    }
}