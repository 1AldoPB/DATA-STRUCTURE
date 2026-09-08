/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_parametros;

/**
 *
 * @author aldop
 */
public class EVA1_5_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=5;
        System.out.println("valor de i= " + i);
        incrementar(i);
        System.out.println("VALOR DE I NUEVO =" + i);
        //REFERENCIA COMO LAS DEL CAP
        Prueba prueba=new Prueba();
        incrementarObj(prueba);
        System.out.println("VALOR DE PRUEBA Y =" + prueba.y);
    }
    public static void incrementar(int valor){//paso por valor(recibo una copia)
    valor++;
    }
    public static void incrementarObj(Prueba objeto){
objeto.y++;
}
}
class Prueba{
int y=5;}