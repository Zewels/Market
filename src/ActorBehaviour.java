// Интерфейс, определяющий поведение актера
public interface ActorBehaviour
{
    // Метод для установки статуса выполнения заказа
    void setMakeOrder(boolean makeOrder);

    // Метод для установки статуса принятия заказа
    void setTakeOrder(boolean takeOrder);

    // Метод для проверки, выполнен ли заказ
    boolean isMakeOrder();

    // Метод для проверки, принят ли заказ
    boolean isTakeOrder();
}
