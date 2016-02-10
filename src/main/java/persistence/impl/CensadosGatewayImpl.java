package persistence.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import business.Jdbc;
import conf.Conf;
import exception.BusinessException;
import persistence.CensadosGateway;

public class CensadosGatewayImpl extends ConnectionGatewayImpl implements CensadosGateway {

	@Override
	public String getCodigoColegio(String usuario, String pass) throws BusinessException {
		try {
			pst = connection.prepareStatement(Conf.get("SQL_GET_CODIGO_COLEGIO_POR_USUARIO_Y_PASS"));
			pst.setString(1, usuario);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			rs.next();
			return rs.getString(1);
		} catch (SQLException exception) {
			throw new BusinessException(exception);
		} finally {
			Jdbc.close(pst);
		}
	}

}
