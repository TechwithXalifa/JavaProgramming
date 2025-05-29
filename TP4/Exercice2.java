public class Exercice2 {
    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();

        int resultatAddition = calculatrice.addition(5, 3);
        int resultatSoustraction = calculatrice.soustraction(10, 2);
        double resultatMultiplication = calculatrice.multiplication(4, 2.5);
        double resultatDivision = calculatrice.division(8, 2);

        System.out.println("Addition : " + resultatAddition);
        System.out.println("Soustraction : " + resultatSoustraction);
        System.out.println("Multiplication : " + resultatMultiplication);
        System.out.println("Division : " + resultatDivision);
    }
}

class Calculatrice {
    public int addition(int nombre1, int nombre2) {
        return nombre1 + nombre2; 
    }

    public int soustraction(int nombre1, int nombre2) {
        return nombre1 - nombre2;
    }

    public double multiplication(double nombre1, double nombre2) {
        return nombre1 * nombre2;
    }

    public double division(int nombre1, int nombre2) {
        if (nombre2 == 0) {
            System.out.println("Erreur : Division par zéro !");
            return Double.NaN;
        }
        return (double) nombre1 / nombre2;
    }
}
