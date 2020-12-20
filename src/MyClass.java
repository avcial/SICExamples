import java.util.Scanner;

public class MyClass {

    private int x = 6;

    public float y =6;

    public  String z = "bu bir katardır";

    public  void  doSomething(){

    }

    public int getX() {
        return this.x;
    }

    protected void setX(int _x) {
        if (_x < 0){
            return;
//            throw new Exception("Negtaig değer set edilemez");
        }
        this.x = _x;
    }

}
