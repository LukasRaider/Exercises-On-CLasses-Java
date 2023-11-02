
class Lamp {
    private static boolean lampa;

    public Lamp() {
        lampa = false;
    }

    public String getStat() {
        if (lampa == true) {
            return "On";
        } else {
            return "Off";
        }
    }

    public void setStatOn() {
        lampa = true;
    }

    public void setStatOff() {
        lampa = false;
    }
}

class TestLamp {
    public static void main(String[] args) {
        Lamp l1 = new Lamp();

        System.out.println("Lamp is " + l1.getStat());
        l1.setStatOn();
        System.out.println("Lamp is " + l1.getStat());

        Lamp l2 = new Lamp();
        l2.setStatOn();
        System.out.println("Lamp is " + l2.getStat());
        l2.setStatOff();
        System.out.println("Lamp is " + l2.getStat());
    }
}
