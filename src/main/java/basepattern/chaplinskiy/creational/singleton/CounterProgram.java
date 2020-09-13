package basepattern.chaplinskiy.creational.singleton;

public class CounterProgram {
   private static CounterProgram counterProgram;

   private Long counter = 0L;

   public static synchronized CounterProgram getCounterProgram(){
       if (counterProgram == null){
           counterProgram = new CounterProgram();
       }
       return counterProgram;
   }

   private CounterProgram(){};

   public void addCounter(){
       counter += 1;
   }

   public void showCounter(){
       System.out.println(counter);
   }
}
