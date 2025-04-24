import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import sortalgs.Bubblesort;
import sortalgs.Cocktailsort;
import sortalgs.Count_sort;
import sortalgs.Divide_and_Conquer;
import sortalgs.Heapsort;
import sortalgs.Insertion_Sort;
import sortalgs.Quicksort;
import sortalgs.Selection_sort;

//TODO: fix switch funct
public class Tester{
    public static void main(String[] args){
    //determine sorting alg:
    byte sortalg = Asker();
    
    for(int i = 0; i < 11; i++) {
        Integer[] arrtest = TestReader.reader(i);
        Integer[] arrtestcpy = TestReader.reader(i);
        Integer[] arrsort = Scrambler.scrambler(arrtestcpy);
        
        
        //switch funct doesnt work.
        
        if(sortalg == 1){
            Insertion_Sort.insertionSort(arrsort);
        }
        else if(sortalg == 2){
            Bubblesort.bubblesort();
        }
        else if(sortalg == 3){
            Divide_and_Conquer.DivideAndConquer();
        }
        else if(sortalg == 4){
            Cocktailsort.cocktailsort();
        }
        else if(sortalg == 5){
            Count_sort.countsort();
        }
        else if(sortalg == 6){
            Quicksort.quicksort();
        }
        else if(sortalg == 7){
            Heapsort.heapsort();
        }
        else if(sortalg == 8){
            Selection_sort.selection_sort();
        }
        else{
            System.err.println("Not implementet yet");
            return;
        }
            
            //end, print if sucessful or not
        if(Arrays.equals(arrsort, arrtest)==true && i<9){
            System.out.println(" __________________");
            System.out.println("|                  |");
            System.out.println("|      Test "+ (i+1)+"      |" +"\n|    successful    |");
            System.out.println("|__________________|");
               
        }
        else if(Arrays.equals(arrsort, arrtest)==true && i>=9){
            System.out.println(" __________________");
            System.out.println("|                  |");
            System.out.println("|     Test "+ (i+1)+"      |" +"\n|    successful    |");
            System.out.println("|__________________|");
           
        }
        else if(Arrays.equals(arrsort, arrtest)!=true && i<9){
            System.out.println(" __________________");
            System.out.println("|                  |");
            System.out.println("|      Test "+ (i+1)+"      |" +"\n|      failed      |");
            System.out.println("|__________________|");
            return;
        }
           
        else{
            System.out.println(" __________________");
            System.out.println("|                  |");
            System.out.println("|     Test "+ (i+1)+"      |" +"\n|      failed      |");
            System.out.println("|__________________|");
            return;
        }
    }   
}
    
public static Byte Asker(){
        //Ask wich sorting Alg to use
        byte x;
        System.out.print("Select Sorting Algorythm?\n 1 - Insertion Sort\n 2 - Bubblesort\n" );
        System.out.print(" 3 - Divide and Conquer\n 4 - Cocktailsort\n");
        System.out.print(" 5 - Count Sort\n 6 - Quicksort\n");
        System.out.print(" 7 - Heapsort\n 8 - Selection Sort\n");
        do{
            try{
                //error ignorable
                Scanner scan = new Scanner(System.in);
                x = scan.nextByte();
                return x; 
            }
            catch (InputMismatchException e){
            } finally {
            }
            System.out.println("Must be a number");
        } while (true);
    } 
    
}

/**
 *
 * @author luisb
 */