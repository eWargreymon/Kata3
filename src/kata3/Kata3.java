package kata3;

public class Kata3 {

    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram();
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("yahoo.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
}
