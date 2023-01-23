
public class Algebra {

    private int x;
    private int y;
    private String simbol;


    public void setX(int x) {
        try {
            this.x = x;
        }catch (NumberFormatException e){
            System.out.println("Sa introdus un alt caracter inafara de cifra: "+e);
        }
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
