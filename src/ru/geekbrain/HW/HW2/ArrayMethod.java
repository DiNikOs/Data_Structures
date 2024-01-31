package ru.geekbrain.HW.HW2;

class ArrayMethod {

    private int [] arr;
    private int size;

    public ArrayMethod (int size) {
        this.size = 0;
        this.arr = new int [size];
    }

    public void display () {
        for (int i = 0; i <this.size ; i++) {
            System.out.print(this.arr[i] + " ");
        }
    }

    public void delete (int val) {
        int i = 0;
        for (i = 0; i < this.size; i++) {
            if (this.arr[i] == val) break;
        }
        for (int j = i; j < this.size - 1; j++) {
            this.arr[j] = this.arr[j+1];
        }
        this.size--;
    }

    public void insert (int val) {
        this.arr[this.size] = val;
        this.size++;
    }
}

