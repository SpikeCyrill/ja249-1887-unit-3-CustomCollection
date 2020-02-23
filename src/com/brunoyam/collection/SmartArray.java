package com.brunoyam.collection;

public class SmartArray<T> {

    private T[] myArray = new T[1];
    private Integer size = 0;


    public void add(T value) {
        if(size == myArray.length) { //проверить есть ли еще место
             //если места нет, пересоздать массив
            T[] newArray = new T[myArray.length * 2];

            for(int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i];
            }
            myArray = newArray;
        }

        //добавить новое значение
        myArray[size] = value;
        size++;
    }

    public T get(Integer position) {
        if(position < size) {
            return myArray[position];
        }
        return null;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public Integer size() {
        return size;
    }


}
