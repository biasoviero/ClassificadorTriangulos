import java.util.ArrayList;
import java.util.Scanner;

public class classificaTriangulo {
    public static ArrayList<Integer> leInputs(){
        Scanner in = new Scanner(System.in);
        int a, b, c;
        ArrayList<Integer> inputs = new ArrayList<Integer>();

        System.out.print("Digite o valor do lado A: ");
        a = in.nextInt();
        inputs.add(a);

        System.out.print("Digite o valor do lado B: ");
        b = in.nextInt();
        inputs.add(b);

        System.out.print("Digite o valor do lado C: ");
        c = in.nextInt();
        inputs.add(c);

        in.close();    
        
        return inputs;
    }

    public static boolean ehEquilatero(ArrayList<Integer> lados){

        if(lados.get(0) == lados.get(1) && lados.get(1) == lados.get(2)){
            return true;
        }
        return false;
    }

    public static boolean ehIsosceles(ArrayList<Integer> lados){
        if(lados.get(0) == lados.get(1) || lados.get(1) == lados.get(2) || lados.get(0) == lados.get(2)){
            return true;
        }
        return false;
    }

    public static boolean ehEscaleno(ArrayList<Integer> lados){
        if(lados.get(0) != lados.get(1) && lados.get(1) != lados.get(2) && lados.get(0) != lados.get(2)){
            return true;
        }
        return false;
    }

    public static boolean ehTriangulo(ArrayList<Integer> lados){
        if(lados.get(0) + lados.get(1) > lados.get(2) && lados.get(1) + lados.get(2) > lados.get(0) && lados.get(0) + lados.get(2) > lados.get(1)){
            if (ehEquilatero(lados)){
                System.out.println("O triângulo é equilátero.");
            }
            else if(ehIsosceles(lados)){
                System.out.println("O triângulo é isósceles.");
            }
            else if(ehEscaleno(lados)){
                System.out.println("O triângulo é escaleno.");
            }
            return true;
        }
        System.out.println("Não é triângulo.");
        return false;
    }
}
