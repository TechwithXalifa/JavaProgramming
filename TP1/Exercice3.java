public class Exercice3{
    public static void main(String[] args){
        System.out.println("Le nombre d'éléments entrés en argument est : "+ args.length);
        System.out.println("La liste des arguments est : ");
        for(int i=0; i<args.length; i++){
            System.out.println("Argument n°"+(i+1)+" : "+args[i]);
        }
    }    
}