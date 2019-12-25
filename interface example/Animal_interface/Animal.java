public interface Animal {

    public void Walk();
    public void Fly();
    public void Eat();

    public default void Print() {
        Walk();
        Fly();
        Eat();
    }


}
