package com.nighthawk.csa.natasha.assignOne;

/**
 * Driver Class
 * Tests queue with string, integers, and mixes of Classes and types
 */
class MergeQueueTester {
    public static void main(String[] args)
    {
        // Create iterable Queue of Integers
        Object[] queue1 = new Integer[] { 1, 4, 5, 8};
        Object[] queue2 = new Integer[] { 2, 3, 6, 7};
        Object[] numbers = new Integer[] {};
        // Start with two ordered Queue's
//        (1st Queue) 1 -> 4 -> 5 -> 8 -> nil
//            (2nd Queue) 2 -> 3 -> 6 -> 7 -> nil
        QueueManager qNums1 = new QueueManager("Integers", queue1);
        QueueManager qNums2 = new QueueManager("Integers", queue2);
        QueueManager qNumsFinal = new QueueManager("Integers");
        qNums1.displayQueue();
        qNums2.displayQueue();


        while (qNums1.queue.count != 0 && qNums2.queue.count != 0) {
            int num1 = (int)qNums1.queue.peek(qNums1.queue);
            int num2 = (int)qNums2.queue.peek(qNums2.queue);
            if (num1 < num2) {
                qNumsFinal.queue.add(num1);
                qNums1.queue.delete(qNums1.queue);
            } else {
                qNumsFinal.queue.add(num2);
                qNums2.queue.delete(qNums2.queue);
            }
        }

        while (qNums1.queue.count != 0) {
            int num1 = (int)qNums1.queue.peek(qNums1.queue);
                qNumsFinal.queue.add(num1);
                qNums1.queue.delete(qNums1.queue);
        }

        while (qNums2.queue.count != 0) {
            int num2 = (int)qNums2.queue.peek(qNums2.queue);
                qNumsFinal.queue.add(num2);
                qNums2.queue.delete(qNums2.queue);

        }

        qNumsFinal.displayQueue();

    }
}
