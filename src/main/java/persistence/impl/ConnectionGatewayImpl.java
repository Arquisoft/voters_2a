package persistence.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import persistence.ConnectionGateway;

public abstract class ConnectionGatewayImpl implements ConnectionGateway {

	protected Connection connection;
	protected PreparedStatement pst;

	@Override
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
