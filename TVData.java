
public class TVData {
	public int OnOff;
	public int ChannelUpDown;
	public int VolumeUpDown;
	public int defaultchannel;
	public int defaultvolume;
	public int channel;
	public int volume;

	public TVData(int defaultchannel, int defaultvolume, int channel, int volume) {
		this.defaultchannel = defaultchannel;
		this.defaultvolume = defaultvolume;
		this.channel = channel;
		this.volume = volume;
	}
}