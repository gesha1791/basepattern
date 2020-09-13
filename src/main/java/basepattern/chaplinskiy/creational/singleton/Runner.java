package basepattern.chaplinskiy.creational.singleton;

public class Runner {
    public static void main(String[] args) {
        CounterProgram counterProgram = CounterProgram.getCounterProgram();
        CounterProgram counterProgram2 = CounterProgram.getCounterProgram();
        CounterProgram counterProgram3 = CounterProgram.getCounterProgram();

        System.out.println(counterProgram);
        System.out.println(counterProgram2);
        System.out.println(counterProgram3);

        counterProgram.addCounter();
        counterProgram2.addCounter();
        counterProgram3.addCounter();

        counterProgram.showCounter();
        counterProgram2.showCounter();
        counterProgram3.showCounter();
    }
}
