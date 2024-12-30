import java.util.List;

// Интерфейс, определяющий поведение рынка
public interface MarketBehaviour {

    // Метод для принятия актера на рынок
    void acceptToMarket(Actor actor);

    // Метод для освобождения группы актеров с рынка
    void releaseFromMarket(List<Actor> actorList);

    // Метод для обновления состояния рынка
    void update();
}
