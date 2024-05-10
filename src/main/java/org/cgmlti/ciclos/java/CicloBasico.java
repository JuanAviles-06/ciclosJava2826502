package org.cgmlti.ciclos.java;

public class CicloBasico {
    public static void main(String[] args) {
        
        //contador es de tipo entero
        int contador = 1;

        //el valor de la condicional 
        //dberia ser el valor final
        //del ciclo 
        while( contador <= 100){
            //instruccion del ciclo:
            System.out.println(contador);
            ++contador;
        }
    }

}
