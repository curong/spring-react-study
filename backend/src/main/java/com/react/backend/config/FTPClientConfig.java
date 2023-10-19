package com.react.backend.config;

import org.apache.commons.net.ftp.FTPClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class FTPClientConfig
{

    @Value("${ftp.server.host}")
    private String hostServerIp;

    @Value("${ftp.server.port}")
    private int    hostFtpPort;

    @Value("${ftp.server.username}")
    private String hostName;

    @Value("${ftp.server.password}")
    private String hostPw;

    @Bean
    @Scope("prototype")
    public FTPClient creaFtpClient()
    {
        FTPClient ftpClient = new FTPClient();
        try
        {
            ftpClient.connect(hostServerIp , hostFtpPort );
            ftpClient.login  (hostName     , hostPw      );
            ftpClient.setControlEncoding("UTF-8");
            ftpClient.enterLocalPassiveMode();

            return ftpClient;
        }

        catch (Exception e)
        { throw new RuntimeException("CREATE FTP CLIENT ERROR : "+e.getLocalizedMessage());}

    }

}