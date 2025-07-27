class PowX {
    public  static double myPow(double x, int n) {
        boolean flag=false;
        if(n<0){
            flag=true;
            x=Math.abs(x);
        }
        for(int i=1;i<=n;i++){
            x=x*x;
        }
        return flag?(1/x):x;
    }
    public static void main(String args[]){
        System.out.println(myPow(2,10));
    }
}