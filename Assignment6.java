/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
 
/**
 * @author AnkitMittal
 * Copyright (c) JavaMadeSoEasy.com , AnkitMittal .
 * All Contents are copyrighted and must not be reproduced in any form.
 * This class provides custom implementation of ArrayList(without using java api's)
 * Insertion order of objects is maintained.
 * Implementation allows you to store null as well.
 * @param <E>
 */
class ArrayListCustom<E> {
 
    // Define INITIAL_CAPACITY, size of elements of custom ArrayList
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};
 
    /**
     *
     * constructor of custom ArrayList
     */
    public ArrayListCustom() {
           elementData = new Object[INITIAL_CAPACITY];
    }
 
    /**
     * add elements in custom/your own ArrayList
     * Method adds elements in ArrayListCustom.
     */
    public void add(E e) {
           if (size == elementData.length) {
                  ensureCapacity(); // increase current capacity of list, make it
                                                    // double.
           }
           elementData[size++] = e;
    }
 
    /**
     * method returns element on specific index.
     */
    @SuppressWarnings("unchecked")
    public E get(int index) {
           // if index is negative or greater than size of size, we throw
           // Exception.
           if (index < 0 || index >= size) {
                  throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                               + index);
           }
           return (E) elementData[index]; // return value on index.
    }
 
    /**
     * remove elements from custom/your own ArrayList method returns
     *
     * removedElement on specific index. else it throws IndexOutOfBoundException
     * if index is negative or greater than size of size.
     */
    public Object remove(int index) {
           // if index is negative or greater than size of size, we throw
           // Exception.
        if (index < 0 || index >= size) {
                  throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                               + index);
           }
 
           Object removedElement = elementData[index];
           for (int i = index; i < size - 1; i++) {
                  elementData[i] = elementData[i + 1];
           }
           size--; // reduce size of ArrayListCustom after removal of element.
 
           return removedElement;
    }
 
    /**
     * Ensure capacity of custom/your own ArrayList.
     *
     * Method increases capacity of list by making it double.
     */
    private void ensureCapacity() {
           int newIncreasedCapacity = elementData.length * 2;
           elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }
 
    /**
     * Display custom/your own ArrayList.
     *
     * Method displays all the elements in list.
     */
    public void display() {
           System.out.print("Displaying list : ");
           for (int i = 0; i < size; i++) {
                  System.out.print(elementData[i] + " ");
           }
    }
 
}
 
/**
 * Main class to test ArrayListCustom functionality.
 */
public class Main {
     
    public static void main(String... a) {
           ArrayListCustom<Integer> list = new ArrayListCustom<Integer>();
           System.out.println("Enter minimum of 10 integers for initialisation of list");
           System.out.println("\nEnter number of integers:");
           Scanner sc=new Scanner(System.in);
           int num=sc.nextInt();
           for(int t=0;t<num;t++)
           {
               list.add(sc.nextInt());
           }
           
           //Display custom ArrayList
           list.display();
           
           System.out.println("Enter index to find element:");
           int ind1=sc.nextInt();
           System.out.println("\nelement at index in custom ArrayList > " + ind1 + " = " + list.get(ind1));
           
           System.out.println("\nEnter element to insert into list:");
           int ele=sc.nextInt();
           list.add(ele);
           System.out.println("\nlet's display custom ArrayList again after removal at index 1");
           list.display();
           
           System.out.println("\nenter index to remove element:");
           int ind=sc.nextInt();
           System.out.println("\nelement removed from index " + ind + " = "
                        + list.remove(ind));
           System.out.println("\nlet's display custom ArrayList again after removal at index 1");
 
           list.display();
    }
     
}
