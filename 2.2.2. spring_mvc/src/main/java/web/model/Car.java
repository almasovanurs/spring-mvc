package web.model;

public class Car {

    private int id;

    private String mark;

    private int price;

    public Car() {
    }

    public Car(int id, String mark, int price) {
        this.id = id;
        this.mark = mark;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                '}';
    }
}


