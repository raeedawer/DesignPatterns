package BuilderPattern;

public class Main {
    public static void main(String[] args) {

        Store store = Store.Builder().id(99).location("USA").name("nokia").title("Nokia Inc").build();
        System.out.println(store);

    }
}
