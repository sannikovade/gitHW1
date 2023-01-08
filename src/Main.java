public class Main {
    public static void main(String[] args) {

        int[] sales = {1, 2, 3, 4, 0};

        SalesManager manager = new SalesManager(sales);
        int a = manager.max();
        System.out.println("Максимальная сумма: " + a);

    }
}
