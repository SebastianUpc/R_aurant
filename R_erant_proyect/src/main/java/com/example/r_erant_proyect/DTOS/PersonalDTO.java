package com.example.r_erant_proyect.DTOS;

import jakarta.persistence.Column;

public class PersonalDTO {
    private int idPersonal;
    private String namePersonal;
    private int numberPersonal;
    private String gmailPersonal;
    private int hoursPersonal;
    private double salaryPersonal;
    private boolean statusPersonal;

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    public String getNamePersonal() {
        return namePersonal;
    }

    public void setNamePersonal(String namePersonal) {
        this.namePersonal = namePersonal;
    }

    public int getNumberPersonal() {
        return numberPersonal;
    }

    public void setNumberPersonal(int numberPersonal) {
        this.numberPersonal = numberPersonal;
    }

    public String getGmailPersonal() {
        return gmailPersonal;
    }

    public void setGmailPersonal(String gmailPersonal) {
        this.gmailPersonal = gmailPersonal;
    }

    public int getHoursPersonal() {
        return hoursPersonal;
    }

    public void setHoursPersonal(int hoursPersonal) {
        this.hoursPersonal = hoursPersonal;
    }

    public double getSalaryPersonal() {
        return salaryPersonal;
    }

    public void setSalaryPersonal(double salaryPersonal) {
        this.salaryPersonal = salaryPersonal;
    }

    public boolean isStatusPersonal() {
        return statusPersonal;
    }

    public void setStatusPersonal(boolean statusPersonal) {
        this.statusPersonal = statusPersonal;
    }
}
