package View;

import Controller.ThreadSapo;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            Thread corridaSapo = new ThreadSapo();
            corridaSapo.start();


        }

    }
}
