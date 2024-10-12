public class Calculadora {

    public int multiplicacion(int numA, int numB) {
        int resultado;
        resultado = numA * numB;

        return resultado;
    }

    public boolean isnull(int valor_resultado) {
        boolean resultado = true;
        if (valor_resultado != 0) {
            resultado = false;
        }

        return resultado;
    }
}
