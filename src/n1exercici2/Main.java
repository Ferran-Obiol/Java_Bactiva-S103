package n1exercici2;

import java.util.HashSet;

public class Main {

    public static void main (String[] args) {
        HashSet<Month> months = new HashSet<>();
        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Agost"));
        months.add(new Month("Septembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));


        months.add(new Month("Agost"));
        months.forEach(month -> System.out.println(month.getName()));
    }
}
