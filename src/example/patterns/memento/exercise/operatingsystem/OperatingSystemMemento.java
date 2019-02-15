package example.patterns.memento.exercise.operatingsystem;

import java.util.Date;

public class OperatingSystemMemento {

    private int backupNumber;
    private Date backupDate;

    public OperatingSystemMemento(int backupNumber, Date backupDate) {
        this.backupNumber = backupNumber;
        this.backupDate = backupDate;
    }

    public int getBackupNumber() {
        return backupNumber;
    }

    public Date getBackupDate() {
        return backupDate;
    }
}
