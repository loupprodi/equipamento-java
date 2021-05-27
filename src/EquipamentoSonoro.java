
public class EquipamentoSonoro extends Equipamento {
	
	
	private short volume;  
	private boolean stereo;  
	  
	public short getVolume() {  
	    return volume;  
	}  

	public void setVolume(short volume) {  
	    this.volume = volume;  
	}  
	      
	  
	public void mono(boolean falso){  
	    stereo = falso;  
	      
	}  
	public void stereo(){  
	    stereo = true;
	      
	      
	}  
	      
	public boolean liga(){    
	    setVolume((short) 5);
	    return super.liga();      
	}  

}
