package Day12;

public interface Vehicle extends Engine {
    void start();
    void stop();
    //optional
    default void e20(){

    }
}
interface Engine {
    int engineType=10;
    void power();
}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car started");
    }
    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    public void e20(){
        System.out.println("E20 supported car");
    }

    @Override
    public void power() {

    }
}