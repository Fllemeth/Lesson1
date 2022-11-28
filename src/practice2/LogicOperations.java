package practice2;

public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        x+=y>>x++*z;
        z = ++x&y*5;
        y/=x+5|z;
        z = x++&y*5;
        x = y<<x++^z;
        System.out.println(x +" "+ y +" "+ z);
    }
}
