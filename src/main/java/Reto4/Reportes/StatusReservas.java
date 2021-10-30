/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto4.Reportes;

/**
 *
 * @author Alex Mosquera
 */
public class StatusReservas {
    private int completed;
    private int canceled;

    public StatusReservas(int completed, int canceled) {
        this.completed = completed;
        this.canceled = canceled;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public int getCanceled() {
        return canceled;
    }

    public void setCanceled(int canceled) {
        this.canceled = canceled;
    }
       
}
