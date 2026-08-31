/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_scope;

/**
 *
 * @author aldop
 */
public class EVA1_1_SCOPE {

    public static void main(String[] args) {
        int x = 100;//existe dentro del bloque main()
        for (int i = 0; i < 10; i++) {
            System.out.println("i =" + i);
            x++;//visible dentro del for
        }
        //System.out.println("VALOR FINAL DE LA I=" + i);// ya no existe
        System.out.println("valor final de la x=" + x);// todavia existe
    }
    public static void OtraFuncion(){
       // System.out.println("valor de x" + x);//no existe
    }
    
}
