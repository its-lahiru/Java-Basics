package com.lahiru.training.javabasics.datastructures.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStructure {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Jack");
        queue.add("Mark");
        queue.offer("Paul");
        queue.offer("Chris");
        queue.offer("Peter");

        while (queue.peek() != null){
            System.out.println(queue.poll());
        }

    }

}
