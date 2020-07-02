package com.codersbay;

import java.util.*;

public class IntStack {

    List<Integer> stack = new ArrayList<Integer>();

    public void push (Integer newElement) {
        stack.add(newElement);
        System.out.printf("Element '%d' has been added to the Stack.\n", newElement);
    }

    public int size () {
        int stackSize = stack.size();
        System.out.printf("The Stack has %d elements in it.\n", stackSize);
        return stackSize;
    }

    public int pop () throws StackTooSmallException {
        if (stack.size() == 0) {
            throw new StackTooSmallException("Stack is empty.\n");
        } else {
            int lastElement = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            System.out.printf("Element '%d' has been removed from the Stack.\n", lastElement);
            return lastElement;
        }
    }

    public int peek() throws StackTooSmallException {
        if (stack.size() == 0) {
            throw new StackTooSmallException("Stack is empty.\n");
        } else {
            int lastElement = stack.get(stack.size() - 1);
            System.out.printf("The last element in the Stack is '%d'\n", lastElement);
            return lastElement;
        }
    }

    public int[] pop(int numberOfElements) throws StackTooSmallException {
        if(stack.size() == 0) {
            throw new StackTooSmallException("Stack is empty.\n");
        } else {
            int[] elementsToRemove = new int[numberOfElements];
            for (int i = 0; i < numberOfElements; i++) {
                int stackElement = stack.get(stack.size() - 1);
                elementsToRemove[i] = stackElement;
                stack.remove(stack.size() - 1);
                System.out.printf("Element '%d' has been removed from the Stack.\n", stackElement);
            }
            return elementsToRemove;
        }
    }
}
