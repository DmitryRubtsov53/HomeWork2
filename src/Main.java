public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, наставник!");
        System.out.println("Вот моё решение задач ДЗ2:");
        System.out.println(" ");

        System.out.println("Задача 1. Объявление и инициализация числовых переменных.");
        byte a = 1;
        short b = 12;
        int  c = 123;
        long d = 1234567890L;
        float e = 123.45f;
        double k = 123.45678;
        System.out.println(" ");

        System.out.println("Задача 2. Боксёры.");

    /* Условие задачи:
    Вес одного боксера – 78,2 кг
    Вес второго боксера – 82,7 кг
    Подсчитайте и выведите в консоль общий вес двух бойцов.
    Подсчитайте и выведите в консоль разницу между весами бойцов. */

        float WeitBoxer1 = 78.2f;
        float WeitBoxer2 = 82.7f;
        System.out.println("Общий вес 2-х бойцов " + (WeitBoxer1 + WeitBoxer2) + " кг");
        System.out.println("Разница в весе " + (WeitBoxer2 - WeitBoxer1) + " кг");
        System.out.println(" ");

        System.out.println("Задача 3. Завтрак спортсменов.");
    /* Условие задачи:
       Бананы – 5 штук (1 банан - 80 грамм);
       Молоко – 200 мл (100 мл = 105 грамм);
       Мороженое пломбир – 2 брикета по 100 грамм;
       Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
       Смешать всё в блендере и готово.
       Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
       Результат напечатайте в консоль. */

        //Ингредиенты и их вес в граммах
        int bananes = 5 * 80;
        int milk = 200 / 100 * 105;
        int plombir = 2 * 100;
        int egg = 4 * 70;
        float weitGr = bananes + milk + plombir + egg;
        float weitKg = weitGr / 1000;
        System.out.println("Вес завтрака спортсменов " + weitGr + " гр.");
        System.out.println("Или " + weitKg + " кг.");
        System.out.println(" ");

        System.out.println("Задача 4. Сброс веса спортсменов на 7 кг.");
    /* Условие задачи:
    Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
    Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько,
    если каждый день будет худеть на 500 грамм.
    Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
    Результаты подсчетов выведите в консоль. */
        int weitOut1 = 250;
        int weitOut2 = 500;
        int gool = 7000;
        System.out.println("Если терять 250 гр/день, то ждать " + (gool / weitOut1) + " дней.");
        System.out.println("Если терять 500 гр/день, то ждать " + (gool / weitOut2) + " дней.");
        System.out.println(" ");

        System.out.println("Задача 5. Расчет повышения зарплаты.");
    /* Условие задачи: Маша получает 67 760 рублей в месяц
                       Денис получает 83 690 рублей в месяц
                       Кристина получает 76 230 рублей в месяц
    Каждому нужно увеличить зарплату на 10% от текущей месячной.
    Cколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
    Выведите в консоль информацию по каждому сотруднику. */
        double Masha = 67760 , godMasha = Masha * 12;
        double Denis = 83690 , godDenis = Denis * 12;
        double Kris = 76230 , godKris = Kris * 12;
        double MashaNew = Masha * 1.1 , godMashaNew = MashaNew * 12;
        double DenisNew = Denis * 1.1 , godDenisNew = DenisNew * 12;
        double KrisNew = Kris * 1.1 , godKrisNew = KrisNew * 12;
        System.out.println("Новая зарплата сотрудников после повышения на 10% :");
        System.out.println("Маша  - " + MashaNew + " руб.");
        System.out.println("Денис - " + DenisNew + " руб.");
        System.out.println("Кристина - " + KrisNew + " руб.");
        System.out.println("Разница годовых доходов до и после повышения :");
        System.out.println("Маша  - " + (godMashaNew - godMasha) + " руб.");
        System.out.println("Денис - " + (godDenisNew - godDenis) + " руб.");
        System.out.println("Кристина - " + (godKrisNew - godKris) + " руб.");

    }
}
