package observabledesignpattern;

// Subject Observable
public interface NewsPublisher {

    void subscribe(NewsSubscriber subscriber);

    void unsubscribe(NewsSubscriber subscriber);

    void publishNews(String news);

}
