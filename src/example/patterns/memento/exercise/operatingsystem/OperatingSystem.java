package example.patterns.memento.exercise.operatingsystem;

import java.util.Date;

public class OperatingSystem {

    private int backupNumber;
    private Date backupDate;

    public void createBackup(){
        this.backupNumber++;
        this.backupDate = new Date();

        System.out.println("Backup created: " + this.backupNumber + " on: " + backupDate);
    }

    public OperatingSystemMemento save(){
        System.out.println("Saving backup nr: " + this.backupNumber + " on: " + this.backupDate);
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load(OperatingSystemMemento memento){
        this.backupNumber = memento.getBackupNumber();
        this.backupDate = memento.getBackupDate();
        System.out.println("Restored backup nr: " + this.backupNumber + " created on: " + this.backupDate);
    }


}
