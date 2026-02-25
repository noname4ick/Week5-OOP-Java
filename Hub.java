public class Hub<T> {
        private T device;
        public void StoreDevice(T item){
                this.device = item;
        }        
        public T getDevice(){
                return device;
        }

        public void statusReport(){
                if(device == null){
                        System.out.println("Hub is empty");
                }
                else{
                        System.out.println("Device information: " + device.toString());
                }
        }

}
