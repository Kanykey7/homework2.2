public class xiaomi extends telephone implements Printable{
    private int age;

    public xiaomi(int age) {
        this.age = age;

    }

    @Override
    public void print() {
        System.out.println("xiaomi" + age) ;
    }
}
