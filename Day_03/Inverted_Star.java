public class inverted {
    public static void main(String args[]){
        int n = 7;
        for(int line=1; line<=n; line++){//outer loop
            for(int star=1; star<=n-line+1; star++){ //inner loop-for stars
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
