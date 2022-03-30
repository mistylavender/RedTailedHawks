package com.nighthawk.csa.natasha.assignOne;

/**
 * Driver Class
 * Tests queue with string, integers, and mixes of Classes and types
 */
class QueueTester {
    public static void main(String[] args)
    {
        // Create iterable Queue of Words
        String[] words = new String[] { "seven", "slimy", "snakes", "sallying", "slowly", "slithered", "southward"};
        Object[] enqueued = new String[] {"seven", "slimy"};
        // Object[] words = new String[] {};
        QueueManager qWords = new QueueManager("Words");
        for (String w : words) {
            qWords.queue.add(w);
            qWords.printQueue();
        }
        for (int i = 0; i < 7; i++) {
            qWords.queue.delete(qWords.queue);
            qWords.printQueue();
        }

    }
}
