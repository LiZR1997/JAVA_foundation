package java_dome09.dome01;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Blip2 implements Externalizable {
	

	 Blip2() {
		System.out.println("Blip2");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Blip2 writeExternal");
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Blip2 readExternal");
	}

}
