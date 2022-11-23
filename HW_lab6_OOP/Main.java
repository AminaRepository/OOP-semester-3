import java.util.Arrays;

public class Main {
    public static int smallest(int[] array){
        int small = array[0];
        for(Integer x : array){
            if(x<small){
                small = x;
            }
        }
        return small;
    }
    public static int indexSmallest(int[] array){
        int small = array[0], index = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]<small){
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    public static int indexSmallestFrom(int[] array, int indexStart){
        int small = array[indexStart], index = indexStart;
        for(int i = indexStart; i<array.length; i++){
            if(array[i]<small){
                small = array[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2){
        int holder = array[index1];
        array[index1] = array[index2];
        array[index2] = holder;
    }
    public static boolean binarySearch(int[] array, int searched){
        int low = 0, high = array.length;
        int mid = (low+high)/2;
        while(low <= high){
            if(array[mid] == searched){
                return true;
            }
            else if (searched < array[mid]){
                high = mid-1;
            }
            else if (searched > array[mid]){
                low = mid+1;
            }
            mid = (high+low)/2;
        }
        return false;
    }
    public static void printElegant(int[] array){
        for(int i=0; i<array.length-2; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1]);
    }
    public static void main(String[] args){
        int values[] = {1, 5, 6, 4, 2, 0, 7};
        System.out.println("Smallest: " + smallest(values));
        System.out.println("Index of smallest: " + indexSmallest(values));
        System.out.println("Index of smallest from 2: " + indexSmallestFrom(values, 2));
        System.out.println("Index of smallest from 5: " + indexSmallestFrom(values, 5));
        System.out.println("Index of smallest from 6: " + indexSmallestFrom(values, 6));
        swap(values, 1, 5);
        System.out.println(Arrays.toString(values));
        int sorted[] = {-3, 2, 5, 8, 10};
        System.out.println(binarySearch(sorted, 6));
        System.out.println(binarySearch(sorted, 8));
        printElegant(sorted);
        NightSky sky1 = new NightSky(0.5, 40, 10);
        NightSky sky2 = new NightSky(0.1, 40, 10);
        sky1.printLine();
        System.out.println(sky1.starsInLastPrint());
        sky2.printLine();
        System.out.println(sky2.starsInLastPrint());
    }
}