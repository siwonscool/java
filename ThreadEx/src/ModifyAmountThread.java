public class ModifyAmountThread extends Thread{
    private CommonCalculate cal;
    private boolean addFlag;

    public ModifyAmountThread(CommonCalculate cal, boolean addFlag){
        this.cal=cal;
        this.addFlag=addFlag;
    }

    public void run(){
        for (int i = 0; i < 10000; i++) {
            if (addFlag){
                cal.plus(1);
            }else {
                cal.minus(1);
            }
        }

    }
}
