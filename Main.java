package Game;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player1 player1=new Player1("Sai","Sword",100);
        player1.DamageByGun1();
        player1.DamageByGun2();
       player1.Heal();
        System.out.println(player1.getHealth());
        Player2 player2=new Player2("Ram","Sword",100,true);
        player2.DamageByGun1();
        player2.DamageByGun2();
        System.out.println(player2.getHealth());
        }
    }
