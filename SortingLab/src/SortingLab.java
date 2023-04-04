public class SortingLab {
    public static void main(String[] args) {
        Data d1 = new Data(100);
        d1.addNewInfo(50); //1
        d1.addNewInfo(100); //2
        d1.addNewInfo(9401); //3
        d1.addNewInfo(9); //4
        d1.addNewInfo(40); //5
        d1.addNewInfo(1200); //6
        d1.addNewInfo(2195); //7
        d1.addNewInfo(60); //8
        d1.addNewInfo(834); //9
        d1.addNewInfo(25); //10
        d1.addNewInfo(512); //11
        d1.addNewInfo(30); //12
//        d1.printAll();

        Data d2 = new Data(100); //Selection Sort
        d2.clone(d1);
        System.out.println("-----Selection Sort-----");
        d2.printAll();
        d2.selectionSort();
        d2.printAll();
        System.out.println();

        //////////////////////////////////////////////////////////
        Data d3 = new Data(100); //Insertion Sort
        d3.clone(d1);
        System.out.println("-----Insertion Sort-----");
        d3.printAll();
        d3.insertionSort();
        d3.printAll();
        System.out.println();

        //////////////////////////////////////////////////////////
        Data d4 = new Data(100); //Bubble Sort
        d4.clone(d1);
        System.out.println("-----Bubble Sort-----");
        d4.printAll();
        d4.bubbleSort();
        d4.printAll();
        System.out.println();

        //////////////////////////////////////////////////////////
        Data d5 = new Data(100); //Quick Sort
        d5.clone(d1);
        System.out.println("-----Quick Sort-----");
        d5.printAll();
        d5.quickSort(0, d5.size-1);
        d5.printAll();
        System.out.println();

        //////////////////////////////////////////////////////////
        Data d6 = new Data(100); //
        d6.clone(d1);
        System.out.println("-----Radix Sort-----");
        d6.printAll();
        d6.radixSort();
        d6.printAll();
        System.out.println();

        //////////////////////////////////////////////////////////
        Data d7 = new Data(100); //
        d7.clone(d1);
        System.out.println("-----Merge Sort-----");
        d7.printAll();
        d7.mergeSort(0, d7.size - 1);
        d7.printAll();
        System.out.println();

        //////////////////////////////////////////////////////////
        Data d8 = new Data(100); //
        d8.clone(d1);
        System.out.println("-----Shell Sort-----");
        d8.printAll();
        d8.shellSort();
        d8.printAll();
        System.out.println();
    }
}