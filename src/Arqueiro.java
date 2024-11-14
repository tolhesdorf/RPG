class Arqueiro extends Personagem{
    int agilidade;

    public Arqueiro(String nome, int nivel, int vida, int agilidade) {
        super(nome, nivel, vida);
        this.agilidade = agilidade;
    }
    @Override
    public int atacar(){
        return nivel*agilidade;
    }

    @Override
    public int defender(){
        return nivel*agilidade;
    }

    @Override
    public void exibirstatus(){
        System.out.println("Mago(a): "+nome+"\nNível: "+nivel+"\nAgilidade: "+agilidade+"\nVida: "+vida);
    }
}
