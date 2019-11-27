package template;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TeaWithHook extends CaffeineBeverageWithHook {
    public void brew() {
        System.out.println("Steep tea bag");
    }

    public void addCondiments() {
        System.out.println("Add lemon");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like lemon with your tea (y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
