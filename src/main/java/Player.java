import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;


    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
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

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public List<String> write() {
        List<String> fieldsList = new ArrayList<>();
        fieldsList.add(name);
        fieldsList.add(String.valueOf(hitPoints));
        fieldsList.add(String.valueOf(strength));
        fieldsList.add(weapon);
        return fieldsList;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size() > 0) {
           for (int field = 0 ; field < list.size() ; field++) {
               switch (field) {
                   case 0 : name = list.get(field); break;
                   case 1 : hitPoints = Integer.valueOf(list.get(field)); break;
                   case 2 : strength = Integer.valueOf(list.get(field)); break;
                   case 3 : weapon = list.get(field); break;
               }
           }
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
