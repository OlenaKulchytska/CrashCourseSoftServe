package task7;

public class NonFlyingBird extends Bird{

    @Override
    public boolean fly() {
        System.out.println("Can't fly");
        return false;

    }
}
