public class Personagem {
    String nome;
    int nivel;
    int vida;

    public Personagem(String nome, int nivel, int vida){
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    public int atacar(){
        return 1;
    }

    public int defender(){
        return 1;
    }

    public void exibirstatus(){
        System.out.println("Nome: "+nome+"\nNível: "+nivel+"\nVida: "+vida);
    }
}
