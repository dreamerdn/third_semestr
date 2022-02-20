public class Product {
    //поля
    String name;
    private int price;
    private String availability;

    //сеттреы
    public void setName(String name) {

        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    //геттеры
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String  getAvailability() {
        return availability;
    }
}

class Demo{
    public static void main(String[] args){
        //создание объектов
        Product p1 = new Product();
        Product p2 = new Product();

        //заполнение полей объектов с помощью сеттеров
        p1.setName("Car");
        p1.setPrice(15000);
        p1.setAvailability("yes");
        p2.setName("Tires");
        p2.setPrice(200);
        p2.setAvailability("no");

        //вывод значений объектов с помощью геттеров
        System.out.println("1.");
        System.out.println("The product's name: "+p1.getName());
        System.out.println("Product price: "+p1.getPrice());
        System.out.println("Availability in store: "+p1.getAvailability());
        System.out.println("2.");
        System.out.println("The product's name: "+p2.getName()+"\nProduct price: "+p2.getPrice()+"\nAvailability in store: "+p2.getAvailability());
    }
}
