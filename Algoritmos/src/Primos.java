import java.util.ArrayList;
import java.util.List;

public class Primos {
    static public void primos() {
        List<Integer> listaPrimos = new ArrayList<>();
        int numero = 1;
        boolean stop = false;
        while (!stop) {
            int cont = 0;
            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    cont++;
                }
            }
            if (cont <= 2) {
                listaPrimos.add(numero);
            }
            if (listaPrimos.size() == 51) {
                stop = true;
            }
            numero++;
        }
        System.out.println(listaPrimos);
    }
}
