public class RunSync {
    public static void main(String[] args) {
        RunSync r = new RunSync();
        for (int i = 0; i < 10; i++) {
            r.runCommonCalculate();
        }
    }

    public void runCommonCalculate(){
        CommonCalculate cal = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(cal,true);
        ModifyAmountThread thread2 = new ModifyAmountThread(cal,false);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
            System.out.println("Final value == " + cal.getAmount());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
