package proxy.remote.v2;

import java.rmi.Naming;

public class GumballMonitorTest {
    public static void main(String[] args) {
        String location = "rmi://127.0.0.1/santafe.mightygumball.com/gumballmachine";

        GumballMonitor monitor;
        try {
            GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location);
            monitor = new GumballMonitor(machine);
            monitor.report();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
