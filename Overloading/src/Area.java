public class Area {
    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5,4));
        System.out.println(area(5,10,15));
    }

    static int area(int x) {return x * x;}
    static int area(int x, int y){
        return x+y;
    }
    static int area(int x, int y, int z){
        return x*y*z;
    }
}
