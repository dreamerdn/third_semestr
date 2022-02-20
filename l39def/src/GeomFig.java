 public class GeomFig { //создание суперкласса
        protected int x,y;
        float square;
        public GeomFig(int x1,int y1){
            x=x1;
            y=y1;
        }
        public GeomFig(){
            x=5;
            y=5;
        }
        public int GetDatax(){
            return x;
        }
        public int GetDatay(){
            return y;
        }
        public float FindSquare () { // метод расчета площади, который будет //переопределяться в подклассах
            square=x*y;
            return square;
        }
    }

    public class Triangle extends GeomFig { //класс Triangle наследует класс GeomFig
        private int a,b,c;
        String type;
        public Triangle (int x, int y,int a, int b, int c, String type) {
            super(x,y); //вызов конструктора с параметрами из суперкласса
            this.a=a;
            this.b=b;
            this.c=c;
            this.type=type;
        }
        public Triangle (int x, int y) {
            super(x,y);// вызов конструктора с параметрами из суперкласса
            a=3;
            b=5;
            c=5;
            type="isosceles";
        }
        public Triangle () {
            super();//вызов конструктора без параметров из суперкласса
            a=7;
            b=7;
            c=7;
            type="equilateral";
        }
        public int GetDataa(){
            return a;
        }
        public int GetDatab(){
            return b;
        }
        public int GetDatac(){
            return c;
        }
        public String Gettype(){
            return type;
        }
        public float FindSquare (){ //переопределение метода расчета площади
            square=(float) Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));
            return square;
        }
    }

    public class Rectangle extends GeomFig{ // класс Rectangle наследует класс GeomFig
        private int width, height;
        public Rectangle(int x, int y, int w, int h) {
            super(x,y); //вызов конструктора с параметрами из суперкласса
            width=w;
            height=h;
        }
        public Rectangle (int x, int y, int w){
            super(x,y);// вызов конструктора с параметрами из суперкласса
            width=w;
            height=8;
        }
        public Rectangle() {
            super();//вызов конструктора без параметров из суперкласса
            width=7;
            height=6;
        }
        public int GetDatawidth(){
            return width;
        }
        public int GetDataheight(){
            return height;
        }
        public float FindSquare (){
            square=width*height;
            return square;
        }


    }

    public class Circle extends GeomFig {
        int rad;
        public Circle(int x, int y, int r){
            super(x,y);// вызов конструктора с параметрами из суперкласса
            rad=r;
        }
        public Circle(int x, int y){
            super(x,y);// вызов конструктора с параметрами из суперкласса
            rad=3;
        }
        public Circle(){
            super();//вызов конструктора без параметров из суперкласса
            rad=2;
        }

        public int GetDataRad(){
            return rad;
        }
        public float FindSquare () { //переопределение метода расчета площади
            square=(float) (3.14*rad*rad);
            return square;
        }

    }
    public class WriterInfo { // класс для вывода информации о классах на экран
        public static void main(String[] args) {
            Rectangle rect1= new Rectangle(1,2,3,4);
            System.out.println("Rectangle 1 - Center:("+rect1.GetDatax()+", "+rect1.GetDatay()+") Weidth:"+rect1.GetDatawidth()+" Height:"+rect1.GetDataheight()+" Square:"+rect1.FindSquare()+"; ");
            Rectangle rect2=new Rectangle(7,6,5);
            System.out.println("Rectangle 2 - Center:("+rect2.GetDatax()+", "+rect2.GetDatay()+") Weidth:"+rect2.GetDatawidth()+" Height:"+rect2.GetDataheight()+" Square:"+rect2.FindSquare()+"; ");
            Rectangle rect3=new Rectangle();
            System.out.println("Rectangle 3 - Center:("+rect3.GetDatax()+", "+rect3.GetDatay()+") Weidth:"+rect3.GetDatawidth()+" Height:"+rect3.GetDataheight()+" Square:"+rect3.FindSquare()+"; ");
            Circle circ1=new Circle(2,2,4);
            System.out.println("Circle 1 - Center:("+circ1.GetDatax()+", "+circ1.GetDatay()+") Radius:"+circ1.GetDataRad()+" Square:"+circ1.FindSquare()+"; ");
            Circle circ2=new Circle(4,1);
            System.out.println("Circle 2 - Center:("+circ2.GetDatax()+", "+circ2.GetDatay()+") Radius:"+circ2.GetDataRad()+" Square:"+circ2.FindSquare()+"; ");
            Circle circ3=new Circle();
            System.out.println("Circle 3 - Center:("+circ3.GetDatax()+", "+circ3.GetDatay()+") Radius:"+circ3.GetDataRad()+" Square:"+circ3.FindSquare()+"; ");
            Triangle trin1=new Triangle (4,5,6,7,8,"scalene");
            System.out.println("Triangle 1 - Center:("+trin1.GetDatax()+", "+trin1.GetDatay()+") Side 1:"+trin1.GetDataa()+" Side 2:"+trin1.GetDatab()+" Side 3:"+trin1.GetDatac()+" Type:"+trin1.Gettype()+" Square:"+trin1.FindSquare()+"; ");
            Triangle trin2=new Triangle(15,6);
            System.out.println("Triangle 2 - Center:("+trin2.GetDatax()+", "+trin2.GetDatay()+") Side 1:"+trin2.GetDataa()+" Side 2:"+trin2.GetDatab()+" Side 3:"+trin2.GetDatac()+" Type:"+trin2.Gettype()+" Square:"+trin2.FindSquare()+"; ");
            Triangle trin3=new Triangle();
            System.out.println("Triangle 3 - Center:("+trin3.GetDatax()+", "+trin3.GetDatay()+") Side 1:"+trin3.GetDataa()+" Side 2:"+trin3.GetDatab()+" Side 3:"+trin3.GetDatac()+" Type:"+trin3.Gettype()+" Square:"+trin3.FindSquare()+"; ");
        }
    }

}
