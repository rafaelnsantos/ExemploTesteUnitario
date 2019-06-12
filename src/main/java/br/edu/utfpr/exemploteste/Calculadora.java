package br.edu.utfpr.exemploteste;

public class Calculadora {
    public float somar (int a, int b) {
        return a + b;
    }
    public float subtrair (int a, int b) {
        return a - b;
    }
    public float multiplicar (int a, int b) {
        return a * b;
    }
    public float dividir (int a, int b) throws DivisaoPorZeroException {
        if(b == 0) throw new DivisaoPorZeroException();
        return a / b;
    }
}
