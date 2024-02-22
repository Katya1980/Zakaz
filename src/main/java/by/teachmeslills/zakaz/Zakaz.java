package by.teachmeslills.zakaz;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement (name = "Zakaz")
public class Zakaz {
    private String nazvanie;
    public int price;

    public Zakaz() {
    }

    @XmlElement
    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }
@XmlElement
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Zakaz{" +
                "nazvanie='" + nazvanie + '\'' +
                ", price=" + price +
                '}';
    }

}
