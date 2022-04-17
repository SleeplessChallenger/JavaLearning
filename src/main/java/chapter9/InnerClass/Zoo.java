package chapter9.InnerClass;

public class Zoo {

    public static void main(String... unused) {
        var z = new Zoo();
        var t = z.sellTicket("1454");
        System.out.println(t.getId()+ " Ticket sold!");
    }

    private interface Paper {
        public String getId();
    }

    public class Ticket implements Paper {
        private String serialNumber;
        public String getId() {
            return serialNumber;
        }
    }

    public Ticket sellTicket(String serialNumber) {
        var t = new Ticket();
        t.serialNumber = serialNumber;
        return t;
    }

}
