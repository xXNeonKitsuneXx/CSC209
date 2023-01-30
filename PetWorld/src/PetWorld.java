public class PetWorld {
    public static void main(String[] args) {
        Pet p1 = new Pet("Leub", 111, "female");
        System.out.println(p1.name + " " + p1.getGender());
        Pet p2 = new Pet("Deng", 112, "Mixing");
        System.out.println(p2.name + " " + p2.getGender());
//        p2.gender = "Mixer";
//        System.out.println(p2.name + " " + p2.gender);
        p2.setGender("Mixer");
        System.out.println(p2.name + " " + p2.getGender());
        p2.setType("raptor");
        System.out.println(p2.name + " " + p2.getType());
        p1.setType("crocodile");
        System.out.println(p1.name + " " + p1.getType());
        Vaccine v1 = new Vaccine("GK26","CoViD","Pfizu", 5);
        Vaccine v2 = new Vaccine("GT11","Cancer","Moderne", 100);
        System.out.println(v2.getCompany() + " " + v2.getDose());
        p1.vaccinate(v2);
        p1.vaccinate(v1);
        System.out.println(p1.getVaccineCount());
        System.out.println(p2.getVaccineCount());
        p1.showAllPreventedDisease();
        p2.showAllPreventedDisease();
    }
}
