public class samsung extends telephone implements Printable{
    private String model;

    public samsung(String model) {
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("samsung" + model);
    }
}
