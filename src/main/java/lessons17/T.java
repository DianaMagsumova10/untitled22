package lessons17;

public class T {
    protected String f = "Moi";
    public void method(){
        System.out.println("T");
    }
}
class Q extends T{
    @Override
    public void method() {
        System.out.println("Q");
    }
}
