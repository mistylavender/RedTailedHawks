package com.nighthawk.csa.natasha.assignOne;

/**
 * Queue Manager
 * 1. "has a" Queue
 * 2. support management of Queue tasks (aka: titling, adding a list, printing)
 */
class QueueManager<T> {
    // queue data
    private final String name; // name of queue
    private int count = 0; // number of objects in queue
    public final Queue<T> queue = new Queue<>(); // queue object

    /**
     *  Queue constructor
     *  Title with empty queue
     */
    public QueueManager(String name) {
        this.name = name;
    }

    /**
     *  Queue constructor
     *  Title with series of Arrays of Objects
     */
    public QueueManager(String name, T[]... seriesOfObjects) {
        this.name = name;
        this.addList(seriesOfObjects);
    }

    /**
     * Add a list of objects to queue
     */
    public void addList(T[]... seriesOfObjects) {
        for (T[] objects: seriesOfObjects)
            for (T data : objects) {
                this.queue.add(data);
                this.count++;
            }
    }

    /**
     * Print any array objects from queue
     */
    public void printQueue() {
        System.out.print(this.name + " count: " + queue.count + ", ");
        System.out.print(this.name + " data: ");
        if (queue.count == 0){
            System.out.print("null");
        }
        for (T data : queue)
            System.out.print(data + " ");
        System.out.println();
    }

    public void displayQueue() {
        System.out.println();
        for (T data : queue)
            System.out.print(data + " -> ");
        System.out.print("nil");
    }

    public void print() {
        System.out.println("Original Queue: ");
        for (T data : queue)
            System.out.print(data + " ");
    }
}
