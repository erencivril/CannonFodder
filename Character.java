import java.util.ArrayList;

public abstract class Character {
    private String name;
    private int strength;
    private int vitality;
    private int intelligence;
    private double HP;
    private double maxHP;
    private Item equippedWeapon;
    private Item equippedArmor;

    ArrayList<Item> inventory = new ArrayList<Item>(); //Inventory holds items


    public Character(String name) {
        this.name = name;
    }


    //Set methods
    public void setStrength(int strength) {
        this.strength = strength;
        calculateHP();
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
        calculateHP();
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        calculateHP();
    }

    public void calculateHP() {
        maxHP = Math.round(0.7 * vitality + 0.2 * strength + 0.1 * intelligence);
    }

    public void setEquippedWeapon(Item equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public void setEquippedArmor(Item equippedArmor) {
        this.equippedArmor = equippedArmor;
    }

    //Get methods
    public int getStrength() {
        return strength;
    }

    public int getVitality() {
        return vitality;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public double getHP() {
        return HP;
    }

    public Item getEquippedWeapon() {
        return equippedWeapon;
    }

    public Item getEquippedArmor() {
        return equippedArmor;
    }

    public void attack(Character target) {

    }

    public void specialAction(Character target) {

    }

    public void pick(Item item) {

    }

    public void wield(Item item) {

    }

    public void wear(Item item) {

    }

    public void examine(Item item) {

    }

    public void listInventory() {

    }

}
