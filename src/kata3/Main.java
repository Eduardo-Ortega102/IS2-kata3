package kata3;

public class Main {

    public static void main(String[] args) {
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculate(new String[]{"hoola","hoola","hoola","pepe", "adios"});
        HistogramViewer<String> viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
}
