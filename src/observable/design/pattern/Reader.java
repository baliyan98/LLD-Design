package observable.design.pattern;

public class Reader implements NewsSubscriber {

    private String name;

    public Reader(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " Received news " + news);
    }
}
