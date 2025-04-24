
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author luisb
 */

public class Scrambler {
    public static Integer[] scrambler(Integer[] arrin){
        if(arrin.length == 1){
            return arrin;
        }
        Integer[] arrout = new Integer[arrin.length]; 
            for(short i = 0; i<arrin.length;i++){
                //make random number in range of length of arrin
                Random random = new Random();
                int x = random.nextInt(arrin.length);

                if(arrin[x] != null){
                    arrout[i] = arrin[x];
                    arrin[x] = null;
                }
                else{
                    i--;
                }
            }
            return arrout;
        //make second array, randomly copy elements from input to output array
    }
}