public class Flight {
        private int flightID;
        private String destination;
        private BoardingPass boardingPass;

        public Flight(int flightID, String destination, String seat, String gate){
                this.boardingPass = new BoardingPass(seat, gate);       
                this.flightID = flightID;
                this.destination = destination;
        }
        //I don't know I need this getters but I wrote them just in case
        public int getFlightId(){
                return this.flightID;
        }
        public String getDestination(){
                return this.destination;
        }
        
        public String getBoardingPassInfo(){
                return this.boardingPass.toString();
        }

        @Override
        public String toString(){
                return "Flight ID: " + flightID + ", Destination: " + destination + ", " + boardingPass.toString();
        }

}
