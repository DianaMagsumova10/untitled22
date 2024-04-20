package lessons23;

public class Main {
    public static void main(String[] args)  {
        Dog sam = new Dog("Sam");
        sam.putCollar();
        sam.putLeash();
//        sam.putMuzzle();
        try {
            sam.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем снаряжение! Ошейник надет? " + sam.isCollarPutOn + "\r\n Поводок надет? " + sam.isLeashPutOn +
                    "\r\n Намордник надет? " + sam.isMuzzlePutOn);
        }
    }
}
