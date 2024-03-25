import java.security.SecureRandom;

public class Enemy extends Character {

    private boolean stunned;


    public Enemy(String name){
        super(name);
        SecureRandom random = new SecureRandom();
        int strength = 1 + random.nextInt(1, 5);
        setStrength(strength);
        int vitality =  1 + random.nextInt(1, 5);
        setVitality(vitality);
        int intelligence = 1 + random.nextInt(1, 5);
        setIntelligence(intelligence);

        this.stunned = false;
    }


}
