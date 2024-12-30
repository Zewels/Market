import java.util.List;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        Actor actor1 = new Human("Иван");
        Actor actor2 = new Human("Мария");

        market.acceptToMarket(actor1);
        market.acceptToMarket(actor2);

        market.update(); // Выполняет обновление магазина (выполнение, выдача заказов, очистка очереди)
        market.releaseFromMarket(List.of(actor1, actor2));
    }
}
