package tp.greenComputing.Application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import tp.greenComputing.Classes.App;
import tp.greenComputing.Classes.Device;


public class Main {
	static Device D = new Device();
	public static void Tr()
	{
		double tr = D.getBatterie() / consommation();
		if(tr<60)
		{
			System.out.println("Le temps restant  :" + tr +"secondes");
		}
		else if(tr>60 && tr <3599)
		{
			System.out.println("Le temps restant  :" + tr/60 +"minutes");
		}
		else
			System.out.println("Le temps restant  :" + tr/(60*60) +"Heures");
	}
	public static double consommation()
	{
		double conso = D.getSommeConso() + D.getConsoBlouthoot()+D.getConsoDonnesMobile() + D.getConsoWifi() + D.getConsoWifi()+D.getConsoLuminosite();
		return conso;
	}
	public static void deduir(long d)
	{
		Long duree = (long) ((System.currentTimeMillis() - d)/1000F);
		System.out.println("teeeeeeeeeemp"+duree);
		double ded = duree * consommation();
		D.setBatterie(ded);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		long dateD = System.currentTimeMillis();
		long dateDebut = System.currentTimeMillis();
			 Scanner sc= new Scanner(System.in);
			while(D.getBatterie() > 10) {
				int Val;
				System.out.println("Niveau de Batterie : " + D.getBatterie() +"%" );
				System.out.println("consommation par seconde :" + consommation());
				Tr();
				System.out.println("1- Ouvrire applicaiton");
				System.out.println("2- Fermer applicaiton");
				System.out.println("3- Gestion composants");
				System.out.println("4- Details");
				Val = sc.nextInt();
				switch(Val) {
				   case 1 :
				      
				      break; // optional
				   
				   case 2 :
					   int i = 0;
						for (App app : D.appsencours) {
						     System.out.println(i + " - " +  app.getNomApp());
						} 	
						int vals = sc.nextInt();
					 deduir(dateDebut);
					 dateDebut = System.currentTimeMillis();
						
						App P = D.appsencours.get(vals);
						D.appsencours.remove(vals);
						if(P.isUseBleuthoot())
						{
							if(D.ifBleuthootUsed() == false)
							{
								D.setBleuthoot(false);
							}
								
						}
						if(P.isUseInternet())
						{
							if(D.ifInternetUsed() == false)
							if(D.isDonneesMobile() || D.isWifi())
							{
								D.setDonneesMobile(false);
								D.setWifi(false);
							}
						}
					    
				      // Statements
				      break; // optional
				   case 3 :
					      System.out.println("1- Wifi  : "+D.isWifi());
					      System.out.println("2- Bluetooth  : "+D.isBleuthoot());
					      System.out.println("3- Données mobile  : "+D.isDonneesMobile());
					      System.out.println("4- Luminosité  : "+D.getLuminsoite());
					      int valc = sc.nextInt();
					      deduir(dateDebut);
							 dateDebut = System.currentTimeMillis();
					      switch(valc) {
					      case 1:
					    	  if(D.isWifi())
						    	  D.setWifi(false);
						      else
						    	  D.setWifi(true);
					    	  break;
					      case 2:
					    	if(D.isBleuthoot())
					    		D.setBleuthoot(false);
					    	else
					    		D.setBleuthoot(true);;
					    	  break;
					      case 3:
					    	  if(D.isDonneesMobile())
							    	D.setDonneesMobile(false);
							    else
							    	D.setDonneesMobile(true);
					    	  break;
					      case 4:
					    	  System.out.println("veuillez entrer votre luminosité");
					    	  int lum = sc.nextInt();
					    	  D.setLuminsoite(lum);
					    	  break;
					      }
					      
					      
					      break;
				   case 4 :
					      System.out.println(D.toString());
					      System.out.println("conso " + consommation());
					      break;
				   // You can have any number of case statements.
				   default : // Optional
				      // Statements
				}
			
			}
	}

}

