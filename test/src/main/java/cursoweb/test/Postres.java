package cursoweb.test;

//import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@AllArgsConstructor

public class Postres {
    @Getter @Setter
    private String id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String price;
    @Getter @Setter
    private String image;
    @Getter @Setter
    private String description;


    public Postres(String id, String name, String price, String image, String description){
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.description = description;
    }

}

