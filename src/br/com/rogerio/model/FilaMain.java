/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.model;

/**
 *
 * @author roger
 */
public class FilaMain {

    public static void main(String[] args) {
        try {
            Fila fila = new Fila(3);

            fila.enqueue(1);
            fila.enqueue(2);
            fila.enqueue(3);
            fila.dequeue();
            fila.enqueue(4);
            fila.dequeue();
            fila.dequeue();
            fila.dequeue();

            System.out.println("Frente" + fila.peek());
            
        } catch (Exception erro) {
            System.out.println(erro.getMessage());
        }
    }

}
