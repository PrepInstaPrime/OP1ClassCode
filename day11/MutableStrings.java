class MutableStrings {
    public static void main(String args[]){
        StringBuilder str1= new StringBuilder("Hello");
        StringBuffer str2= new StringBuffer("Hey");
        // System.out.println(str1.reverse());
        System.out.println(str1);
        str2.append("Class");
        System.out.println(str2.charAt(2));
        System.out.println(str2);
        System.out.println(str2.length());
        String str3="Hello";
        System.out.println(str3==str1.toString());

    }
}