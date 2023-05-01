package padroesestruturais.adapter;

public class Jogador {

    IEstatistica avaliacao;
    AdapterHeadShot adapterheadshot;

    public Jogador() {
        avaliacao = new DesempenhoHeadShot();
        adapterheadshot = new AdapterHeadShot(avaliacao);
    }

    public void setAvaliacao(String headshot) {
        avaliacao.setEstatistica(headshot);
        adapterheadshot.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return adapterheadshot.recuperarAvaliacao();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getResultado() {
        return adapterheadshot.getResultado();
    }

}
