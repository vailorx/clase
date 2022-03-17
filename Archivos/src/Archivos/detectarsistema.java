package Archivos;

public class detectarsistema {
	public static void main(String[] args) {
		System.out.println(getOperatingSystem());
	}
	public static String getOperatingSystem() {
		String os = System.getProperty("os.name");
		// Sysout("Using System property: " + os );
		return os;
		
	}
	}


