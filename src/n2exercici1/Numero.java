package n2exercici1;

import java.util.Random;

public class Numero implements Comparable<Numero>{

    private final Integer valor;

    public Numero(){
        valor = new Random().nextInt(0, 100);
    }

    @Override
    public String toString() {
        return "Numero{" +
                "valor=" + valor +
                '}';
    }


    @Override
    public int compareTo(Numero o) {
        return this.valor.compareTo(o.valor);
    }
}
