package model.computer;

public interface Music {

    String NAME = "MUSIC";

    void playMusic();
    void pauseMusic();
    void stopMusic();

    default void sayHello() {
        System.out.println("Hello from default Music");
    }

    static String getName(){
        privateMethod();
        return NAME;
    }

    private static void privateMethod(){
        System.out.println("hello from private method");
    }


}
