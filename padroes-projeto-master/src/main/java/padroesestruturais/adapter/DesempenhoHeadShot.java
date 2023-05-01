package padroesestruturais.adapter;

public class DesempenhoHeadShot implements IEstatistica {

    private String headshot;

    @Override
    public String getEstatistica() {
        return this.headshot;
    }

    @Override
    public void setEstatistica(String headshot) {
        this.headshot = headshot;
    }
}
