/*
 * " Evaluación 1 Práctica 18 "Recursividad"
 *   15 / 09 / 2022 "
 */
package eva1_18_recursividad;
/**
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_18_RECURSIVIDAD {

    public static void main(String[] args) {
        falsoForDes(5);
        System.out.println("");
        falsoForAsc(5,1);
    }
    
    //Falso for
    //Imprimir una lista de números de mayor a menor (De manera recursiva)
    //Recibir un valor falsoForDes(5) --> "5 - 4 - 3 - 2 - 1"
    public static void falsoForDes(int valor){
        //¿Qué voy a hacer?  "Imprimir valor"
        //Llamada recursiva "falsoForDes(valor - 1)"
        //Deterner la llaada recursiva "Cuando valor = 1"
        // Si es 1 me detengo, si no, llamada recursiva
        
        /*if (valor > 0) {
            System.out.print(valor + " - ");
            valor--;
            falsoForDes(valor);
        }*/
        if (valor == 1) {
            System.out.print(valor + " - ");
        } else {
            System.out.print(valor + " - ");
            falsoForDes(valor - 1);
        }
        
    }
    //flasoForAsc(5,1) --> 1 - 2 - 3 - 4 - 5 
    public static void falsoForAsc(int valor, int ini){
        
        if (ini <= valor) {
            System.out.print(ini + " - ");
            falsoForAsc(valor, ini + 1);
        }
       
    }
    
}