import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }


    @Override
    public List<String> write() {
        List<String> fieldsList = new ArrayList<>();
        fieldsList.add(name);
        fieldsList.add(String.valueOf(hitPoints));
        fieldsList.add(String.valueOf(strength));
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
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
