package kata3.main;

import kata3.control.CalculateMailDomainHistogramControl;

public class Main {

    public static void main(String[] args) {
        CalculateMailDomainHistogramControl control = new CalculateMailDomainHistogramControl(args[0]);
        control.execute();
    }
}
