import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HASTest {

	@Test
	void test() {
		
		 TV tv =new TV(1,1,1);  // 0=OFF and 1=On TV is on channel and volume set to up i.e 1
		 tv.SetTv(tv);
		 tv.SetChannel(tv);
		 tv.SetVolume(tv);
		
		 HomeLight light= new HomeLight(1);
		 light.setLight(light);
		 
		 Fan fan= new Fan(0);
		 fan.setFan(fan);
		 
		 WashingMachine WM =new WashingMachine(1,1); //0=OFF 1=On Washing machine is on and it set to Rinse
		 WM.SetWM(WM);
		 WM.Wash(WM);
		 
		 AirConditioner AC=new AirConditioner(0,1); // 0=OFF 1=ON  AC is On and temperature up by 1
		 AC.SetAc(AC);
		 AC.SetTemp(AC);
		 
		
	}

}
