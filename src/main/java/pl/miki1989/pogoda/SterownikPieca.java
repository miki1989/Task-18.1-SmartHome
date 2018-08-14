package pl.miki1989.pogoda;

import org.springframework.stereotype.Component;

@Component
public class SterownikPieca {
    private StacjaPogodowa stacjaPogodowa;

    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void onOffHeating(){
        if (stacjaPogodowa.randy >= 15){
            System.out.println("Jest ciepło. Nie uruchamiam pieca");
        }
        else {
            System.out.println("Jest zimno. Ogrzejmy się");
        }
    }
}
