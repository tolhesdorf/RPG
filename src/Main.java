public class Main {
    public static void main(String[] args) {
        Personagem [] personagens = new Personagem[3];

        personagens[0] = new Guerreiro ("Guts",23,230,40);
        personagens[1] = new Mago("Beatrice",33,30,75);
        personagens[2] = new Arqueiro("Lagolas",15,20,25);

        for(Personagem p : personagens){
            p.exibirstatus();
            System.out.println("Ataque: "+p.atacar());
            System.out.println("Defesa: "+p.defender());
            System.out.println();
        }
    }
}