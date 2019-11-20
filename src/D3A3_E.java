public class D3A3_E {
    public static void main(String[] args) {

        // A3: Create examples that demonstrates the usage of following String methods:
        // indexOf(), startsWith(), compareTo(), trim(), replace(), replaceAll() and split()

        // indexOf()
        int index = "This is a teststring".indexOf("test");
        System.out.println(index);

        // startsWith()
        String testString = "Marry had a little lamb";
        System.out.println(testString.startsWith("M"));
        System.out.println(testString.startsWith("h"));
        System.out.println(testString.endsWith("lamb"));        // end with

        System.out.println("abc".compareTo("1"));

        System.out.println("     This is a trimmed text   .     ".trim());

        String s1="As the robot entered the room, all people jumped under their seats.";
        String replaceString=s1.replace('e','ä');     //replaces all occurrences of 'e' to 'ä'
        System.out.println(replaceString);

        String s2="My name is Khan. My name is Bob. My name is Sonoo.";
        String replaced=s2.replaceAll("is","was");//replaces all occurrences of "is" to "was"
        System.out.println(replaced);

        String Splitline = "arg1, arg2, arg3, arg4";
        String[] Splitted = Splitline.split(",");

        for(int i=0; i<Splitted.length; i++) System.out.println(Splitted[i].trim());

    }
}
