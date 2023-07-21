package Hospital_Management;

import java.util.Scanner;

public class fecility implements fecilityInterface
{
    String fec_name;
    public void add_feci()
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = scn.nextLine();
    }
    public void show_feci()
    {
        System.out.println(fec_name);
    }
}