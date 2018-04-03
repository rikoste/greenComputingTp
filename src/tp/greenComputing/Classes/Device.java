package tp.greenComputing.Classes;

public class Device {

	private boolean wifi;
	private boolean bleuthoot;
	private boolean donneesMobile;
	private int luminsoite;
	private int batterie;
	
	public Device() {
		this.wifi=false;
		this.bleuthoot=false;
		this.donneesMobile=false;
		this.luminsoite=0;
		this.batterie=0;		
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
				+ ", luminsoite=" + luminsoite + ", batterie=" + batterie + "]";
	}
	
	

	
	
}
