package lecture04;

public class Fighter {

    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.setHitPoint(enemy.getHitPoint() - power);
        System.out.println(name + " は " + enemy.getName() + " に " + power + " ダメージを与えた.");
        System.out.println(enemy.getName() + " の残り hitPoint : " + enemy.getHitPoint());
    }

    public boolean isAlive(){
        return hitPoint > 0;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public void setHitPoint(int hitPoint){
        if(hitPoint >= 0){
            this.hitPoint = hitPoint;
        }
    }

    public String getName(){
        return this.name;
    }
}
