package kata3.control;

import kata3.model.HistogramBuilder;
import kata3.persistence.MailReader;
import kata3.ui.HistogramViewer;

public class CalculateMailDomainHistogramControl {
    private String filename;

    public CalculateMailDomainHistogramControl(String filename) {
        this.filename = filename;
    }
    
    public void execute(){
        HistogramBuilder<String> builder = new HistogramBuilder<>();
        builder.calculate(MailReader.readDomains(filename));
        HistogramViewer<String> viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
    
}
