package lessons19;

public class ResourceA implements AutoCloseable{

    public void run(int n){
        if (n%2 ==0){
            throw new RuntimeException();
        }else {
            System.out.println("OK");
        }
    }
    @Override
    public void close() throws Exception {
        System.out.println("Close recourse");
    }
}
