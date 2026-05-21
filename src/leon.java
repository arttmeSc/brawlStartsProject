public class leon extends Brawler {
    private int timeInvisibility;
public leon (String rarity, int hp, int range, int walkSpeed, int attackSpeed, int timeInvisibility, int price){
    super(rarity ,hp,range,walkSpeed,attackSpeed,price);
    this.timeInvisibility = timeInvisibility;
}
    public String[] getLeonInfo() {
        return new String[] {
                "Rarity: " + getRarity(),
                "HP: " + getHp(),
                "Range: " + getRange(),
                "Walk Speed: " + getWalkSpeed(),
                "Attack Speed: " + getAttackSpeed(),
                "Invisibility: " + timeInvisibility,
                "Price: " + getPrice()
        };
    }

    public int getTimeInvisibility() {
        return timeInvisibility;
    }

    public void setTimeInvisibility(int timeInvisibility) {
        this.timeInvisibility = timeInvisibility;
    }
}
