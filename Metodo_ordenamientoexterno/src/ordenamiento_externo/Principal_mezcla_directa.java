/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento_externo;

/**
 *
 * @author JOSE
 */
public class Principal_mezcla_directa {
    public static void main(String [] args){
       Mezcla_directa ordenaciondirecta=new Mezcla_directa();// se inserta un metodo para poder utilizar los datos 
        int vector2[]={55,4,87,22,55,99,23,56,21};// se declara el vector que se ordenara  poe el dicho metodo
        // se imprime el arreglo que para mostrar los datos  desordenados
        System.out.println("arreglo vector 2 original: ");
        ordenaciondirecta.mostrarArreglo(vector2);
        // se imprime los datos que previamente se ordenaron 
        System.out.println("arreglo vector 2 ordenado por mezcla directa :");
        vector2=ordenaciondirecta.mezcladirecta(vector2);// necesitamos alamcenar los valores en una variable para ordenar los datos
       ordenaciondirecta.mostrarArreglo(vector2);// este metodo va mostrar los datos ya ordenados con la ayuda de la variable vector2 
    }
}
