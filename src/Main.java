import Transceiver.Transceiver;

import java.io.Console;

public class Main {

    public static void main(String[] args) {

        Transceiver.subscribe("1", new Transceiver.ITransceiver() {
            @Override
            public void action(Object o) {
                System.out.println(o.toString());
            }
        });

        Transceiver.subscribe("2", new Transceiver.ITransceiver() {
            @Override
            public void action(Object o) {
                System.out.println(o.toString());
            }
        });

        new Thread(new Runnable() {
            @Override
                public void run() {
                while (true){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Transceiver.send("1","1");
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Transceiver.send("2","2");
                }

            }
        }).start();

    }
}
