package proxy.remote.v1;

public class GumballMonitorTest {
    public static void main(String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.println("GumballMonitorTest <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);

        GumballMachine machine = new GumballMachine(args[0], count);

        GumballMonitor monitor = new GumballMonitor(machine);

        monitor.report();
    }
}
