package javapuzzlers;

public class LastLaugh {
    public static void main(String args[]) {
        System.out.print("H" + "a");
        System.out.print('H' + 'a');

        System.out.println();

        //With StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('H');
        stringBuffer.append('a');
        System.out.println(stringBuffer);

        //Concatenation works only with String
        System.out.println("" + 'H' + 'a');

        //With String.valueOf
        System.out.println(String.valueOf('H') + String.valueOf('a'));


    }
}

