import java.awt.*;

public class DemonThread {

    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (;;){
                toolkit.beep();
                try {
                    Thread.sleep(500);
                }catch (/*Interrupted*/Exception e){
                    e.printStackTrace();
                }
            }
        });

        thread.setDaemon(true); //이부분이 없으면 비프음은 종료되지 않는다.
        /*
         * 왜?? 종료되지 않는가
         * thread.start()만 실행하는 경우 t는 데몬 스레드가 아닌 일반 쓰레드이다
         * thread는 for(;;)의 무한루프를 가지고 있고 break를 할 수 있는 어떤 장치도 없다.
         * 그러나 thread를 데몬 쓰레드로 지정해주면, main 메서드가 종료될 때 같이 종료된다.
         * 데몬쓰레드가 더이상 도와줄 쓰레드가 없기때문
         */

        thread.start();
        /*
         * thread를 시작하고 thread는 현재 데몬 쓰레드이므로 아래 for문 5번을 돌면
         * main 메소드가 종료되므로 thread역시 같이 종료된다
         */


        for (int i = 0; i < 5; i++) {
            System.out.println("비프음!");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

