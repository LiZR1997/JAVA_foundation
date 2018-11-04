package java_dome10.dome01;

public abstract class IntGenerator {
	private volatile boolean canceled = false;
	public abstract int next();
	public void cancel() { canceled = true; }
	public void cancel1() { canceled = false; }
	public boolean isCanceled() {
		return canceled;
	}
}
