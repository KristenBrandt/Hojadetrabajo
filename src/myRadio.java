
public class myRadio implements iRadio {
	public double AM = 530;
	public double FM = 87.9;
	public boolean isOn = false;
	public boolean isAM = false;
	public int position = 0;
	public double [] fav = new double [12];
	
	public boolean getIsOn() {
		return isOn;
	}
	
	public boolean getIsAM() {
		return isAM;
	}
	
	public double getAM() {
		return AM;
	}
	
	public double getFM() {
		return FM;
	}
	
	public int getPosition() {
		return position;
	}
	
	public boolean encendidoRadio() {
		boolean actualState = getIsOn();
		if(actualState==true) {
			actualState = false;
			isOn=actualState;
		}else {
			actualState = true;
			isOn=actualState;
		}
		return actualState;
	}
	public boolean cambiarAmFm() {
		boolean actualStation = getIsAM();
		if(actualStation==true) {
			actualStation = false;
			isAM=actualStation;
		}
		else {
			actualStation = true;
			isAM=actualStation;
		}
		return actualStation;
	}
	public double subirFrecuencia() {
		boolean actualStation = getIsAM();
		double stationInAM = getAM();
		double stationInFM = getFM();
		if(actualStation==true) {
			if(stationInAM<1610) {
				stationInAM=stationInAM+10;
				AM=stationInAM;
				return stationInAM;
			}else {
				stationInAM=530;
				AM=stationInAM;
				return stationInAM;
			}
		}else {
			if(stationInFM<107.9) {
				stationInFM=stationInFM+0.2;
				FM=stationInFM;
				return stationInFM;
			}else {
				stationInFM=87.9;
				FM=stationInFM;
				return stationInFM;
			}
		}
	}
	public double bajarFrecuencia() {
		boolean actualStation = getIsAM();
		double stationInAM = getAM();
		double stationInFM = getFM();
		if(actualStation==true) {
			if(stationInAM>530) {
				stationInAM=stationInAM-10;
				AM=stationInAM;
				return stationInAM;
			}else {
				stationInAM=1610;
				AM=stationInAM;
				return stationInAM;
			}
		}else {
			if(stationInFM>87.9) {
				stationInFM=stationInFM-0.2;
				FM=stationInFM;
				return stationInFM;
			}else {
				stationInFM=107.9;
				FM=stationInFM;
				return stationInFM;
			}
		}
	}
	public void setFavorito(int posicion) {
		boolean actualStation = getIsAM();
		double stationInAM = getAM();
		double stationInFM = getFM();
		if(actualStation==true) {
			fav[posicion-1]=stationInAM;
		}else {
			fav[posicion-1]=stationInFM;
		}
	}
	public double getFavorito(int posicion) {
		boolean actualStation = getIsAM();
		double stationInAM = getAM();
		double stationInFM = getFM();
		if(actualStation==true) {
			if(fav[posicion-1]>=530 && fav[posicion-1]<=1610) {
				stationInAM=fav[posicion-1];
				AM=stationInAM;
				return stationInAM;
			}else {
				actualStation=false;
				stationInFM=fav[posicion-1];
				FM=stationInFM;
				return stationInFM;
			}
			
		}else {
			if (fav[posicion-1]>=87.9 && fav[posicion-1]<=107.9) {
				stationInFM=fav[posicion-1];
				FM=stationInFM;
				return stationInFM;
			}else {
				actualStation=true;
				stationInAM=fav[posicion-1];
				AM=stationInAM;
				return stationInAM;
			}
		}
	}
}