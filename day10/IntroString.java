class IntroString {
    public static void main(String args []){
        String str1="Hello";
        String str2= new String("Hello");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        for(int i=0;i<str1.length();i++){
            System.out.println(str1.charAt(i));
        }

        String str3= str1.toLowerCase();
        System.out.println(str3.substring(2,4));

        // write the program to print characters from string from the even palces , you can consider 0 as even.

    }
}