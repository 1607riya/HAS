
public class Fan {

int OnOff;
	
	
	
	public int getOnOff() {
		return OnOff;
	}



	public void setOnOff(int onOff) {
		OnOff = onOff;
	}



	public Fan(int OnOff){
		this.OnOff=OnOff;
	}
		
	
	
	public void setFan(Fan fan)
	{
		if(this.OnOff==1)
		{
			System.out.println("-- Fan : ON --\n\n");
		}
		else
		{
			System.out.println("-- Fan : OFF --\n\n");
		}
	}

}
