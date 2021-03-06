/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atomx;

/**
 *
 * @author yann
 */
public class Deviateur extends Obstacle{
    private int rotations;
    public Deviateur(int pMax){
        super(pMax);
        this.nom = "D";
        this.p = null;
        this.rotations = (int)(1+(2 * Math.random()));
        if (Jeu.getJeuCourant().isDebug()){
            this.rotations = 2;
        }
    }
    
    @Override
    public void action(Particule p){
        p.setDir(p.getDir().getRotation(rotations));
        if (Jeu.getJeuCourant().isDebug()){
            System.out.println("Deviation");
            System.out.println("==> "+rotations+" tours, direction:"+p.getDir());
        }
    }

    @Override
    public String toString() {
        return "Deviateur{"+super.toString()+ "rotations=" + rotations + '}';
    }
}
