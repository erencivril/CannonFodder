import java.security.SecureRandom;

public class Healer extends Character {
    public Healer(String name){
        super(name);
        SecureRandom randomNumber = new SecureRandom();

        this.setStrength(1 + randomNumber.nextInt(3,7));
        this.setVitality(1 + randomNumber.nextInt(1,5));
        this.setIntelligence(1 + randomNumber.nextInt(6,10));

    }
}
