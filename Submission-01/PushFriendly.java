/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa_submission;


import java.util.LinkedList;
import java.util.Queue;

public class PushFriendly {
      private Queue<Integer> queue = new LinkedList<>();

    public void push(int value) {
        queue.add(value);
    }

    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }

        return queue.remove();
    }

    public int peek() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.remove());
        }

        int top = queue.peek();
        queue.add(queue.remove());

        return top;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
    
    public static void main(String[] args) {
         PushFriendly  stack = new PushFriendly();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());
    }
    
}
