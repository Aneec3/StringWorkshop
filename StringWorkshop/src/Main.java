import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("String Workshop\n");
        Scanner string = new Scanner(System.in);
        String StartS;
        System.out.println("Enter a starting string:   ");
        StartS = string.nextLine();
        while(true){
            System.out.println("\nPick an option:\n1. Add content\n2. Check if string contains substring\n3. Output length\n4. Output substring after prefix\n5. Output substring before suffix\n6. Output substring between prefix and suffix\n7. Exit");
            int selection = string.nextInt();
            string.nextLine();
        if (selection == 1) {
            System.out.print("Enter content:    ");
            String addition = string.nextLine();
            StartS = StartS.concat(addition);
            System.out.println(StartS);
        }
        if (selection == 2) {
            System.out.print("Search for substring: ");
            String substring = string.nextLine();
            System.out.println(StartS.contains(substring));
        }
        if (selection == 3) {
            System.out.println("String length is: " + StartS.length());
        }
        if (selection == 4) {
            System.out.print("Enter prefix: ");
            String prefix = string.nextLine();
            if (StartS.contains(prefix)) {
                System.out.println(StartS.substring(StartS.indexOf(prefix) + prefix.length()));
            } else {
                System.out.println("No such prefix in string");
            }}
        if (selection == 5) {
            System.out.print("Enter suffix: ");
            String suffix = string.nextLine();
            if (StartS.contains(suffix)) {
                System.out.println(StartS.substring(StartS.indexOf(suffix)));
            } else {
                System.out.println("No such suffix not found in string");
            }}
        if (selection == 6) {
            System.out.print("Enter prefix: ");
            String prefix2 = string.nextLine();
            System.out.print("Enter suffix: ");
            String suffix2 = string.nextLine();
            if (StartS.contains(prefix2) && StartS.contains(suffix2)) {
                System.out.println(StartS.substring(StartS.indexOf(prefix2) + prefix2.length(), StartS.indexOf(suffix2)));
            } else {
                System.out.println("No such prefix/suffix in string");
            }}
        if (selection == 7) {
            System.out.println("Adios");
            return;
        }}}}