class CCalculator{
    int a;
    int b;
    int c;
    void set_value(int x,int y,int z){
        x = a;
        y = b;
        z = c;        
    }
    void show() {
        System.out.println(a + "," + b + "," + c);
    }
    int add() {
        return a + b + c;
    } 
    int sub() {
        return a - b - c;
    }
    int mul() {
        return a * b * c;
    }
    double avg() {
        double d = (a + b + c);
        return d / 3;
    }
}
public class class09 {
    public static void main(String[] args) {
        CCalculator test = new CCalculator();
        int x = 25;int y = 3;int z = 7;
        test.a = x;test.b = y;test.c = z;
        test.set_value(x,y,z);
        test.show();
        System.out.println(test.add()); 
        System.out.println(test.sub()); 
        System.out.println(test.mul());
        System.out.println(test.avg());
    }
}