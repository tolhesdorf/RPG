class Mago extends Personagem {
    int poderMagico;

    public Mago(String nome, int nivel, int vida, int poderMagico) {
        super(nome, nivel, vida);
        this.poderMagico = poderMagico;
    }

    @Override
    public int atacar(){
        return nivel*poderMagico;
    }

    @Override
    public int defender(){
        return nivel*poderMagico;
    }

    @Override
    public void exibirstatus(){
        System.out.println("Mago(a): "+nome+"\nNível: "+nivel+"\nPoder Mágico: "+poderMagico+"\nVida: "+vida);
    }
}
