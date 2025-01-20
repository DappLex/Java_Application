public class TrafficLightState {
    
    enum TrafficLightState {
        RED, YELLOW, GREEN;
    }

    public static void main(String[] args) {
       
        TrafficLightState currentLight = TrafficLightState.RED;

        
        switch (currentLight) {
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Prepare to stop");
                break;
            case GREEN:
                System.out.println("Go");
                break;
        }
    }
}
