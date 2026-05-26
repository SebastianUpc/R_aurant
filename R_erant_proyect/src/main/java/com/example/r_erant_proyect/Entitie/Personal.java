package com.example.r_erant_proyect.Entitie;

import jakarta.persistence.*;

@Entity
@Table(name = "Personal")
public class Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonal;

    @Column(name = "NamePersonal",nullable = false,length = 40)
    private String namePersonal;
    @Column(name = "NumberPersonal",nullable = false)
    private int numberPersonal;
    @Column(name = "GmailPersonal",nullable = false)
    private String gmailPersonal;
    @Column(name = "HoursPersonal")
    private int hoursPersonal;
    @Column(name = "SalaryPersonal",nullable = false)
    private double salaryPersonal;
    @Column(name = "StatusPersonal",nullable = false)
    private boolean statusPersonal;

    public Personal() {
    }

    public Personal(int idPersonal, String namePersonal, int numberPersonal, String gmailPersonal, int hoursPersonal, double salaryPersonal, boolean statusPersonal) {
        this.idPersonal = idPersonal;
        this.namePersonal = namePersonal;
        this.numberPersonal = numberPersonal;
        this.gmailPersonal = gmailPersonal;
        this.hoursPersonal = hoursPersonal;
        this.salaryPersonal = salaryPersonal;
        this.statusPersonal = statusPersonal;
    }

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
