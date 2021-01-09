/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_intercalacion;

/**
 *
 * @author JOSE
 */
public class Main_intercalacion {
    public static void main(String []args){
    ordenamiento_intercalacion ordenacion =new ordenamiento_intercalacion(); // se crea un metodo para poder un mostrar los datos
    //se declaran los tipos de vectores
    int vector1[] ={5,13,15,8,7,1};
    int vector2[]={55,4,87,22,55,99,23,56,21};
    int vector3[]={4,10,12,15,3,56,22};
    System.out.println("arreglo vector 1 original: ");
    ordenacion.mostrarArreglo(vector1);// se inserta la variable que fue creada para mostrar los datos
    System.out.println("arreglo vector 3 original: ");
    ordenacion.mostrarArreglo(vector3);
    ordenacion.burbuja1(vector1);// se ocupa el metodo burbuja para poder los numeros 
    ordenacion.burbuja1(vector3);
    ordenacion.intercalacalacion(vector1, vector3);// se inseta el metodo para ordenar los numeros previamente ordenados
        
        
    }
       
        
}
