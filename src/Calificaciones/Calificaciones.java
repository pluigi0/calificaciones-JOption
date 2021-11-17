
package Calificaciones;

import javax.swing.JOptionPane;


public class Calificaciones {
    public static void main (String [] args){
        double calificacion1, calificacion2, calificacion3, suma;
        
        JOptionPane.showMessageDialog(null, " PROGRAMA QUE CALCULA E IMPRIME LA SUMA DE 3 CALIFICACIONES ");
        
        
        //Guardo la primera calificacion
        calificacion1 = Double.parseDouble(JOptionPane.showInputDialog("Mete la primera clasificacion: "));
        
        //Guardo la segunda calificacion
        calificacion2 = Double.parseDouble(JOptionPane.showInputDialog("Mete la second clasificacion: "));
        
        //Guardo la tercera calificacion
        calificacion3 = Double.parseDouble(JOptionPane.showInputDialog("Mete la third clasificacion: "));
        
        suma = calificacion1+calificacion2+calificacion3; //Sumamos las 3 notas

        
        JOptionPane.showMessageDialog(null, " La suma de estos es: "+suma); //Imprimimos la suma de las 3 calificaciones
        
    }    
}
