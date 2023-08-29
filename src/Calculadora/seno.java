
package Calculadora;


public class seno {

    public seno() {
    }

    public void resultadoSeno(double numero1){
        double resultado = Math.sin(Math.toRadians(numero1));
        System.out.println(resultado);
    }
}
