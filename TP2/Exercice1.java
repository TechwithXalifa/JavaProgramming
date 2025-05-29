// package TP2;
public class Exercice1{
    public static void main(String[] args)
    {
        double a = Integer.parseInt(args[0]);
        double b = Integer.parseInt(args[1]);
        double c = Integer.parseInt(args[2]);
        double delta = (Math.pow(b,2) - 4*a*c);
        double x0 = -b/(2*a);
        double x1 = (-b - Math.sqrt(delta))/(2*a);
        double x2 = (-b + Math.sqrt(delta))/(2*a);
        if((a == 0 && b == 0) || (a != 0 && delta == 0)){
            System.out.println("L'équation n'admet pas de solution");
        }
        if ((a == 0 && b != 0) || (a != 0 && b == 0)) {
            System.out.println("L'équation admet une solution x0 = "+x0);
        }
        if(a != 0 && delta > 0){
            System.out.println("L'équation admet deux solutions x1 = "+x1+" et x2 = "+x2);
        }
    }
}