
import java.io.File;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        // Create an array of Mountain objects
        String fileName = "mountains.txt";
        Mountain[] allTheMountains = getMountainFromFile(fileName);




        //System.out.println("-------------------------------");
        System.out.println("--------Printing the mountains (recursively)-------------");
        printArrayRecursively(allTheMountains, 0);

        System.out.println("--------------Tallest mountain-----------------");
        System.out.println(findTallestMountain(allTheMountains).toString());
        //System.out.println("\n--------------3rd tallest mountain-----------------");
        //System.out.println(find3rdTallestMountain(allTheMountains).toString());
        //System.out.println("--------------Shorest mountain-----------------");
        //System.out.println(findShortestMountain(allTheMountains).toString());
        //System.out.println("--------------Mountain with earliest ascent-----------------");
        //System.out.println(findMountainWithEarliestAscentYear(allTheMountains).toString());
        //System.out.println("--------------Mountain with recent ascent-----------------");
        //System.out.println(findMountainWithRecentAscentYear(allTheMountains).toString());


        //System.out.println("--------------Year with the most ascents-----------------");
        //findYearWithMostAscents(allTheMountains);
    }

    /**
     * Recursively prints the objects in an array.
     *
     * @param arr   The array of objects to print.
     * @param index The current index to process.
     */
    public static void printArrayRecursively(Object[] arr, int index) {
        if(index == arr.length){
            return;
        }else {
            System.out.println(arr[index].toString());
        }
        System.out.println();
        index++;
        printArrayRecursively(arr, index);


    }


    /**
     * Finds and returns the year with the most mountain ascents in an array of Mountain objects.
     *
     * @param mountains An array of Mountain objects to search for the year with the most ascents.
     */
    public static void findYearWithMostAscents(Mountain[] mountains) {
        int [] temp = new int [mountains.length];
        for(int i = 0; i <mountains.length; i++){
            temp[i] = mountains[i].getYearFirstClimbed();
        }
        int mode = temp[0];
        int maxCount = 0;
        int index = 0;
        for(int i = 0; i < temp.length; i++){
            int value = temp[i];
            int count = 0;
            for(int j = 1; j < temp.length; j++){
                if(temp[j] == value)
                    count ++;
                if(count > maxCount){
                    mode = value;
                    maxCount = count;
                    index = j;
                }
            }
        }
        System.out.println(temp[index] + " occured " + maxCount + " times ");
    }


    /**
     * Finds and returns the mountain with the most recent year of first ascent in
     * an array of Mountain objects.
     *
     * @param mountains An array of Mountain objects to search for the mountain
     *  with the recent ascent year.
     * @return The mountain with the recent year of first ascent found in the
     *  array, or null if the array is empty or null.
     */

    public static Mountain findMountainWithRecentAscentYear(Mountain[] mountains) {
        // complete this method
        return new Mountain();
    }

    /**
     * Finds and returns the mountain with the earliest year of first ascent in
     * an array of Mountain objects.
     *
     * @param mountains An array of Mountain objects to search for the mountain
     *  with the earliest ascent year.
     * @return The mountain with the earliest year of first ascent found in the
     *  array, or null if the array is empty or null.
     */
    public static Mountain findMountainWithEarliestAscentYear(Mountain[] mountains) {
        // complete this method
        return new Mountain();
    }


    /**
     * Finds and returns the smallest mountain in an array of Mountain objects
     * based on height.
     *
     * @param mountains An array of Mountain objects to search for the smallest
     *  mountain.
     * @return The smallest mountain found in the array, or null if the array is
     *  empty or null.
     */
    public static Mountain findShortestMountain(Mountain[] mountains) {
        // complete this method
        return new Mountain();
    }


    /**
     * Finds and returns the tallest mountain in an array of Mountain objects.
     *
     * @param mountains An array of Mountain objects to search for the tallest
     *  mountain.
     * @return The tallest mountain found in the array, or null if the array is
     *  empty or null.
     */

    public static Mountain findTallestMountain(Mountain[] mountains) {
        if (mountains == null || mountains.length == 0) {
            return null;
        }
        Mountain tallestMountain = mountains[0];
        for (int i = 1; i < mountains.length; i++) {
            Mountain currentMountain = mountains[i];
            //System.out.println(mountains.length);
            System.out.println(mountains[i].toString());
            if (currentMountain.getHeightInFeet() > tallestMountain.getHeightInFeet()) {
                tallestMountain = currentMountain;
            }
        }

        return tallestMountain;
    }



    /**
     * Finds and returns the 3rd tallest mountain in an array of Mountain objects.
     *
     * @param mountains An array of Mountain objects to search for the 3rd tallest
     *  mountain.
     * @return The 3rd tallest mountain found in the array, or null if the array is
     *  empty or null.
     */

    public static Mountain find3rdTallestMountain(Mountain[] mountains) {
        // complete this method
        return new Mountain();
    }

    /**
     * This method takes a String that represents the name of a file containing information about mountains. It reads the file and creates "Mountain" objects representing every mountain from the file. Every object is stored in a Mountain array and returned.
     *
     * @param fileName The name of the input file containing the mountain objects.
     * @return An array of Mountain objects called mountains .
     */

    public static Mountain[] getMountainFromFile (String fileName){
        int line = linesinFile(fileName);
        Mountain[] mountains = new Mountain[line];
        try{
            File myFile = new File(fileName);
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNext()){
                int mtn = 0;
                String nameOfMtn = myReader.next();
                double peakInFeet = myReader.nextDouble();
                String nameOfMtnRange = myReader.next();
                int yearClimbed = myReader.nextInt();

                mountains [mtn] = new Mountain(nameOfMtn, peakInFeet, nameOfMtnRange, yearClimbed);

                System.out.println(mountains[mtn].toString());
                mtn = mtn + 1;
                //System.out.println(mtn);
            }
        }
        catch(Exception e){
            System.out.println("Error in finding file");
        }

        return mountains;
    }

    /**
     * Computes how many lines the file contains
     *
     * @param filename The name of the input file containing the mountain objects.
     * @return An integer that represents the total lines in the file.
     */
    public static int linesinFile(String filename){
        int count=0;
        try{
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                //System.out.println(line);
                count++;
            }

        }catch (Exception e){
            System.out.println(
                    "Error occured in counting number of rows.");
            e.printStackTrace();
        }
        return count;
    }
}