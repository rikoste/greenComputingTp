package tp.greenComputing.Classes;

import java.awt.List;
import java.util.ArrayList;

public class Device {

	private boolean wifi;
	private boolean bleuthoot;
	private boolean donneesMobile;
	private int luminsoite;
	private int batterie;
	private double consoWifi;
	private double consoBlouthoot;
	private double consoDonnesMobile;
	private double consoLuminosite;
	
	
	private ArrayList<App> apps = new ArrayList<App>();
	
	
	public Device() {
		this.wifi=false;
		this.bleuthoot=false;
		this.donneesMobile=false;
		this.luminsoite=100;
		this.batterie=100;
		this.consoWifi=0.3;
		this.consoBlouthoot=0.1;
		this.consoDonnesMobile=0.3;
		this.consoLuminosite=0.4;
		
		// Ajout des apps dans la liste
		initApp();
	}
	
	
	
	public boolean ifInternetUsed(String composant) {
		
		for (App app : this.apps) {
		     if(composant.equals("internet")) {
		    	 if(app.isUseBleuthoot()==true) {
		    		 return true;
		    	 }
		     }
		} 			
		return false;
	}
	

	public boolean ifBleuthootUsed(String composant) {
		
		for (App app : this.apps) {
		     if(composant.equals("bleuthoot")) {
		    	 if(app.isUseBleuthoot()==true) {
		    		 return true;
		    	 }
		     }
		} 			
		return false;
	}
	
	
	
	
	

	public void initApp() {
		App facebook = new App("FaceBook", 0.15, true, false, 30, 15);
		App chrome = new App("Google Chrome", 0.17, true, false, 30, 15);
		App whatsapp = new App("WhatsApp", 0.17, true, false, 25, 10);
		App twitter = new App("Twitter", 0.16, true, false, 25, 15);
		App instagram = new App("Instagram", 0.16, true, false, 30, 15);
		
		this.apps.add(facebook);
		this.apps.add(chrome);
		this.apps.add(whatsapp);
		this.apps.add(twitter);
		this.apps.add(instagram);
	}
	
	public App getAppByName(String nomApp) {
		
		for (App app : this.apps) {
		     if(app.getNomApp().equals(nomApp)) {
		    	 return app;
		    }
		}
				
		return null;
	}
	
	
	
	public double getConsoWifi() {
		return consoWifi;
	}



	public void setConsoWifi(double consoWifi) {
		this.consoWifi = consoWifi;
	}



	public double getConsoBlouthoot() {
		return consoBlouthoot;
	}



	public void setConsoBlouthoot(double consoBlouthoot) {
		this.consoBlouthoot = consoBlouthoot;
	}



	public double getConsoDonnesMobile() {
		return consoDonnesMobile;
	}



	public void setConsoDonnesMobile(double consoDonnesMobile) {
		this.consoDonnesMobile = consoDonnesMobile;
	}



	public double getConsoLuminosite() {
		return consoLuminosite;
	}



	public void setConsoLuminosite(double consoLuminosite) {
		this.consoLuminosite = consoLuminosite;
	}



	public ArrayList<App> getApps() {
		return apps;
	}



	public void setApps(ArrayList<App> apps) {
		this.apps = apps;
	}



	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public boolean isBleuthoot() {
		return bleuthoot;
	}

	public void setBleuthoot(boolean bleuthoot) {
		this.bleuthoot = bleuthoot;
	}

	public boolean isDonneesMobile() {
		return donneesMobile;
	}

	public void setDonneesMobile(boolean donneesMobile) {
		this.donneesMobile = donneesMobile;
	}

	public int getLuminsoite() {
		return luminsoite;
	}

	public void setLuminsoite(int luminsoite) {
		this.luminsoite = luminsoite;
	}

	public int getBatterie() {
		return batterie;
	}

	public void setBatterie(int batterie) {
		this.batterie = batterie;
	}



	@Override
	public String toString() {
		return "Device [wifi=" + wifi + ", bleuthoot=" + bleuthoot + ", donneesMobile=" + donneesMobile
				+ ", luminsoite=" + luminsoite + ", batterie=" + batterie + ", consoWifi=" + consoWifi
				+ ", consoBlouthoot=" + consoBlouthoot + ", consoDonnesMobile=" + consoDonnesMobile
				+ ", consoLuminosite=" + consoLuminosite + ", apps=" + apps + "]";
	}

	
	
	

	
	
}
