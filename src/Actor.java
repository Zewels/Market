// Абстрактный класс, представляющий базового актора, реализующего интерфейс ActorBehaviour
public abstract class Actor implements ActorBehaviour
{
    // Поле, указывающее, взял ли актер заказ
    protected boolean isTakeOrder;

    // Поле, указывающее, выполнил ли актер заказ
    protected boolean isMakeOrder;

    // Имя актера, задается при создании объекта и не может быть изменено
    protected final String name;

    // Конструктор для инициализации имени актера
    public Actor(String name)
    {
        this.name = name;
    }

    // Абстрактный метод для получения имени актера
    // Конкретная реализация предоставляется в подклассах
    public abstract String getName();
}
