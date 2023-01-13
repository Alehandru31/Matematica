import java.util.Scanner;

public class SelectionMetod {
    private String tip_matem;
    private String operatie = "";

    final String ALGEBRA = "Algebra";
    final String GEOMETRIE = "Geometrie";

    Scanner scanner = new Scanner(System.in);
    Algebra algebra = new Algebra();


    public void Compare() {
        tip_matem = scanner.nextLine();
        while (!(tip_matem.equals(ALGEBRA)) || !(tip_matem.equals(GEOMETRIE))) {
            if (tip_matem.equals(ALGEBRA)) {
                System.out.println("Sa selectat: " + tip_matem + "!\n" + "Introduceti variabila x, y");
                int nambar = Integer.parseInt(scanner.nextLine());
                algebra.setX(nambar);
                nambar = Integer.parseInt(scanner.nextLine());
                algebra.setY(nambar);


                simbol();
                System.out.println(algebra.toString());

            } else if (tip_matem.equals(GEOMETRIE)) {
                System.out.println("Sa selectat: " + tip_matem + "!\n" + "Introduceti variabila x, y");
            } else {
                System.out.println("Nu sa selectat nimic sau sa selectat un cuvint incorect.");
                System.out.println("Selectati Algebra sau Geometrie:");
                // simbol();
                tip_matem = scanner.nextLine();
            }
        }
    }

    private void simbol() {
        //Algebraoperatie = scanner.nextLine();
        System.out.println(operatie);
        while (operatie.isEmpty()) {
            operatie = scanner.nextLine();

            switch (operatie) {
                case "+":
                    algebra.setSimbol(operatie);
                    break;
                case "-":
                    algebra.setSimbol(operatie);
                    break;
                case "*":
                    algebra.setSimbol(operatie);
                    break;
                case "/":
                    algebra.setSimbol(operatie);
                    break;
                default:
                    System.out.println("Ati introdus o operatie gresita" + operatie + " !");
            }
            System.out.println("Ati introdus o operatie" + operatie + " !");

        }
    }
}
