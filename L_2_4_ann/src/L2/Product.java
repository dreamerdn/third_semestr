package L2;

public class Product {
        //поля
        String name;
        private int price;
        private boolean availability;

        //констрккторы
        Product(String name_,int p,boolean av){
        name=name_;
        price=p;
        availability=av;
        }
        Product(String name_,int p){
            name=name_;
            price=p;
        }

        //геттеры
        public String getName() {

            return name;
        }

        public int getPrice() {

            return price;
        }

        public boolean  getAvailability() {

            return availability;
        }

        //метод для подсчета общей стоимости продуктов
        public static int Count(Product[] arr){
            int sum=0;
            for(int i=0;i<3;i++){
                sum+=arr[i].price;
            }
            return sum;
        }

        //метод, для подсчета количества продуктов в наличии
        public static int Avl (Product[] arr){
            int cnt=0;
            for (int i=0;i<3;i++){
                if (arr[i].availability == true)
                    cnt++;
            }
            return cnt;
        }

        //метод для отображения полей
        public static void show(Product[] arr) {
            for(int i=0;i<3;i++)
                System.out.print((i+1) + ") Name: " + arr[i].getName()+"\nPrise: "+arr[i].getPrice()+"\n:Availability "+arr[i].getAvailability()+"\n");
        }

    }


