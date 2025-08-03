public class RecursionEx {
    static void naturalN(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        naturalN(n-1);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);

    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    static int fibbo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    public static void main (String args[]){
        naturalN(10);
        System.out.println(sum(5));
        System.out.println(fact(5));
        System.out.println("fibbo "+fibbo(8));
    }
}