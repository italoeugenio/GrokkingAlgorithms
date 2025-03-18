package main.DataStructure.Stack;

import java.util.Stack;

public class Stacks {
    //Implement

    public static void main(String[] args) {
        //Using Class from collections
        Stack<String> stack = new Stack<>();

        stack.push("item 1");
        stack.push("item 2");
        stack.push("item 3");

        System.out.println(stack.isEmpty());
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

    }
}
