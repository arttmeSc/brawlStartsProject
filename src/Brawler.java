public class Brawler {
    private int hp;
    private int range;
    private int walkSpeed;
    private int attackSpeed;
    private int price;
    private String rarity;
    public Brawler(String rarity, int hp, int range, int walkSpeed, int attackSpeed, int price){
        this.rarity = rarity;
        this.hp = hp;
        this.range = range;
        this.walkSpeed = walkSpeed;
        this.attackSpeed = attackSpeed;
        this.price = price;
    }
    public String[] getInfo() {
        return new String[] {
                "Rarity: " + rarity +
                "HP: " + hp +
                "Range: " + range +
                "Walk Speed: " + walkSpeed +
                "Attack Speed: " + attackSpeed
        };
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
