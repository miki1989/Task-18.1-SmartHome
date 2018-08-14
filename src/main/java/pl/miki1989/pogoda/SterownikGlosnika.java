package pl.miki1989.pogoda;

import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika {
    private StacjaPogodowa stacjaPogodowa;

    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void currentWeather(){
        String infoAboutWeather = stacjaPogodowa.weatherDescription();
        System.out.println(infoAboutWeather);
    }
}
