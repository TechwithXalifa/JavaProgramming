public class Exercice4{
    public static void main(String[] args){
        int factoriel = 1;
        if(args.length != 1){
            System.out.println("Vous devez uniquement passer 1 argument en paramètre");
        }
        else{
            for(int i = 1; i <= Integer.parseInt(args[0]); i++)
            {
                factoriel = factoriel*i;
            }
        }
        System.out.println("La factorielle de "+args[0]+ " est : "+factoriel);
    }
}