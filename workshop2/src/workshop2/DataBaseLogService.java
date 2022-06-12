package workshop2;

public class DataBaseLogService implements LogService{

	@Override
	public void log(String logMesage) {
		System.out.println("Veritabanýna loglandý"+logMesage);
		
		
	}
	

}
