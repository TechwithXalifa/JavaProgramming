public class Exercice5{
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("Vous ne devez passer que 3 arguments");
        }
        else{
            int nombre1 = Integer.parseInt(args[0]);
            int nombre2 = Integer.parseInt(args[2]);
            if(args[1].equals("+")){
                System.out.println(args[0]+ " + "+args[2]+" = "+ (nombre1+nombre2));
            }
            if(args[1].equals("-")){
                System.out.println(args[0]+ " - "+args[2]+" = "+ (nombre1-nombre2));
            }
            if(args[1].equals("x")){
                System.out.println(args[0]+ " x "+args[2]+" = "+ (nombre1*nombre2));
            }
            if (args[1].equals("/")) {
                if (nombre2 != 0) {
                    System.out.println(args[0] + " / " + args[2] + " = " + (nombre1 / nombre2));
                } else {
                    System.out.println("Erreur : Division par zéro.");
                }
            }    
        
        }
    }
}