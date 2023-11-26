
package com.mycompany.pelicula.view.model.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.pool.OracleDataSource;
import oracle.jdbc.OracleConnection;
import java.sql.DatabaseMetaData;
import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

public class DataSourceSample {  
    
    private Connection conn;
    
    public Connection getConn(){
        return conn;
    }
    
    public void setConn (Connection conn){
        this.conn = conn;
    }

   public void crearConexion() throws SQLException {
    // Conexion a base de datos ORACLE 
        final String DB_URL = "jdbc:oracle:thin:@javierita2_high?TNS_ADMIN=./Wallet_Javierita2";
        //final String DB_URL = "jdbc:oracle:thin:@(description= (retry_count=20)(retry_delay=3)(address=(protocol=tcps)(port=1521)(host=adb.sa-santiago-1.oraclecloud.com))(connect_data=(service_name=geb6679ab67d074_pgy2121_medium.adb.oraclecloud.com))(security=(ssl_server_dn_match=yes)))";
        // Update the Database Username and Password to point to your Autonomous Database
        final String DB_USER = "Admin";
        String DB_PASSWORD = "Pruebaprogra1";
        final String CONN_FACTORY_CLASS_NAME = "oracle.jdbc.pool.OracleDataSource";

        PoolDataSource pds = PoolDataSourceFactory.getPoolDataSource();

        // Set the connection factory first before all other properties
        pds.setConnectionFactoryClassName(CONN_FACTORY_CLASS_NAME);
        pds.setURL(DB_URL);
        pds.setUser(DB_USER);
        pds.setPassword(DB_PASSWORD);
        pds.setConnectionPoolName("JDBC_UCP_POOL");

        pds.setInitialPoolSize(5);

        pds.setMinPoolSize(5);

        pds.setMaxPoolSize(20);

        try{
        // Get the database connection from UCP.
        this.conn = pds.getConnection();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Available connections after checkout: "
                + pds.getAvailableConnectionsCount());
        System.out.println("Borrowed connections after checkout: "
                + pds.getBorrowedConnectionsCount());
        // Perform a database operation

        System.out.println("CONEXION EXITOSA");
        // System.out.println("CONECTADO al schema: " + conn.getSchema());

        

    }

}

  