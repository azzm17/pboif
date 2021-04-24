/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang2d;

/**
 *
 * @author User
 */
public class Lingkaran implements bidang2dimensi {
    private double jarijari;
    private double keliling;
    private double luas;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }
    @Override
    public double hitungLuas() {
        return this.jarijari*this.jarijari*Math.PI;
    }
    @Override   
    public double hitungKeliling() {
        return Math.PI*this.jarijari*2;
    }
}
