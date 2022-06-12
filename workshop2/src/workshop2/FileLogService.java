package workshop2;

public class FileLogService implements LogService {

	@Override
	public void log(String logMesage) {
		System.out.println("Dosyaya loglandý :" + logMesage);
		
	}
	

}
