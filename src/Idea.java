public class Idea {

    static void quote (int x,int y){

        System.out.println("I think "+ x +" plus "+y + " = "+ (x+y));

    }

    static void quote (String x){

        System.out.println("I Think "+ x +" is best investment");

    }

    public static void main(String[] args) {

        quote(100,150);
        quote("EDUCATION");

    }
}
