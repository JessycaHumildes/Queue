package com.jhumildes;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Employee JessycaHumildes = new Employee("Jessyca", "Humildes", 35454);
        Employee JakeYoung = new Employee("Jake","Young", 6453);
        Employee BiaLinda = new Employee("Bia", "Linda", 3745);
        Employee DoraLicia = new Employee("Dora","Licia", 6574);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(JessycaHumildes);
        queue.add(JakeYoung);
        queue.add(BiaLinda);
        queue.add(DoraLicia);
        //queue.printQueue();

        queue.remove();
        //queue.printQueue();

        System.out.println(queue.peek());
        queue.printQueue();
    }
}
