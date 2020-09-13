package basepattern.suleymanov.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("first log .....");
        ProgramLogger.getProgramLogger().addLogInfo("second log .....");
        ProgramLogger.getProgramLogger().addLogInfo("third log .....");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
