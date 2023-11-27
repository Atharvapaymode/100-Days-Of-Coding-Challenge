import java.util.*;
    //break statement
    public class breakk {
        public static void main(String args[]){
            for(int i=1;i<=5;i++){
                if(i == 3){//after i=3 the we will exit the loop
                    break;
                }
                System.out.println(i);
            }

            System.out.println("i am out of the loop");
        }
    }
