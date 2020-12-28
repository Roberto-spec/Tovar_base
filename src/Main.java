import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Tovar> catalog = new ArrayList<>();
        Korzina korzina=new Korzina();
        int d=0;
        String s=new String();
        do {
            Tovar p = new Tovar();
            catalog.add(p);
            System.out.println("Добавить еще товара?");
            System.out.println("[1] Да");
            System.out.println("[2] Нет");
            System.out.print(">_");
            d= scanner.nextInt();
            System.out.println();
        }while(d!=2);


        do {
            System.out.println("Menu");
            System.out.println("[1] Посмотреть корзину");
            System.out.println("[2] Найти товар");
            System.out.println("[3] Выход");
            System.out.print(">_");
            d = scanner.nextInt();
            if(d==2){
                System.out.println("Введите имя");
                System.out.print(">_");
                s=scanner.nextLine();
                if(catalog.contains(new Tovar(0, 0, s,null))){
                    int index=catalog.indexOf(new Tovar(0, 0, s,null));
                    korzina.add(catalog.get(index));

                    catalog.get(index).sale();
                    catalog.get(index).show();
                }
                else{
                    System.out.println("NO MATCH!");
                }
            }
            if (d==1){
                korzina.show();
                System.out.println("Оплатить?");
                System.out.println("[1] Да");
                System.out.println("[2] Нет");
                System.out.print(">_");
                int a=scanner.nextInt();
                if(a==1){
                    korzina.push();
                }
            }
        }while(d!=3);
    }

}