package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class  AnimalsCage {


    public Timer getTimer() {
        return timer;
    }

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}
