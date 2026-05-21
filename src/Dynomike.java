public class Dynomike extends Brawler {
private boolean walkOnWater;
        public Dynomike(String rarity, int hp, int range, int walkSpeed, int attackSpeed, boolean walkOnWater,int price) {
            super(rarity, hp, range, walkSpeed, attackSpeed,price);
            this.walkOnWater = walkOnWater;
        }

        public String[] getDynoInfo() {
            return new String[]{
                    "Rarity: " + getRarity(),
                    "HP: " + getHp(),
                    "Range: " + getRange(),
                    "Walk Speed: " + getWalkSpeed(),
                    "Attack Speed: " + getAttackSpeed(),
                    "Is he walking on water: " + walkOnWater,
            "Price: " + getPrice()};

        }

    public boolean isWalkOnWater() {
        return walkOnWater;
    }

    public void setWalkOnWater(boolean walkOnWater) {
        this.walkOnWater = walkOnWater;
    }
}
