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
public class Fila {

    private int tamanho;
    private int inicio;
    private int fim;
    private int array[];
    private int quantElementos;

    public Fila() {
        this(10);
    }

    public Fila(int tamanho) {
        if (tamanho <= 0) {
            throw new RuntimeException("Tamanho tem que ser maior do que zero");
        }
        this.tamanho = tamanho;
        this.array = new int[tamanho];
        inicio = 0;
        fim = 0;
        quantElementos = 0;
    }

    public boolean isEmpty() {
        return quantElementos == 0;
    }

    public int size() {
        return quantElementos;
    }

    public void enqueue(int elemento) {
        if (quantElementos == tamanho) {
            throw new RuntimeException("Fila está cheia!\n");
        }
        array[fim] = elemento;
        fim = (fim + 1) % tamanho;
        quantElementos++;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está fazia!\n");
        }
        inicio = (inicio + 1) % tamanho;
        quantElementos--;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("A fila está fazia!\n");
        }
        return array[inicio];
    }
    
    public void destroy(){
        inicio = 0;
        fim = 0;
        quantElementos = 0;
    }

}
