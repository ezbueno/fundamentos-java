package modulo13.exercicios2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public interface Recordable {

	public void read(DataInputStream in) throws IOException;

	public void write(DataOutputStream out) throws IOException;
}
