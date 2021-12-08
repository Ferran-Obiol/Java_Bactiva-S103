package n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Generadora {

    private ListIterator<String> listIterator;
    private static final ArrayList<String> personatges = new ArrayList<>(Arrays.asList("Aladin", "Jasmin", "Jaffa", "Geni"));

    public Generadora() {
        listIterator = personatges.listIterator();
    }

    public String seguentPersonatge(){
        String personatge = "";
        if (!listIterator.hasNext())
            listIterator = personatges.listIterator();
        else personatge = listIterator.next();
        return personatge;
    }

}
