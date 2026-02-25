public class Main {
        public static void main(String[] args){
                // Aviation Management
                System.out.println("Result from Aviation Management");
                Flight flight1 = new Flight(1223, "Samarqand", "12B", "Gate 1");
                System.out.println(flight1.toString());

                
                //Smart Home Hub
                System.out.println("Result from Smart Home Hub");
                Hub<SmartDevice> smartHub = new Hub<>();
                SmartDevice device1 = new SmartDevice("Lamp", true);
                smartHub.StoreDevice(device1);
                smartHub.statusReport();


                //University Library
                System.out.println("Result from University Library");
                Book book1 = new Book("Calculus","J.Stewart");
                Professor prof1 = new Professor("G.Pinto");
                LibrarySystem lib = new LibrarySystem();
                lib.checkout(prof1, book1);
        }
}
