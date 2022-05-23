package com.JavaBasics;


public class ThreadExample implements Runnable{

        public  void run() {
            for (int i = 0; i<5; i++){
                try{
                    Thread.sleep(1000);
                    System.out.println(i +" From " + Thread.currentThread().getName());
                }
                catch (Exception e){
                    e.printStackTrace();
                }

            }
        }

    public static void main(String[] args) throws InterruptedException {
            ThreadExample threadExample = new ThreadExample();
        for (int i = 0; i < 5; i++) {
            Thread thrd = new Thread(threadExample);
            thrd.start();
            thrd.join();
        }
    }
}
