package persistence;

import java.sql.Connection;

import exception.BusinessException;

public interface CensadosGateway {

	void setConnection(Connection connection);

	String getCodigoColegio(String usuario, String pass) throws BusinessException;

}
