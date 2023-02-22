public class Main {
    public static void main(String[] args) {
        // а - итоговый счет на телефоне
        // b - количество бонусных рублей
        // c - сумма пополнения в рублях
        // d - начальное количество рублей на момент оплаты

        int a;
        int b;
        int c = 1600;
        int d = 300;

        if (c >= 1000) {
            b = (c / 100);
            a = (b + c + d);
        } else {
            b = 0;
            a = (c + d);
        }
        System.out.println((b) + "руб. Бонусных рублей");
        System.out.println((a) + "руб. Денежных средств на вашем телефоне");
    }


}
