public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long trimmedMean(long[] sales) {
        long summ = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != max() & sales[i] != min()) {
                summ += sales[i];
            }
        }
        long trimmedMean = summ / (sales.length - 2);
        return trimmedMean;

    }
}