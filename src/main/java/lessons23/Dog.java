package lessons23;

public class Dog {
    String name;
    boolean isCollarPutOn;
    boolean isLeashPutOn;
    boolean isMuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }
    public void putCollar(){
        System.out.println("Ошейник надет");
        this.isCollarPutOn = true;
    }

    public void putLeash(){
        System.out.println("Ошейник надет");
        this.isLeashPutOn = true;
    }

    public void putMuzzle(){
        System.out.println("Намордник надет!");
        this.isMuzzlePutOn = true;
    }



    public void walk() throws DogIsNotReadyException{
        if (isMuzzlePutOn&& isLeashPutOn && isCollarPutOn){
            System.out.println("Ура, идем гулять! " + name + " очень рад!");
        }else {
            throw  new DogIsNotReadyException("Собака " + name + " не готова к прогулке! Проверьте экипировку!");
        }
    }
}
