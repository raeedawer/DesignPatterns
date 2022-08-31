package BuilderPattern;

public class StoreBuilder  {
    private int id;
    private String name;
    private String location;
    private String title;

    public int getId() {

        return id;
    }

    public StoreBuilder id(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StoreBuilder name(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public StoreBuilder location(String location) {
        this.location = location;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public StoreBuilder title(String title) {
        this.title = title;
        return this;
    }

   public Store build(){


      return new  Store(name,id,location,title);
   }

}
