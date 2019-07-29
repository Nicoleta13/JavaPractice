public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int megaToKilo = kiloBytes / 1024 ;
            int kilosRemained = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaToKilo + " MB and " + kilosRemained + " KB");
        }
    }
}
