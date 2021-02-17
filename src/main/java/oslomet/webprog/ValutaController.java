package oslomet.webprog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;


@RestController
public class ValutaController {

    //Oppretter array:
    private ArrayList<Valuta> valutaRegister = new ArrayList<>();

    //Legger til objektet i arrayet:
    @GetMapping("/lagreArray")
    public void lagArray(Valuta innValuta) {
        //Valuta valuta = new Valuta(valutaSort, valutaKurs);
        valutaRegister.add(innValuta);
    }

    //
    @GetMapping("/")
    public String returBelop(String innSort, String innBelop) {
        System.err.print(valutaRegister);
        for (Valuta valuta : valutaRegister) {
            if (valuta.getValutasort().equals(innSort)) {
                return (Double.parseDouble(innBelop) * valuta.getValutakurs() + "" + valuta.getValutasort());
            }
        }
        return "Feil";
    }
}