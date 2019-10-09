package lesson5_6.Remote_Device;

public class RemoteController {
    TVDevice tvDevice = new TVDevice() {
        @Override
        public void powerOn() {

        }

        @Override
        public void powerOff() {

        }

        @Override
        public void setChannel(int channel) {

        }

        @Override
        public void currentChannel() {

        }

        @Override
        public void upVolume() {

        }

        @Override
        public void downVolume() {

        }

        @Override
        public void mute() {

        }

        public void connectDevice (TVDevice tv){}

        public void disconnectDevice(){}
        public void switchTheChannel(int value){}
        private void checkIfDeviceConnected(){}

    };
}
