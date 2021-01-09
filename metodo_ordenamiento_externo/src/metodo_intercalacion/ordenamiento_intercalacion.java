/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_intercalacion;


public class ordenamiento_intercalacion {
    int i,j,temporal,pasadas;// se insertan las variables que se utilizaran 

    public ordenamiento_intercalacion() {// se inserta el metodo contructor
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
        
    }
    //metodo de burbuja
    public void burbuja1(int[] arreglo){
        pasadas=0;
        for(i=0;i<arreglo.length;i++){// cuando i vale 0 y tiene que ser menor que el arreglo entonces que se incremente
            // este bucle  lo que va ser es ordenar los numeros, cuando j es igual a i que sume 1 entoces el arreglo j va ser menor al arreglo y que se incremente
            for(j=i+1;j<arreglo.length;j++){
                if(arreglo[i]>arreglo[j]){// se compara si el arreglo i es menor que el arreglo j 
                    temporal=arreglo[i]; // entonces el arreglo i pasa a ser temporal
                    arreglo[i]=arreglo[j];//  el arreglo j se almacena al arreglo i 
                    arreglo[j]=temporal;// el arreglo j pasa ser el temporal 
            }
                pasadas++; // se incrementa cuantas vueltas dio el programa para ordenar
            }
            
        }
        System.out.println("termino en :"+pasadas+" pasadas :");
    }
    public void intercalacalacion(int [] arregloA,int []arregloB){//se crea un metodo con dos arreglo para ordenar los datos
        int i,j,k;// se declara las variables que contenxra el arreglo
        // se crea un arreglo que contenga  el tamaño  del arregloA+arregloB
        int arregloc[]=new int [arregloA.length+arregloB.length];
        // repetir mientras los arreglo A yB tenga elementos que comparar
        // se va inicializar cuando i sea igual j y j sea igual k , va terminar cuando i sea menor arregloA y j sea menor arregloB y j que se incremente
         for(i = j = k =0;i<arregloA.length && j<arregloB.length; k++){
            if(arregloA[i]<arregloB[j]){// si el arreglo es menor a lo que hay en el arreglo B
                arregloc[k]=arregloA[i];// si los datos son correctos se pasan al arreglo c y eso va ser igual al arreglo A
                 i++;
            }else{
                arregloc[k]=arregloB[j];// arregloc va ser igual B
               // se incrementa j que es el arreglo B
                j++;
            }
                
        }  
            // para añadir a arreglo C los elementos  arregloA sobrantes en caso de haberlos
         for(;i<arregloA.length;i++,k++){// se deja un espacio por si quedo algun lugar y se inializa en segundo lugar y se incrementan los ambos indices
         arregloc[k]=arregloA[i];
        }
         // para añadir a arreglo C los elementos  arregloB sobrantes en caso de haberlos
         for(;j<arregloB.length;j++,k++){// se deja un espacio por si quedo algun lugar y se inializa en segundo lugar y se incrementan los ambos indices
         arregloc[k]=arregloB[j];
        }
         System.out.println("arreglo ordenado por el metodo de intercalacion :");
         mostrarArreglo(arregloc);// se inserta el metodo para mostrar el arreglo
    } 
         
    public void mostrarArreglo(int[]arreglo){// se inserta un metodo para mostrar los datos
        int k; 
        for(k=0;k<arreglo.length;k++){// se utiliza un for cuando k vale 0 cuando sea menor que el arreglo que se incremente
            System.out.print("["+arreglo[k]+"]");
            }
        System.out.println();
    }
}
