
public class AirConditioner {

	AirConditionerData data = new AirConditionerData(25, 0);

	public int getOnOff() {
		return data.OnOff;
	}

	public void setOnOff(int onOff) {
		data.OnOff = onOff;
	}

	public int getTempUpDown() {
		return data.TempUpDown;
	}

	public void setTempUpDown(int tempUpDown) {
		data.TempUpDown = tempUpDown;
	}

	
	
	
	public AirConditioner(int OnOff,int TempUpDown){
		this.data.OnOff=OnOff;
		this.data.TempUpDown=TempUpDown;
		
		
	}

	public void SetAc(AirConditioner AC){
		if(this.data.OnOff==1)
		{
			System.out.println("-- AC : ON --\n\n");
			
		}
	}
	public void SetTemp(AirConditioner AC){
		if(this.data.OnOff==0)
		{
			System.out.println("-- AC : Off --\n");
			System.out.println("**********************************************\n");
		}
		if(this.data.OnOff==1)
		{
			data.currenttemp=data.defaulttemp+this.getTempUpDown();
			System.out.println("-- AC temperature is : "+data.currenttemp+"\n\n");
			System.out.println("**********************************************\n");
		}
	}
		
}
