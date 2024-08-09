public class Main{
    Main(){

    }
    public static void main(String[] args){
        //String Literals -> String word = new String(The string you want);
        //eg
        String color1 = new String("Blue"); //This is a string Object
        String color2 = "green"; //this is a string literal
        //For String Object, when they  are being created, the CPU reserves the memory for the variable
        // String color3 = "green";
        String color4 = new String("Blue");
        System.out.println();
        System.out.println(color2);
        // == operator compares two variables that are stored in the same address/memory location
        //Because the string objects => new String("String"), the operator '==' cannot work due to the fact that objects are created on a new memory!
        //the string methods eg:- color1.equals(color4), compares the contents of color1 to the content of color4, more or less the same as the '==' operator for literals
        color2 = "blue";
        color1 = "purple";
        System.out.println(color1);
        System.out.println(color2);
        if(color1.equals(color4)){
            System.out.println("This is true");
        }
    }
}