package Lab_session3;

public class Controller {
    public static void main(String[] args) {
        SubThread a1 = new SubThread();

        Thread thread = new Thread(a1);
        thread.start();
    }