class Guerreiro extends Personagem {
    int forca;

    public Guerreiro(String nome, int nivel, int vida, int forca) {
        super(nome, nivel, vida);
        this.forca = forca;
    }

    @Override
    public int atacar(){
        return nivel*forca;
    }

    @Override
    public int defender(){
        return nivel*forca;
    }

    @Override
    public void exibirstatus(){
        System.out.println("Guerreiro(a): "+nome+"\nNível: "+nivel+"\nForça: "+forca+"\nVida: "+vida);
    }
}
