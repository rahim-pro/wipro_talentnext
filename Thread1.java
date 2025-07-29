public class Thread1{
    public static void main(String[] args) {
        Thread scoobyThread = new Thread(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        });
        scoobyThread.setName("Scooby");
        Thread shaggyThread = new Thread(() -> {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        });
        shaggyThread.setName("Shaggy");
        scoobyThread.start();
        shaggyThread.start();
    }
}