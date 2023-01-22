public class Main {
    public static void main(String[] args) {

        int[] sales = {1, 2, 3, 4, 0};

        SalesManager manager = new SalesManager(sales);
        int max = manager.max();
        int min = manager.min();
        System.out.println("Maximum sale: " + max);
        System.out.println("Minimal sale: " + min);
        int trimmedMean = manager.trimmedMean(sales);
        System.out.println("Trimmed mean: " + trimmedMean);

    }
}
