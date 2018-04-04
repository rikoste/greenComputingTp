package tp.greenComputing.Classes;

import java.util.List;

public class App {

	private String nomApp;
	private double consoApp;
	private boolean useInternet;
	private boolean useBleuthoot;
	private int luminosite;
	private int dureeMin;
	
	public App() {
	}
	
	public App(String nomApp, double consoApp, boolean useInternet, boolean useBleuthoot, int luminosite, int dureeMin) {
		this.setNomApp(nomApp);
		this.setConsoApp(consoApp);
		this.setUseInternet(useInternet);
		this.setUseBleuthoot(useBleuthoot);
		this.setLuminosite(luminosite);
		this.setDureeMin(dureeMin);
	}

	public String getNomApp() {
		return nomApp;
	}

	public void setNomApp(String nomApp) {
		this.nomApp = nomApp;
	}

	public double getConsoApp() {
		return consoApp;
	}

	public void setConsoApp(double consoApp) {
		this.consoApp = consoApp;
	}

	public boolean isUseInternet() {
		return useInternet;
	}

	public void setUseInternet(boolean useInternet) {
		this.useInternet = useInternet;
	}

	public boolean isUseBleuthoot() {
		return useBleuthoot;
	}

	public void setUseBleuthoot(boolean useBleuthoot) {
		this.useBleuthoot = useBleuthoot;
	}

	public int getLuminosite() {
		return luminosite;
	}

	public void setLuminosite(int luminosite) {
		this.luminosite = luminosite;
	}

	public int getDureeMin() {
		return dureeMin;
	}

	public void setDureeMin(int dureeMin) {
		this.dureeMin = dureeMin;
	}
		
	
	@Override
	public String toString() {
		return "App [nomApp=" + nomApp + ", consoApp=" + consoApp + ", useInternet=" + useInternet + ", useBleuthoot="
				+ useBleuthoot + ", luminosite=" + luminosite + ", dureeMin=" + dureeMin + "]";
	}
	
}
