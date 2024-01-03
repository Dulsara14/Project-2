public class Server {

    static int plus (int x,int y){

        return x+y;

    }

    static int plus (int x,int y,int z){

        return x+y+z;

    }
}

class Test{
    public static void main(String[] args) {

        Server s = new Server();

        System.out.println(s.plus(80,100));
        System.out.println(s.plus( 30,654,2349));
    }
}
