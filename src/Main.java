public class Main {
    public static void main(String[] args) {
        Printable [] printable = {createObject("samsung"),createObject
                ("xiaomi"), createObject("iphone")};
        for(Printable print: printable){
            print.print();
        }
    }


    public static Printable createObject(String className) {
        switch (className) {
            case "samsung":
                return new samsung(": A50");
            case "xiaomi":
                return new xiaomi(32);
            case "iphone":
                return new iphone(": 26");

        }

        return null;

    }
}