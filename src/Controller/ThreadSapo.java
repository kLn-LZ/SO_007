package Controller;

public class ThreadSapo extends Thread {

        int posicao = 1;

        public ThreadSapo(){
            super();
        }

        public void run() {
            corridaSapo();
        }

        private void corridaSapo() {

            int finalCorrida = 1000;
            int distancia = 0;
            int pulo;

            while (distancia < finalCorrida) {

                pulo = (int) (Math.random() * 1000);

                System.out.println("O Sapo #" + getId() + " pulou " + pulo + " Metros");

                distancia = pulo + distancia;

            }

            System.out.println("O Sapo de número #" + getId() + " Chegou");


        }



}
