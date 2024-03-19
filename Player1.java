package Game;

public class Player1 {
    private String name;
    private String weapon;
    private int health;
    Player1(String name,String weapon,int health){
        this.name=name;
        this.weapon=weapon;
        if(this.health < 0 || this.health > 100){
            this.health=100;
        }else
          this.health=health;
    }
    public void DamageByGun1(){
        this.health+=-30;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("Got hit by gun 1. Health is reduced by 30"+"new health is="+this.health);
        if(this.health==0){
            System.out.println(getName()+"is Dead");
        }
    }
    public void DamageByGun2(){
        this.health+=-50;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("Got hit by gun 2. Health is reduced by 50"+"new health is="+this.health);
        if(this.health==0){
            System.out.println(getName()+"is Dead");
        }
    }
    public void Heal(){
        if(this.health<=0){
            System.out.println("Not possible"+getName()+"Alraedy Dead");
        }
        else {
            this.health=100;
            System.out.println("Health is Restored"+this.health);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
