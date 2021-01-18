import java.util.Arrays;

public class AdvancedBook {
    private String name;
    private Author[] author;
    private double price;
    private int qty = 0;

    public AdvancedBook(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public AdvancedBook(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String getAuthorNames(){
        StringBuffer stringBuffer = new StringBuffer();

        for(int i = 0; i < author.length; i++){
            stringBuffer.append(author[i].getName());
            if(i != author.length - 1)
                stringBuffer.append(", ");
        }

        return stringBuffer.toString();
    }

    @Override
    public String toString() {
        return "AdvancedBook{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
