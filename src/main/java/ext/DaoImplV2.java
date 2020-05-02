package ext;

import org.springframework.stereotype.Repository;

import dao.IDao;

@Repository("ext")
public class DaoImplV2 implements IDao {

	@Override
	public double getData() {

		System.out.println("Version WS");
		double data = 12;
		return data;

	}

}
