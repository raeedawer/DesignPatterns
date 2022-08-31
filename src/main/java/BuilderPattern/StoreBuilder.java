package BuilderPattern;

public class StoreBuilder  {
    private int id;
    private String name;
    private String location;
    private String title;

    public int getId() {

        return id;
    }

    public StoreBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public StoreBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public StoreBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public StoreBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

   public Store Build(){


      return new  Store(name,id,location,title);
   }

}
