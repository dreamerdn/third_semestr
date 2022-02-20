package L2;

public class Book {

    //поля
    String name;
    private int price;
    private boolean pictures;
    int str;

    //констрккторы
    Book(String name_,int p,boolean pct,int strng){
        name=name_;
        price=p;
        pictures=pct;
        str=strng;
    }
    Book(String name_,int p, int strng){
        name=name_;
        price=p;
        str=strng;
    }

    //геттеры
    public String getName() {

        return name;
    }

    public int getPrice() {

        return price;
    }

    public boolean  getPictures() {

        return pictures;
    }

    //метод для подсчета общей стоимости книг
    public static int Count(Book[] arr){
        int sum=0;
        for(int i=0;i<3;i++){
            sum+=arr[i].price;
        }
        return sum;
    }

    public static int CountStr(Book[] arr){
        int sum=0;
        int tmp=0;
        for(int i=0;i<3;i++){
            sum+=arr[i].str;
        }
        tmp=sum/3;
        return tmp;
    }

    //метод, для подсчета количества книг с иллюстрациями
    public static int Pctrs (Book[] arr){
        int cnt=0;
        for (int i=0;i<3;i++){
            if (arr[i].pictures == true)
                cnt++;
        }
        return cnt;
    }

    //метод для отображения полей
    public static void show(Book[] arr) {
        for(int i=0;i<3;i++)
        System.out.print((i+1) + ") Name: " + arr[i].getName()+"\nPrise: "+arr[i].getPrice()+"\nPictures: "+arr[i].getPictures()+"\n");
    }

}
