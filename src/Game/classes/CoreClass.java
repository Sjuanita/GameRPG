package Game.classes;

public abstract class CoreClass implements BaseClass{
   private String name;
   private int lvl;
   private int maxHP;
   private int maxMP;
   private int HP;
   private int MP;
   private int attackValue;
   private TypeAttack typeAttack;

    public TypeAttack getTypeAttack() {
        return typeAttack;
    }

    public void setTypeAttack(TypeAttack typeAttack) {
        this.typeAttack = typeAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        if (lvl < 0) System.out.println("Уровень не может быть ниже 1");
        else this.lvl = lvl;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getMaxMP(int i) {
        return maxMP;
    }

    public void setMaxMP(int maxMP) {
        this.maxMP = maxMP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        if (this.HP < 0) {
            this.HP = 0;
        } else if (this.HP > this.maxHP) {
            this.HP = this.maxHP;
        } else {
            this.HP = HP;
        }
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        if (this.MP < 0) {
            this.MP = 0;
        } else if (this.MP > this.maxMP) {
            this.MP = this.maxMP;
        } else {
            this.MP = MP;
        }
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    @Override
    public void restoreHP(int value) {
        setHP(this.HP + value);
    }

    @Override
    public void reduceHP(int value) {
        setHP(this.HP - value);
    }

    @Override
    public void restoreMP(int value) {
        setMP(this.MP + value);
    }

    @Override
    public void reduceMP(int value) {
        setMP(this.MP - value);
    }

    @Override
    public void attack() {

    }

    @Override
    public void lvlUP() {

    }

    @Override
    public void info() {
        System.out.println("Name: " + this.name + "\nHP " + this.HP + "\nMP: " + this.MP);
    }
}
