//Left Aligned Row Number Pyramid Inverse
import java.util.*;
class Larnpi{
    public static void main(String args[]){
        int py_ht=5;
        for(int i=py_ht;i>=1;i--){  //ith row has numbers from 1 to i.
            for(int j=1;j<=i;j++){
                System.out.print(i); //Replace 'i' with 'j' or "*" as needed
            }
            System.out.print("\n");
        }
    }
}