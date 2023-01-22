public class Main {
    public static void main(String[] args) {

        long[] sales = {1, 2, 3, 4, 0};

        SalesManager manager = new SalesManager(sales);

        long max = manager.max();
        long min = manager.min();
        System.out.println("Maximum sale: " + max);
        System.out.println("Minimal sale: " + min);
        long trimmedMean = manager.trimmedMean(sales);
        System.out.println("Trimmed mean: " + trimmedMean);
        long a = manager.max();
        System.out.println("Максимальная сумма: " + a);


    }
}
