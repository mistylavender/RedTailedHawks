package com.nighthawk.csa.natasha.assignOne;

/**
 * Driver Class
 * Tests queue with string, integers, and mixes of Classes and types
 */
class StackTester {
    public static void main(String[] args)
    {

        Object[] queuestart = new Integer[] { 1, 2, 3};
        Object[] stackfinal = new Integer[] {};
        QueueManager startq = new QueueManager("Integers", queuestart);

        startq.print();
        Stack finals = new Stack();
        for (int i = 0; i < queuestart.length; i++) {
            finals.push(queuestart[i]);
        }
        System.out.println("\nQueue to Stack: ");
        for (int i = 0; i < queuestart.length; i++) {
            System.out.print(finals.pop() + " ");
        }

    }
}
