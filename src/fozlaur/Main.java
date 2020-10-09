package fozlaur;

public class Main {

    public static void main(String[] args) {
        String[] sArr1 = {"Obi Wan Kenobi","General Grievous","Anakin Skywalker","Darth Maul"};

        System.out.println("Traversal with Index (for loop)");
        for(int i=0; i<sArr1.length; i++){
            System.out.println("Element at index "+ i +": "+sArr1[i]);
        }
        System.out.println();

        System.out.println("Traversal with Index (while loop)");
        int j = 0;
        while(j < sArr1.length){
            System.out.println("Element at index "+ j +": "+sArr1[j]);
            j++;
        }
        System.out.println();

        System.out.println("Traversal with Index (do-while loop)");
        int k = 0;
        do{
            System.out.println("Element at index "+ k +": "+sArr1[k]);
            k++;
        }while(k < sArr1.length);
        System.out.println();

        System.out.println("Traversal without Index (foreach loop)");
        for(String str : sArr1){
            System.out.println(str);
        }
    }
}
