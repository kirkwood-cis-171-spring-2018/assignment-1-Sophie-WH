public class Assignment1-2
{
    public static void printAddress(String name, String address, String cityStateZip, String phone, String area)
    {
        System.out.println(name);
        System.out.println(address);
        System.out.println(cityStateZip);
        System.out.println(phone);
        System.out.println(area);
        
    }
    public static void main(String[] args)
    {
        String name = "Chris Ortman";
        String address = "742 Evergreen Terrace";
        String cityStateZip = "Springfield, SA, 55555";
        String phone = "555-867-5309";
        String area = "CIS-121";
        printAddress(name,address,cityStateZip,phone,area);
    }
}
