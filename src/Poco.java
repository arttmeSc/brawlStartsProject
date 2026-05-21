public class Poco extends Brawler {
    private int healing;

    public Poco(String rarity, int hp, int range, int walkSpeed, int attackSpeed, int healing, int price) {
            super(rarity, hp, range, walkSpeed, attackSpeed,price);
        this.healing = healing;
    }

    public String[] getPocoInfo() {
        return new String[]{
                "Rarity: " + getRarity(),
                "HP: " + getHp(),
                "Range: " + getRange(),
                "Walk Speed: " + getWalkSpeed(),
                "Attack Speed: " + getAttackSpeed(),
                "Heal a second: " + healing,
                 "Price: " + getPrice()};

    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }
}