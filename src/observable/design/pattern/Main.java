package observable.design.pattern;

public class Main {
    public static void main(String[] args) {

        MediaHouse houseOne = new MediaHouse();

        MediaHouse houseTwo = new MediaHouse();

        NewsSubscriber subscriberOne = new Reader("Vishal");

        NewsSubscriber subscriberTwo = new Reader("Akash");

        NewsSubscriber subscriberThree = new Reader("Pulkit");

        houseOne.subscribe(subscriberOne);

        houseOne.subscribe(subscriberTwo);

        houseTwo.subscribe(subscriberThree);

        houseOne.publishNews("Publishing news from house one");

        houseTwo.publishNews("Publishing news from house Two");

        houseOne.unsubscribe(subscriberTwo);

        houseOne.publishNews("Publishing news from house one after unsubscribing");
    }
}