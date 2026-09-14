/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_matrices;

/**
 *
 * @author aldop
 */
public class EVA1_9_MATRICES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz=new int [5][3];
        System.out.println("matriz.length =" + matriz.length);
        System.out.println("MATRIZ[0]" + matriz[0]);
        System.out.println("MATRIZ[0].LENGTH=" + matriz[0].length);
        //
        for (int i = 0; i < matriz.length; i++) {//primera dimension------ filas
            for (int j = 0; j < matriz[i].length; j++) { //segunda dimension-------columnas
                matriz[i][j]=(int)(Math.random()*100);
                
            }
            
        }
          for (int i = 0; i < matriz.length; i++) {//primera dimension------ filas
            for (int j = 0; j < matriz[i].length; j++) { //segunda dimension-------columnas
                matriz[i][j]=(int)(Math.random()*100);
                System.out.print("["+ matriz[i][j]+ "]");
        
    }
              System.out.println("");
    
          }
    }
}
