package dao;

import org.springframework.stereotype.Repository;
@Repository("dao")
public class DaoImpl implements IDao {

	@Override
	public double getData() {
	double data=98;
	return data;
}

public void init() {
		System.out.println("Instanciation de DaoImpl");
	}

}
