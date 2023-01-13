
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
    public double getResult(){
        double result=0;
        if(!simbol.equals("+")){
           result=x+y;
        } else if (!simbol.equals("-")) {
            result=x-y;
        } else if (!simbol.equals("*")) {
            result=x*y;
        }else if (!simbol.equals("/")) {
            result=x/y;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Algebra{" +
                "x=" + x +
                ", y=" + y +
                ", simbol='" + simbol + '\'' +
                '}';
    }
}
