package Game;

public class Player2 extends Player1{
    int health;
    boolean armour;
    Player2(String name,String weapon,int health,boolean armour) {
        super(name, weapon, health);
        this.health=health;
        this.armour=armour;
    }

    @java.lang.Override
    public void DamageByGun1() {
        if(armour){
            this.health+=-20;
            if(this.health<=0){
                this.health=0;
            }
            System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 20." +
                    "New health is "+ this.health);
        }
        if(!armour){
            this.health -= 30;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is off. Got hit by gun 1. Health is reduced by 30." +
                    "New health is "+ this.health);
        }
        if(this.health == 0){
            System.out.println(getName() + " is dead");
        }
    }

    @java.lang.Override
    public void DamageByGun2() {
        if(armour){
            this.health+=-30;
            if(this.health<=0){
                this.health=0;
            }
            System.out.println("Armour is on. Got hit by gun 1. Health is reduced by 30." +
                    "New health is "+ this.health);
        }
        if(!armour){
            this.health -= 50;
            if(this.health <=0) this.health = 0;
            System.out.println("Armour is off. Got hit by gun 1. Health is reduced by 50." +
                    "New health is "+ this.health);
        }
        if(this.health == 0){
            System.out.println(getName() + " is dead");
        }
    }

    @java.lang.Override
    public void Heal() {
        super.Heal();
    }

    @java.lang.Override
    public int getHealth() {
        return health;
    }

    @java.lang.Override
    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isArmour() {
        return armour;
    }

    public void setArmour(boolean armour) {
        this.armour = armour;
    }
}
