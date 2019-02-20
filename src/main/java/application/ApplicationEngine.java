package application;

import application.states.InitialState;

import java.io.*;


public class ApplicationEngine {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void start() throws IOException {

        System.out.println("\n\nWhats your name detective?");
        String name = br.readLine();
        User user = this.getUser(name);

        Context context = new ContextImpl();

        context.setUser(user);
        context.setState(new InitialState());

        do {
            this.mainLogic(context);
        } while (!context.goToNextSession());

        System.out.println("\n\n   GAME OVER!!!! \n\n");
    }

    private void mainLogic(Context context) throws IOException {
        context.printStateOptions();
        String option = br.readLine();
        context.readOption(option);
    }

    private User getUser(String name) {
        return new User(name);
    }
}

