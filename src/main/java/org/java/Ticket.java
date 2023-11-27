package org.java;

public class Ticket {
	
	private double km;
    private int eta;

    public Ticket(double km, int eta) throws Exception {
        setKm(km);
        setEta(eta);
    }

    public double getKm() {
    	
        return km;
    }

    public void setKm(double km) throws Exception {
    	
        if (km < 0) {
        	
            throw new Exception("Il numero di km deve essere positivo");
        }
        
        this.km = km;
    }

    public int getEta() {
    	
        return eta;
    }

    public void setEta(int eta) throws Exception {
    	
        if (eta < 0) {
        	
            throw new Exception("L'età deve essere positiva");
        }
        
        this.eta = eta;
    }

    public double calcolaPrezzo() throws Exception {
    	
    	 if (km < 0 || eta < 0) {
    	        throw new Exception("Il numero di km e l'età devono essere positivi");
    	    }
    	
        double prezzoBase = km * 0.21;
        double sconto = 0;

        if (eta < 18) {
        	
            sconto = prezzoBase * 0.20;
        } else if (eta >= 65) {
            sconto = prezzoBase * 0.40;
        }

        return prezzoBase - sconto;
    }
	
}
