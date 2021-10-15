package chapter7;

public class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100 ;
	final int MIN_CHANNEL = 0;
	
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {	
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		
		if(MIN_CHANNEL > channel || channel > MAX_CHANNEL) {
				return;
		}else {
				prevChannel = this.channel;
				this.channel = channel;
		}
	
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		
		if(MIN_VOLUME > volume || volume > MAX_VOLUME) {
			return;
		}else {
			this.volume = volume;
		}	
	}
	
	public void goToPrevChannel() {
		setChannel(prevChannel);
	}
	
	
}
