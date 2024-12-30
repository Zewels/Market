import java.util.ArrayList;
import java.util.List;

// Класс Market реализует два интерфейса: MarketBehaviour и QueueBehaviour
public class Market implements MarketBehaviour, QueueBehaviour {

    // Очередь для хранения актеров
    private List<Actor> queue;

    // Конструктор для инициализации списка очереди
    public Market() {
        this.queue = new ArrayList<>();
    }

    // Метод добавления актера на рынок
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " вошел(а) в магазин.");
        takeInQueue(actor); // Добавляем актера в очередь
    }

    // Метод удаления группы актеров с рынка
    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList) {
            System.out.println(actor.getName() + " покинул(а) магазин.");
        }
    }

    // Метод обновления состояния магазина
    @Override
    public void update() {
        System.out.println("Обновление состояния магазина...");
        makeOrders(); // Выполняем заказы
        giveOrders(); // Выдаем заказы
        releaseFromQueue(); // Освобождаем очередь
    }

    // Метод добавления актера в очередь
    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " добавлен(а) в очередь.");
    }

    // Метод выполнения заказов (имитация)
    @Override
    public void makeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true); // Устанавливаем, что заказ выполнен
                System.out.println(actor.getName() + " заказ выполнен.");
            }
        }
    }

    // Метод выдачи заказов (имитация)
    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && !actor.isTakeOrder()) {
                actor.setTakeOrder(true); // Устанавливаем, что заказ выдан
                System.out.println(actor.getName() + " получил(а) заказ.");
            }
        }
    }

    // Метод освобождения очереди (удаление актеров, получивших заказы)
    @Override
    public void releaseFromQueue() {
        List<Actor> actorsToRemove = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                actorsToRemove.add(actor); // Добавляем актера для удаления
                System.out.println(actor.getName() + " покидает очередь.");
            }
        }
        queue.removeAll(actorsToRemove); // Удаляем всех актеров, которые получили заказы
    }
}
