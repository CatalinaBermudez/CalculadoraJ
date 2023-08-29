package Calculadora;

public class tan {

    public tan() {
    }

    public void resultadoTan(double numero1){
        double resultado = Math.tan(Math.toRadians(numero1));
        System.out.println(resultado);
    }
}

