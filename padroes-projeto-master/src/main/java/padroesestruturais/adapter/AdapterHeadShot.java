package padroesestruturais.adapter;

public class AdapterHeadShot extends ResultadoHeadShot {

    private IEstatistica avaliacaoDesempenho;

    public AdapterHeadShot(IEstatistica avaliacaoDesempenho) {
        this.avaliacaoDesempenho = avaliacaoDesempenho;
    }

    public String recuperarAvaliacao() {
        if (this.getResultado() >= 100.0f)
            avaliacaoDesempenho.setEstatistica("Pro");
        else
            if (this.getResultado() >= 80.0f)
                avaliacaoDesempenho.setEstatistica("Bom");
            else
                if (this.getResultado() >= 50.0f)
                    avaliacaoDesempenho.setEstatistica("Mediano");
                else
                    avaliacaoDesempenho.setEstatistica("Ruim");

        return avaliacaoDesempenho.getEstatistica();
    }


    public void salvarAvaliacao() {
        if (avaliacaoDesempenho.getEstatistica().equals("Pro"))
            this.setResultado(100.0f);
        else
            if (avaliacaoDesempenho.getEstatistica().equals("Bom"))
                this.setResultado(80.0f);
            else
                if (avaliacaoDesempenho.getEstatistica().equals("Mediano"))
                    this.setResultado(50.0f);
                else
                    this.setResultado(0.0f);
    }
}
