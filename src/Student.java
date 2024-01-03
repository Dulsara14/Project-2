public class Student {

    static void studentID(String name,int ID){

        System.out.println("Name " +name +" ID "+ID);

    }
    static void studentID(int ID,String name){

        System.out.println("Name " +name +" ID "+ID);
    }
}

class Test1{
    public static void main(String[] args) {
        Student.studentID("Dulsara",27059);
        Student.studentID(12345,"Gawesh");
    }

}
