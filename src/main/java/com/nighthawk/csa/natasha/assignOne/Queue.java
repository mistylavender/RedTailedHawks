package com.nighthawk.csa.natasha.assignOne;

/*
import com.nighthawk.csa.mvc.DataOps.genericDataModel.Alphabet;
import com.nighthawk.csa.mvc.DataOps.genericDataModel.Animal;
import com.nighthawk.csa.mvc.DataOps.genericDataModel.Cupcakes;
 */
import java.util.Iterator;

/**
 * Queue: custom implementation
 * @author     John Mortensen
 *
 * 1. Uses custom LinkedList of Generic type T
 * 2. Implements Iterable
 * 3. "has a" LinkedList for head and tail
 */
public class Queue<T> implements Iterable<T> {
    LinkedList<T> head, tail;
    int count = 0;

    /**
     *  Add a new object at the end of the Queue,
     *
     * @param  data,  is the data to be inserted in the Queue.
     */
    public void add(T data) {
        System.out.println("Enqueued data: " + data);
        // add new object to end of Queue
        LinkedList<T> tail = new LinkedList<>(data, null);

        if (head == null)  // initial condition
            this.head = this.tail = tail;
        else {  // nodes in queue
            this.tail.setNextNode(tail); // current tail points to new tail
            this.tail = tail;  // update tail
        }
        count++;

    }

    public void delete(Queue queue){

        this.head = queue.getHead();

        // If queue is empty, return NULL.
        if (this.head == null)
            return;

        // Store previous front and move front one node ahead
        LinkedList<T> temp = this.head;
        System.out.println("Dequeued data: " + temp.getData());
        this.head = this.head.getNext();

        // If front becomes NULL, then change rear also as NULL
        if (this.head == null)
            this.tail = null;

        count--;
    }

    public T peek(Queue queue){
        return (T) queue.head.getData();
    }


    /**
     *  Returns the head object.
     *
     * @return  this.head, the head object in Queue.
     */
    public LinkedList<T> getHead() {
        return this.head;
    }

    /**
     *  Returns the tail object.
     *
     * @return  this.tail, the last object in Queue
     */
    public LinkedList<T> getTail() {
        return this.tail;
    }

    /**
     *  Returns the iterator object.
     *
     * @return  this, instance of object
     */
    public Iterator<T> iterator() {
        return new QueueIterator<>(this);
    }
}





