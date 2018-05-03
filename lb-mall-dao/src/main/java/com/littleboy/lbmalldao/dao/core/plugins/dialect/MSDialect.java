package com.littleboy.lbmalldao.dao.core.plugins.dialect;

/**
 * 
 * @author lwp
 *
 */
public class MSDialect extends Dialect {

	protected static final String SQL_END_DELIMITER = ";";

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		return MSPageHepler.getLimitString(sql, offset, limit);
	}

	@Override
	public String getCountString(String sql) {
		return MSPageHepler.getCountString(sql);
	}
}
