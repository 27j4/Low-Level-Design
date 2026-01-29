package Practice.prototype;

class Enemy implements Cloneable {

    private int health;
    private int speed;
    private String weapon;

    private String name;
    private String position;
    private int power;

    public Enemy(int health, int speed, String weapon,
                 String name, String position, int power) {
        this.health = health;
        this.speed = speed;
        this.weapon = weapon;
        this.name = name;
        this.position = position;
        this.power = power;
    }

    @Override
    public Enemy clone() {
        try {
            return (Enemy) super.clone(); // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // setters for variations
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", speed=" + speed +
                ", weapon='" + weapon + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", power=" + power +
                '}';
    }
}

public class Prototype {

    public static void main(String[] args) {

        // base enemy prototype
        Enemy baseEnemy = new Enemy(100, 10, "bow-arrow",
                "baseEnemy", "base", 120);

        // clone and customize
        Enemy enemy1 = baseEnemy.clone();
        enemy1.setName("Ansh");
        enemy1.setPower(100);

        Enemy enemy2 = baseEnemy.clone();
        enemy2.setName("Suresh");
        enemy2.setPosition("front");
        enemy2.setPower(90);

        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(baseEnemy);
    }
}
