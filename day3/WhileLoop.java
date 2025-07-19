
public class WhileLoop {
    public static void main(String[] args) {
        // count the number of 5 in an integer n
        int n=100;
        int count=0;
        while(n%5==0 && n!=0){
            n/=5;
            count++;
        }
        System.out.println("Number of 5 in prime factor: "+count);
        // this is replication of while using for loop but this is not recommonded , because we are trying to change the default sytax and adding confusion 
        for(;n%5==0;){

        }
    }

    // print odd numbers till n
    // print prime numbers till n
    //  print composite numbers till n
    // find largest number out of 3

}
