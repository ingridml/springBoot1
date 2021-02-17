package oslomet.webprog;

public class ValutaOverforing {
    private String valutasort;
    private String valutabelop;

    public ValutaOverforing(String valutasort, String valutabelop){
        this.valutasort = valutasort;
        this.valutabelop = valutabelop;
    }

    public ValutaOverforing(){
    }

    public String getValutasort(){
        return valutasort;
    }

    public void setValutasort(String valutasort){
        this.valutasort = valutasort;
    }

    public String getValutabelop(){
        return valutabelop;
    }

    public void setValutabelop(String valutabelop){
        this.valutabelop = valutabelop;
    }
}
