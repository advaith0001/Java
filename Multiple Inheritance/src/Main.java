
interface Camera {
    void takePhoto();
}

interface Phone {
    void makeCall();
}

class SmartDevice implements Camera, Phone {
    public void takePhoto() {
        System.out.println("Photo taken");
    }
    public void makeCall() {
        System.out.println("Calling...");
    }
}



public class Main {
    public static void main(String[] args) {
        SmartDevice device = new SmartDevice();
        device.takePhoto();
        device.makeCall();
    }
}
