package pl.miki1989.pogoda;

import org.springframework.stereotype.Component;

@Component
public class SterownikRolet {
    private StacjaPogodowa stacjaPogodowa;


    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void closeBlinds(){
        if(stacjaPogodowa.check == 0){
            System.out.println("Jest słonecznie. Zasłaniam rolety");
        }
        else {
            System.out.println("Brak słońca. Otwieram rolety");
        }
    }
}
