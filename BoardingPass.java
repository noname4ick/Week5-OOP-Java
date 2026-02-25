public class BoardingPass{
        private String seatNumber;
        private String gate;

        public BoardingPass(String seatNumber, String gate){
                this.seatNumber = seatNumber;
                this.gate = gate;
        }
        public String getSeatNumber(){
                return this.seatNumber;
        }
        public String getGate(){
                return this.gate;
        }
        @Override
        public String toString(){
                return "Boarding Pass: Seat Number - " + seatNumber + ", Gate - " + gate;
        }
}