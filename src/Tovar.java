import java.util.Scanner;


public class Tovar {

    int count;
    double price;
    String name;
    String categories;
    Tovar(int count, double price, String name,String categories){


        this.count=count;
        this.price=price;
        this.name=name;
        this.categories=categories;
    }
    //Форма добавления товара
    Tovar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите наименование товара:");
        System.out.print(">_");
        name= scanner.nextLine();
        System.out.println();

        System.out.println("Введите цену товара:");
        System.out.print(">_");
        price= scanner.nextLong();
        System.out.println();

        System.out.println("Введите количество товара:");
        System.out.print(">_");
        count= scanner.nextInt();
        System.out.println();

        System.out.println("Выберите категорию товара:");
        Categories categories=new Categories();
        for (int i=0;i<categories.getCategories().length;i++){
            System.out.println("["+i+"]"+categories.getCategories()[i]);
        }
        System.out.print(">_");
        int v;

        do{
            v=scanner.nextInt();
        }while(v<0&&v>=categories.getCategories().length);
        this.categories=categories.getCategories()[v];


    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }



    public String getCategories() {
        return categories;
    }

    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null||getClass()!=o.getClass()) return false;
        return (name.equals(((Tovar)o).name)&&((Tovar)o).count>0);
    }
    public void sale(){
        count--;
    }

    public void show(){
        System.out.println(name+" "+ price+" $ "+"в категории "+categories+" осталось "+count+" штук");
    }
}
