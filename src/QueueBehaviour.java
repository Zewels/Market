public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void makeOrders();
    void giveOrders();
    void releaseFromQueue();
}
