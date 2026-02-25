public class Flight {
        private int flightID;
        private String destination;
        private BoardingPass boardingPass;

        public Flight(int flightID, String destination, String seat, String gate){
                this.boardingPass = new BoardingPass(seat, gate);       
                this.flightID = flightID;
                this.destination = destination;
        }

        @Override
        public String toString(){
                return "Flight ID: " + flightID + ", Destination: " + destination + ", " + boardingPass.toString();
        }

        public static void main(String[] args) {
                Flight flight1 = new Flight(123, "New York", "12A", "Gate 5");
                System.out.println(flight1.toString());
        }
}
