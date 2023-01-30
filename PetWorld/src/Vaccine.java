public class Vaccine {
    String name;
    String preventedDisease;
    String company;
    double dose;
    public Vaccine(String name, String preventedDisease){
        this.name = name;
        this.preventedDisease = preventedDisease;
    }
    public Vaccine(String name, String preventedDisease, String company){
        this.name = name;
        this.preventedDisease = preventedDisease;
        this.company = company;
    }
    public Vaccine(String name, String preventedDisease, String company, double dose){
        this.name = name;
        this.preventedDisease = preventedDisease;
        this.company = company;
        this.setDose(dose);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreventedDisease() {
        return preventedDisease;
    }

    public void setPreventedDisease(String preventedDisease) {
        this.preventedDisease = preventedDisease;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getDose() {
        return dose;
    }

    public void setDose(double dose) {
        if (dose <= 20) {
            this.dose = dose;
        }
        else {
            this.dose = 0;
            System.out.println("Dose is not valid");
        }
    }

}
