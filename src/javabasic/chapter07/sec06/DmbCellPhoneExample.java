package javabasic.chapter07.sec06;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("S23","Black", 23);

        //DmbCellPhone의 메소드 호출
        dmbCellPhone.changeChannelDmb(23);
        dmbCellPhone.turnOffDmb();
        dmbCellPhone.turnOnDmb();

        //CellPhone의 메소드 호출
        dmbCellPhone.hangUp();
        dmbCellPhone.powerOn();
        dmbCellPhone.powerOff();
        dmbCellPhone.receiveVoice("안녕");
    }
}
