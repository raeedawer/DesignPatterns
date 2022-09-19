package home.BuilderPattern;

public class Store {
  int id;
  String name,location ,title;

  @Override
  public String toString() {
    return "Store{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", location='" + location + '\'' +
            ", title='" + title + '\'' +
            '}';
  }

  public Store(String name, int id, String location, String title) {

    this.id=id;
    this.name=name;
    this.title=title;
    this.location=location;
  }


  public static StoreBuilder Builder(){


    return new StoreBuilder();
  }
}
