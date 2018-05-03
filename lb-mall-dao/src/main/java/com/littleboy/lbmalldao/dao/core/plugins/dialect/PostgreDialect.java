package com.littleboy.lbmalldao.dao.core.plugins.dialect;

/**
 * Postgre 数据库 方言
 * @author lwp
 *
 */
public class PostgreDialect extends Dialect {

	protected static final String SQL_END_DELIMITER = ";";

	@Override
	public String getLimitString(String sql, int offset, int limit) {
		return PostgrePageHepler.getLimitString(sql, offset, limit);
	}

	@Override
	public String getCountString(String sql) {
		return PostgrePageHepler.getCountString(sql);
	}
}
