package fairway.javabasic.oopassignment;

import java.sql.SQLOutput;

public class Run {
    public static void main(String[] args) {
        StorageDevice device;

        System.out.println("--Analoge Device--");
        AnalogDevice ad = new AnalogDevice();
        ad.store();
        ad.delete();
        ad.mount();
        ad.spin();
        device = ad;
        showInfo(device);

        System.out.println("--Digital Device--");
        DigitalDevice dd = new DigitalDevice();
        dd.delete();
        dd.store();
        dd.mount();
        dd.setFlashChip("NAND FLASH");
        dd.setPageSize(1000);
        device=dd;
        showInfo(device);
        showDigitalDevice(dd);

        System.out.println("--optical Drive--");
        OpticalDevice od = new OpticalDevice();
        od.setCapacity(5000);
        od.setSpeed(8);
        od.delete();
        od.mount();
        od.store();
        od.spin();
        od.burn();
        od.eject();
        device = od;
        showInfo(device);

        System.out.println("--Hard Drive--");
        HardDrive hd = new HardDrive();
        hd.setCapacity(258888);
        hd.store();
        hd.delete();
        hd.mount();
        hd.setRpm(5555);
        hd.spin();
        hd.format();
        hd.defrag();
        device=hd;
        showInfo(device);

        System.out.println("--SSD--");
        SolidStateDrive ssd = new SolidStateDrive();
        ssd.setCapacity(1222222);
        ssd.store();
        ssd.delete();
        ssd.mount();
        ssd.format();
        ssd.setPageSize(8800);
        ssd.setFlashChip("NAND Flash");
        ssd.grabageCollect();
        device=ssd;
        showInfo(device);
        showDigitalDevice(ssd);

        System.out.println("Thub drive");
        ThumbDrive td = new ThumbDrive();
        td.setCapacity(1000);
        td.store();
        td.delete();
        td.mount();
        td.format();
        td.setFlashChip("FlashChip");
        td.setClassLevel(10000);
        td.setPageSize(1200);
        device=td;
        showInfo(device);
        showDigitalDevice(td);

    }

    public static void showInfo(StorageDevice device){
        System.out.println("capacity in MB " + device.getCapacity());
    }

    public static void showDigitalDevice(DigitalDevice device){
        System.out.println("Flash Chip:" + device.getFlashChip());
    }
}
