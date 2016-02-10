package persistence;

import java.sql.Connection;
import java.util.Map;

import exception.BusinessException;

public interface ColegiosGateway {

	void setConnection(Connection connection);

	Map<String, Object> getDatosColegio(String codigoColegio) throws BusinessException;

}
