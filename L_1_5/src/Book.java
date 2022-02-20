public class Book {
        //поля
        String name;
        private int price;
        private String pictures;

        //сеттреы
        public void setName(String name) {

            this.name = name;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public void setPictures(String pictures) {
            this.pictures = pictures;
        }

        //геттеры
        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public String  getPictures() {
            return pictures;
        }
    }

    class Demo{
        public static void main(String[] args){
            //создание объектов
            Book b1 = new Book();
            Book b2 = new Book();

            //заполнение полей объектов с помощью сеттеров
            b1.setName("Cinderella");
            b1.setPrice(30);
            b1.setPictures("yes");
            b2.setName("Faust");
            b2.setPrice(20);
            b2.setPictures("no");

            //вывод значений объектов с помощью геттеров
            System.out.println("1.");
            System.out.println("Name of the book: "+b1.getName());
            System.out.println("Book price: "+b1.getPrice());
            System.out.println("There are pictures in the book: "+b1.getPictures());
            System.out.println("2.");
            System.out.println("Name of the book: "+b2.getName()+"\nBook price: "+b2.getPrice()+"\nThere are pictures in the book: "+b2.getPictures());
        }
    }

