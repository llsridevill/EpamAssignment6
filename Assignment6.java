import java.util.*;

class ArrayListCustom<E> {
 
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};
 
    public ArrayListCustom() {
           elementData = new Object[INITIAL_CAPACITY];
    }
 
 
    public void add(E e) {
           if (size == elementData.length) {
                  ensureCapacity(); 
           }
           elementData[size++] = e;
    }
 
    @SuppressWarnings("unchecked")
    public E get(int index) {
          
           if (index < 0 || index >= size) {
                  throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                               + index);
           }
           return (E) elementData[index]; 
	   }
 

    public Object remove(int index) {
           
        if (index < 0 || index >= size) {
                  throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                               + index);
           }
 
           Object removedElement = elementData[index];
           for (int i = index; i < size - 1; i++) {
                  elementData[i] = elementData[i + 1];
           }
           size--;
 
           return removedElement;
    }

    private void ensureCapacity() {
           int newIncreasedCapacity = elementData.length * 2;
           elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }
 

    public void display() {
           System.out.print("Displaying list : ");
           for (int i = 0; i < size; i++) {
                  System.out.print(elementData[i] + " ");
           }
    }
 
}

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
