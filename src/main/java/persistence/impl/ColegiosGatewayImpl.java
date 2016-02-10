package persistence.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import business.Jdbc;
import conf.Conf;
import exception.BusinessException;
import persistence.ColegiosGateway;

public class ColegiosGatewayImpl extends ConnectionGatewayImpl implements ColegiosGateway {

	@Override
	public Map<String, Object> getDatosColegio(String codigoColegio) throws BusinessException {
		try {
			pst = connection.prepareStatement(Conf.get("SQL_GET_DATOS_COLEGIO_BY_ID"));
			pst.setString(1, codigoColegio);
			ResultSet rs = pst.executeQuery();
			rs.next();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("direccion", rs.getString(1));
			map.put("ciudad", rs.getString(2));
			map.put("codigo", codigoColegio);
			return map;
		} catch (SQLException e) {
			throw new BusinessException(e);
		} finally {
			Jdbc.close(pst);

		}
	}

}
