package qw;

public class Tribe {
    private String name;
    private int amount;
    private boolean fire_relate;

    public Tribe(String wind, int i) {
    }

    public Tribe(String name, int amount, boolean fire_relate) {
        this.name = name;
        this.amount = amount;
        this.fire_relate = fire_relate;
    }

    public Tribe(Tribe o) {
        this.name = o.name;
        this.amount = o.amount;
        this.fire_relate = o.fire_relate;
    }

    public Tribe() {
        this.name = name;
        this.fire_relate = fire_relate;
    }



    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public boolean getFire_relate() {
        return fire_relate;
    }

    public static int Amount(Tribe[] tribe) {
        int p = 0;
        for (int i = 0; i < 4; i++) {
            p += tribe[i].amount;
            return p;
        }
        public static String hasFire_ralate(Tribe[] tribe) {
            int lic = 0;
            for (int i = 0; i < 4; i++)
                if (tribe[i].fire_relate == true)
                    lic++;
            return lic;
        }
        public void print() {
            System.out.println(this.getName() + "\n" + this.getFire_relate());
            if (this.isFire_ralate()) {
                System.out.println("Have fire ralationships.");
            }
            if (!this.isFire()) {
                System.out.println("Have not fire ralationships.");
            }
        }
    }


}

