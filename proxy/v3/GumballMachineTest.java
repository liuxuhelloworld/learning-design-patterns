package proxy.v3;

import java.rmi.Naming;

public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;

        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            int count = Integer.parseInt(args[1]);

            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind(args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
