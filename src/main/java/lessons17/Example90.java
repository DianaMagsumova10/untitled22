package lessons17;

public class Example90 {
    public static void main(String[] args) {
        final SingletonMy instance = SingletonMy.INSTANCE;
        SingletonLazy instance1 = SingletonLazy.getInstance();
        EnumSingleton enunSingleton = EnumSingleton.ENUN_SINGLETON;

    }
}

class SingletonMy {
    public static final SingletonMy INSTANCE = new SingletonMy();

    private SingletonMy() {
    }

    public void method() {
        System.out.println("do something");
    }
}
class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }


    public static SingletonLazy getInstance(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;

    }

    public void method() {
        System.out.println("do something");
    }
}
enum EnumSingleton{
    ENUN_SINGLETON;
    public void method() {
        System.out.println("do something");
    }
}