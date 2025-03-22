package tic.tac.toe;

import java.util.Stack;

public class Main {

    public static String StringChallenge(String str) {
        Stack<String> stack = new Stack<>();
        StringBuilder tagName = new StringBuilder();
        boolean isTag = false;
        boolean isClosing = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '<') {
                isTag = true;
                tagName.setLength(0); // Reset tag name
                isClosing = false;
            } else if (ch == '>') {
                isTag = false;
                String tag = tagName.toString();

                if (!tag.isEmpty()) {
                    if (tag.charAt(0) == '/') { // Closing tag
                        String closingTag = tag.substring(1);
                        if (stack.isEmpty() || !stack.peek().equals(closingTag)) {
                            return closingTag; // First mismatched closing tag
                        }
                        stack.pop();
                    } else { // Opening tag
                        stack.push(tag);
                    }
                }
            } else if (isTag) {
                if (ch == '/') {
                    isClosing = true;
                }
                tagName.append(ch);
            }
        }

        return stack.isEmpty() ? str : stack.peek();
    }


    public static void main(String[] args){

        System.out.println(StringChallenge("<div><b><p><hello world></p></b></div>")); // Correctly nested

//        TicTacToe ticTacToe  = new TicTacToe();
//        ticTacToe.gameInitialize();
//        ticTacToe.startGame();
//        System.out.println("Game winner is ");
    }
}
