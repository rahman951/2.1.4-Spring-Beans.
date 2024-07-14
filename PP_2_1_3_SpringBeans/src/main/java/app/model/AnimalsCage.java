package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Timer timer = new Timer();
    public Timer getTimer() {
        return timer;
    }
   
    
    @Qualifier("dog")
    @Autowired
    private Animal animal;
    
    
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
    
    
}
