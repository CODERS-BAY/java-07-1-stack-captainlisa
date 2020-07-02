package com.codersbay;

public class Main {

    public static void main(String[] args) throws StackTooSmallException {

        IntStack theStack = new IntStack();

        theStack.push(111);
        theStack.push(485);
        theStack.size();
        theStack.push(465);
        theStack.push(58);
        theStack.push(76);
        theStack.push(9899);
        theStack.push(234);
        theStack.push(642);
        theStack.size();
        theStack.peek();
        theStack.pop();
        theStack.pop(2);
        theStack.size();
        theStack.peek();
    }
    
}
