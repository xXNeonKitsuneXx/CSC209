import java.util.Date;
//***** @Author Student ID 65130500212 *****
//***** Nithit Lertcharoensombat *****
public class Pet {
        String name;
        private Date dateOfBirth;
        private String [] colors;
        private int ID;
        private String type;
        private String gender;
        //Onwer
        private Vaccine[] vaccines;
        private int vaccineCount;
        public Pet (String name, int ID, String gender) {
                this.name = name;
                this.ID = ID;
//                this.gender = gender;
                this.setGender(gender);
                vaccines = new Vaccine[100];
                vaccineCount = 0;
        }

        public int vaccinate(Vaccine v){
                vaccines [vaccineCount] = v;
                vaccineCount++;
                return vaccineCount;
        }

        public int getVaccineCount(){
                return vaccineCount;
        }

        public void setGender (String gender){
                if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
                        this.gender = gender;
                }
                else {
                        System.out.println("Animal genders are only male or female.");
                        this.gender = "unknown";
                }
        }
        public String getGender(){
                return gender;
        }
        public String getType(){
                return type;
        }
        public boolean setType(String type){
                String [] typeList = {"dog","cat","fish",
                "rabbit","bird","chicken","python","raptor",
                "worm","cricket"};
                for (int i = 0; i < typeList.length; i++) {
                        if(type.equalsIgnoreCase(typeList[i])){
                                this.type = type;
                                return true;
                        }
                }
                // if the code is here, type parameter is not in the typeList
                this.type = "unknown";
                return false;
        }

        public void showAllPreventedDisease(){
                if (vaccineCount > 0) {
                        System.out.print("The pet is safe from: ");
                        for (int i = 0; i < vaccineCount; i++) {
                                System.out.print(vaccines[i].getPreventedDisease() + " ");
                        }
                        System.out.println();
                }
                else{
                        System.out.println("This pet is at risk of all diseases");
                }
        }
}
