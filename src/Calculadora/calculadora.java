
package Calculadora;

import javax.swing.JOptionPane;


public class calculadora {
    double numero1;
    double numero2;
    int eleccion;

    public calculadora() {

    }
    public void leerNumero(){
    this.numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
    this.numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
    }
    public void seleccion(){
    this.eleccion=Integer.parseInt(JOptionPane.showInputDialog("Tenemos las siguientes opciones en tu calculadora con los dos numeros que diste:\n"
            + "1. Suma\n"
            + "2. Resta\n"
            + "3. Multiplicacion\n"
            + "4. Division\n"
            + "5. Sin\n"
            + "6. Cos\n"
            + "7. Tan\n"
            + "8. Raiz\n"
            + "9. Cubo\n"
            + "6. Mostrar todas"));
            suma sumando=new suma();
            resta restando= new resta();
            multiplicacion multiplicando= new multiplicacion();
            division dividiendo= new division();
            seno seno = new seno();
            coseno coseno = new coseno();
            tan tan = new tan();
            raiz raiz = new raiz();
            cubo cubo = new cubo();
        switch (eleccion) {
            case 1:
                sumando.resultadoSuma(this.numero1,this.numero2);
                break;
            case 2:
                restando.restando(this.numero1, this.numero2);
                break;
            case 3:
                multiplicando.multiplicando(this.numero1, this.numero2);
                break;
            case 4:
                dividiendo.dividiendo(this.numero1, this.numero2);
                break;
            case 5:
                seno.resultadoSeno(this.numero1);
                break;
            case 6:
                coseno.resultadoCoseno(this.numero1);
                break;
            case 7:
                tan.resultadoTan(this.numero1);
                break;
            case 8:
                raiz.resultadoRaiz(this.numero1);
                break;
            case 9:
                cubo.resultadoCubo(this.numero1);
                break;
            case 10:
                sumando.resultadoSuma(this.numero1,this.numero2);
                restando.restando(this.numero1, this.numero2);
                multiplicando.multiplicando(this.numero1, this.numero2);
                dividiendo.dividiendo(this.numero1, this.numero2);
                seno.resultadoSeno(this.numero1);
                coseno.resultadoCoseno(this.numero1);
                tan.resultadoTan(this.numero1);
                raiz.resultadoRaiz(this.numero1);
                cubo.resultadoCubo(this.numero1);
                break;

            default:
                throw new AssertionError();
        }
    }

}
