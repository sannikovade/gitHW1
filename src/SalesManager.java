public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int trimmedMean(int[] sales) {
        int summ = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] != max() & sales[i] != min()) {
                summ += sales[i];
            }
        }
        int trimmedMean = summ / (sales.length - 2);
        return trimmedMean;

    }
}