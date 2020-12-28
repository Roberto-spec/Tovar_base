public class Korzina {
    Tovar[] tovars;
    double sum;
    Korzina(){
        tovars=null;
        sum=0;
    }
    public void add(Tovar b){
        Tovar[] a=new Tovar[tovars.length+1];
        for(int i=0;i<tovars.length;i++){
            a[i]=tovars[i];
            sum+=a[i].getPrice();
        }
        a[tovars.length]=b;

    }
    public double get_sum(){

        return sum;
    }
    public void push(){
        tovars=null;
        sum=0;
    }
    public void show(){
        System.out.println("Корзина");
        for(int i=0;i<tovars.length;i++){

            System.out.println(tovars[i].getName()+" "+ tovars[i].getPrice()+" $ "+"в категории "+tovars[i].getCategories()+" 1 штуxrf");

        }
        System.out.println("На сумму:" +sum);
    }


}
