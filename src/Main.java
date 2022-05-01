public class Main {
    public static void main(String[] args) {

    int amount = 1600;    // стоимость билета
    int rub = 20;    // рублей для одной бонусной милли
    int mili = amount/rub;  // Рассчёт количества бонусных милль
        System.out.println("Спасибо за покупку. Вам начисленно");
        System.out.println((mili) + " миль");
    }
}