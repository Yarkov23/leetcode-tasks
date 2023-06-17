package org.yarkov.task_13;

public class GoalParser {

    public String interpret(String command) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') result.append("G");
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') result.append("o");
            if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') result.append("al");

        }
        return result.toString();
    }

}
