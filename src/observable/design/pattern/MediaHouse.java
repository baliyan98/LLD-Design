package observable.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class MediaHouse implements NewsPublisher{

    private List<NewsSubscriber>  subscribers = new ArrayList<>();
    private String latestNews;
    @Override
    public void subscribe(NewsSubscriber subscriber){
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(NewsSubscriber subscriber){
        subscribers.remove(subscriber);
    }

//    @Override
    public void publishNews(String news) {
        subscribers.forEach(subscriber -> subscriber.update(news));
//        this.latestNews = news;
//        notifyAllSubscriber();
    }

    private void notifyAllSubscriber(){
        subscribers.forEach(subscriber -> subscriber.update(latestNews));
    }
}
