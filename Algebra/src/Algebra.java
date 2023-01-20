
public class Algebra {

    private int x;
    private int y;
    private String simbol;


    public void setX(int x) {
        this.x = x;
    }

    public void setSimbol(String simbol) {
        this.simbol=simbol;
    }

    public void setY(int y) {
        this.y = y;
        System.out.println("Selectati una din operatia, +,-,*,/");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
