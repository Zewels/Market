// Интерфейс, определяющий поведение очереди
public interface QueueBehaviour {

    // Метод для добавления актера в очередь
    void takeInQueue(Actor actor);

    // Метод для выполнения заказов в очереди
    void makeOrders();

    // Метод для выдачи заказов актерам
    void giveOrders();

    // Метод для удаления актера из очереди
    void releaseFromQueue();
}
