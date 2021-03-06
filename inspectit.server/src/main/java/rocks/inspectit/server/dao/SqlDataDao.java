package rocks.inspectit.server.dao;

import java.util.Date;
import java.util.List;

import rocks.inspectit.shared.all.communication.data.SqlStatementData;

/**
 * @author Patrice Bouillet
 * 
 */
public interface SqlDataDao {

	/**
	 * Returns a list of the SQL statements for a given template. In the template, only the platform
	 * id is extracted. If the template holds the SQL query string, only objects with this query
	 * string will be returned.
	 * 
	 * @param sqlStatementData
	 *            The template containing the platform id.
	 * @return The list of the SQL statements.
	 */
	List<SqlStatementData> getAggregatedSqlStatements(SqlStatementData sqlStatementData);

	/**
	 * Returns a list of the SQL statements for a given template in a time frame. In the template,
	 * only the platform id is extracted. If the template holds the SQL query string, only objects
	 * with this query string will be returned.
	 * 
	 * @param sqlStatementData
	 *            The template containing the platform id.
	 * @param fromDate
	 *            Date to include data from.
	 * @param toDate
	 *            Date to include data to.
	 * @return The list of the SQL statements.
	 */
	List<SqlStatementData> getAggregatedSqlStatements(SqlStatementData sqlStatementData, Date fromDate, Date toDate);

	/**
	 * Returns a list of the SQL statements for a given template aggregated by the parameters. In
	 * the template, only the platform id is extracted. If the template holds the SQL query string,
	 * only objects with this query string will be returned.
	 * 
	 * @param sqlStatementData
	 *            The template containing the platform id.
	 * @return The list of the SQL statements.
	 */
	List<SqlStatementData> getParameterAggregatedSqlStatements(SqlStatementData sqlStatementData);

	/**
	 * Returns a list of the SQL statements for a given template in a time frame aggregated by the
	 * parameters. In the template, only the platform id is extracted. If the template holds the SQL
	 * query string, only objects with this query string will be returned.
	 * 
	 * @param sqlStatementData
	 *            The template containing the platform id.
	 * @param fromDate
	 *            Date to include data from.
	 * @param toDate
	 *            Date to include data to.
	 * @return The list of the SQL statements.
	 */
	List<SqlStatementData> getParameterAggregatedSqlStatements(SqlStatementData sqlStatementData, Date fromDate, Date toDate);

}
