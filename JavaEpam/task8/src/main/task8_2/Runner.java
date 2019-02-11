package main.task8_2;

public class Runner {
    public static Integer value = 0;
    public static boolean flag = false;
    public void run(){
        new Thread(() ->{
            synchronized (Runner.this) {
                for (int i = 0; i < 1000000; i++) {
                    while (Runner.flag) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Runner.value++;
                    Runner.flag = true;
                    notify();
                }
            }
        }).start();

        new Thread(() ->{
            synchronized (Runner.this) {
                for (int i = 0; i < 1000000; i++) {
                    while(!Runner.flag) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Runner.value);
                    Runner.flag = false;
                    notify();

                }
            }
        }).start();
    }
}
