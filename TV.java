
public class TV {

	TVData data = new TVData(60, 20, 0, 0);

public int getOnOff() {
	return data.OnOff;
}
public void setOnOff(int onOff) {
	data.OnOff = onOff;
}
public int getChannelUpDown() {
	return data.ChannelUpDown;
}

public void setChannelUpDown(int channelUpDown) {
	data.ChannelUpDown = channelUpDown;
}
public int getVolumeUpDown() {
	return data.VolumeUpDown;
}

public void setVolumeUpDown(int volumeUpDown) {
	data.VolumeUpDown = volumeUpDown;
}










public TV(int OnOff,int ChannelUpDown,int VolumeUpDown){

	this.data.OnOff=OnOff;
	this.data.ChannelUpDown=ChannelUpDown;
	this.data.VolumeUpDown=VolumeUpDown;
	
}


public void SetTv(TV tv)
{
	if(this.data.OnOff==1)
	{
		System.out.println("**** Control various Home Appliences ****\n\n");
		System.out.println("-- TV : ON --");
	}
	else
	{
		System.out.println("-- TV : OFF --");
	}
}

public void SetChannel(TV tv)
{

	if(this.data.OnOff==0)
	{
		System.out.println("-- TV : OFF --\n");
	}
	else
	{
		data.channel=this.getChannelUpDown()+data.defaultchannel;
		System.out.println("-- You are on channel No.: "+data.channel);
	}
}

public void SetVolume(TV tv)
{

	if(this.data.OnOff==0)
	{
		System.out.println("-- TV : OFF --\n");
	}
	else
	{
		data.volume=this.getVolumeUpDown()+data.defaultvolume;
		System.out.println("-- Volume of TV is: "+data.volume);
	}
}

	
}
