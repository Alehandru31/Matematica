import java.util.Scanner;

public class SelectionMetod {
    private String nume;
    final String ALGEBRA ="Algebra";
    final String GEOMETRIE="Geometrie";

    Scanner scanner=new Scanner(System.in);
    Algebra algebra=new Algebra();


    public void Compare(){
        nume=scanner.nextLine();
        while(!(nume.equals(ALGEBRA)) || !(nume.equals(GEOMETRIE)))
        {
        if(nume.equals(ALGEBRA)){
            System.out.println("Sa selectat: "+nume+"!\n"+"Introduceti variabila x, y");
           int nambar=scanner.nextInt();
            algebra.setX(nambar);
            nambar=scanner.nextInt();
            algebra.setY(nambar);
            Simbol();

        } else if (nume.equals(GEOMETRIE)) {
            System.out.println("Sa selectat: "+nume+"!\n"+"Introduceti variabila x, y");
        }else {
            System.out.println("Nu sa selectat nimic sau sa selectat un cuvint incorect.");
            System.out.println("Selectati Algebra sau Geometrie:");
            nume=scanner.nextLine();
        }
        }
    }
   private void Simbol(){
       nume=scanner.nextLine();
       while (nume.isEmpty()){
           nume=scanner.nextLine();
       }
       while (nume.isEmpty())
       {
               switch (nume){
                   case "+":
                       algebra.setSimbol(nume);
                       break;
                   case "-":
                       algebra.setSimbol(nume);
                       break;
                   case "*": algebra.setSimbol(nume);
                       break;
                   case "/":
                       algebra.setSimbol(nume);
                       break;
                   default:
                       System.out.println("Ati introdus o operatie gresita"+nume+" !");
               }
           }

       }
   }
