import java.security.SecureRandom;

public class Tank extends Character{
    public Tank(String name){
        super(name);
        SecureRandom randomNumber = new SecureRandom();

        setStrength(1 + randomNumber.nextInt(6,10));
        setVitality(1 + randomNumber.nextInt(3,7));
        setIntelligence(1 + randomNumber.nextInt(1,5));
    }

}
