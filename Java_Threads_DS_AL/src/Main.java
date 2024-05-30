import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public Main(){
    System.out.println("empty");
    }
    public Main(String abc){
    System.out.println(abc);
    }
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c=Class.forName("Main");
        Main main=(Main) c.newInstance();  //create object using newInstance

        Constructor c1=Main.class.getConstructor();
        Main mainC1=(Main)c1.newInstance();
        Constructor c2=Main.class.getConstructor(String.class);
        Main mainc2=(Main)c2.newInstance("Hello Bala");
        main.abc();
        Main m=new Main();
        m.abc();

        /*int coreCount= Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount);
        ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
        for(int i=0; i<100; i++){
            executorService.execute(new CpuIntensiveTask());
        }
        executorService.shutdown();*/

    }
    void abc(){
        System.out.println("a");
    }
    static class  CpuIntensiveTask implements  Runnable{

        public void run(){
            System.out.println("run method"+new Thread().getName());
        }
    }
}
