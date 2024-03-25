import java.security.SecureRandom;

public class Fighter extends Character {

    public Fighter(String name){
        super(name);
        SecureRandom random = new SecureRandom();
        int strength = 1 + random.nextInt(6, 10);
        setStrength(strength);
        int vitality =  1 + random.nextInt(3, 7);
        setVitality(vitality);
        int intelligence = 1 + random.nextInt(1, 5);
        setIntelligence(intelligence);
       }
}
