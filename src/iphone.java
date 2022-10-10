public class iphone extends telephone implements Printable{
    private String battery;

    public iphone(String battery) {
        this.battery = battery;
    }

    @Override
    public void print() {
        System.out.println("iphone" + battery);
    }
}
