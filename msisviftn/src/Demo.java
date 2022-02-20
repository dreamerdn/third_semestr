import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Искусственно внесенные ошибки: ");
        float S=in.nextInt();
        System.out.print("Внесенные ошибки (рассеяные): ");
        float v=in.nextInt();
        System.out.print("Исходных ошибок: ");
        float n=in.nextInt();
        System.out.print("Исходных собственных ошибок: ");
        float K=in.nextInt();
        if(S==0|n==0|v==0| n==0 | K==0){
            System.out.println("Вы ввели 0");
            return;}
        float N=(S*n)/v;
        System.out.println("Первоначальное число ошибок в системе: " + N);
        if (n>K){
            int C=1;
            System.out.println("Оценка доверия при модели Миллса = "+ C);
        }
        if (n<=K){
            float C=S/(S+K+1);
            System.out.println("Оценка доверия при модели Миллса = "+ C);
        }
    }

}
