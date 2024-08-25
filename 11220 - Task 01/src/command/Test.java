package command;

public class Test {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light kitchenLight = new KitchenRoomLight();
        Light livingRoomLight = new LivingRoomLight();

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);
        Command kitchenLightDim = new LightDimCommand(kitchenLight, 50);

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command livingRoomLightDim = new LightDimCommand(livingRoomLight, 30);

        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);

        System.out.println("Kitchen Light ON/OFF Test:");
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        System.out.println("\nLiving Room Light ON/OFF Test:");
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        System.out.println("\nKitchen Light DIM Test:");
        remoteControl.onButtonWasPushed(0);
        kitchenLightDim.execute();
        remoteControl.undoButtonWasPushed();

        System.out.println("\nLiving Room Light DIM Test:");
        remoteControl.onButtonWasPushed(1);
        livingRoomLightDim.execute();
        remoteControl.undoButtonWasPushed();
    }
}

