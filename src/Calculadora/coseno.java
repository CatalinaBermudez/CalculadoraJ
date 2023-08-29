package Calculadora;


public class coseno {

    public coseno() {
    }

    public void resultadoCoseno(double numero1){
        double resultado = Math.cos(Math.toRadians(numero1));
        System.out.println(resultado);
    }
}