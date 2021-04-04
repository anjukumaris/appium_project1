package tutorial;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class DesiredCap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("src");
		File file=new File(f,"")
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator1");
		

	}

}