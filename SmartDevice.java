public class SmartDevice {
        private String brand;
        private boolean isPowerOn;
        public SmartDevice(String brand,boolean state){
                this.brand = brand;
                this.isPowerOn = state;
        }
        public String getBrand(){
                return this.brand;
        }
        public boolean isPowerOn(){
                return isPowerOn;
        }
        public void changePowerState(boolean state){
                this.isPowerOn = state;
        }
        @Override
        public String toString(){
                return "Device from brand " + this.brand + " is " + " Power Status is " + this.isPowerOn; 
        }
        
}
