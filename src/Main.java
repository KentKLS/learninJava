// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            int totalBoxes = 34;
            int truckCapacity = 9;

while( totalBoxes > 0){
   if ( totalBoxes < truckCapacity){
        truckCapacity = totalBoxes;
   }
    System.out.println("un voyage de "+truckCapacity+" carton");
    totalBoxes = totalBoxes - truckCapacity;

}

//        for (int i = totalBoxes; i > 0; i = i-truckCapacity ) {
//            if (i < truckCapacity){
//                truckCapacity = i;
//            }
//            System.out.println("un voyage de "+truckCapacity+" carton");
//
//        }
    }
}