package workshop2;

public class EmailLogService implements LogService {

	@Override
	public void log(String logMesage) {
		System.out.println("Email'e loglandý :" + logMesage);
	}

}
