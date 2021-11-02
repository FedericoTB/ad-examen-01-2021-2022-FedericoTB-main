package examen.model;

import java.util.ArrayList;
import java.util.List;

public class RandomGenerator {
    private List<Muestras> muestraRandom;

    public RandomGenerator(){
        this.muestraRandom = new ArrayList<>();
        for(int i=0; i<(Math.random()*20); i++){}
        this.muestraRandom.add(new Muestras(
                "weatheredObserved",
                ""+(Math.random()*100),
                ""+(Math.random()*100),
                ""+(Math.random()*100),
                ""+(Math.random()*100),
                ""+(Math.random()*100),
                ""+(Math.random()*100)
                ));
    }

    public List<Muestras> getMuestraRandom() {
        return muestraRandom;
    }

    public void setMuestraRandom(List<Muestras> muestraRandom) {
        this.muestraRandom = muestraRandom;
    }
}
