public class SparseTableLab {
    public static void main(String[] args) {
        SparseTable sp1 = new SparseTable(1000,200);
        sp1.addRegister(50, 101, 0);
        RegisterNode temp = sp1.students[50];
        System.out.println(sp1.students[50].courseID);
        sp1.addRegister(50, 110, 3);
        System.out.println(sp1.students[50].nextClass.courseID);
        sp1.addRegister(50, 105, 1);
        System.out.println(sp1.students[50].nextClass.courseID);
        System.out.println(sp1.students[50].nextClass.nextClass.courseID);
        sp1.printAllClass(50);
        sp1.addRegister(60,105);
        sp1.printAllStudent(105);
        sp1.addRegister(65,105);
        sp1.printAllStudent(105);
        sp1.addRegister(40,105);
        sp1.printAllStudent(105);
        sp1.addRegister(55,105);
        sp1.printAllStudent(105);
        System.out.println(sp1.calculateGPA(50));
    }
}