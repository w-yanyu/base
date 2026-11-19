package cn.iyanyu.base.mq.config;

public class NameServerInfo {
    private boolean enabled = true;
    private String address;
    private String securityProtocol;
    private Boolean saslEnable = false;
    private String sslTruststoreLocation;
    private String sslTruststoreCertificates;
    private String sslTruststorePassword;
    private String sslTruststoreType;
    private String sslKeystoreLocation;
    private String sslKeystoreCertificateChain;
    private String sslKeystoreType;
    private String sslKeystorePassword;
    private String sslKeystoreKey;
    private String sslKeyPassword;
    private Boolean sslEnable = false;
    private String saslMechanism;
    private String saslJaasConfig;

    public NameServerInfo() {
    }

    public NameServerInfo(boolean enabled, String address) {
        this.enabled = enabled;
        this.address = address;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSslTruststoreCertificates() {
        return this.sslTruststoreCertificates;
    }

    public void setSslTruststoreCertificates(String sslTruststoreCertificates) {
        this.sslTruststoreCertificates = sslTruststoreCertificates;
    }

    public String getSslTruststoreLocation() {
        return this.sslTruststoreLocation;
    }

    public void setSslTruststoreLocation(String sslTruststoreLocation) {
        this.sslTruststoreLocation = sslTruststoreLocation;
    }

    public String getSslTruststorePassword() {
        return this.sslTruststorePassword;
    }

    public void setSslTruststorePassword(String sslTruststorePassword) {
        this.sslTruststorePassword = sslTruststorePassword;
    }

    public String getSslKeystoreLocation() {
        return this.sslKeystoreLocation;
    }

    public void setSslKeystoreLocation(String sslKeystoreLocation) {
        this.sslKeystoreLocation = sslKeystoreLocation;
    }

    public String getSslKeystorePassword() {
        return this.sslKeystorePassword;
    }

    public void setSslKeystorePassword(String sslKeystorePassword) {
        this.sslKeystorePassword = sslKeystorePassword;
    }

    public String getSaslMechanism() {
        return this.saslMechanism;
    }

    public void setSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
    }

    public String getSecurityProtocol() {
        return this.securityProtocol;
    }

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    public Boolean getSslEnable() {
        return this.sslEnable;
    }

    public void setSslEnable(Boolean sslEnable) {
        this.sslEnable = sslEnable;
    }

    public Boolean getSaslEnable() {
        return this.saslEnable;
    }

    public void setSaslEnable(Boolean saslEnable) {
        this.saslEnable = saslEnable;
    }

    public String getSaslJaasConfig() {
        return this.saslJaasConfig;
    }

    public void setSaslJaasConfig(String saslJaasConfig) {
        this.saslJaasConfig = saslJaasConfig;
    }

    public String getSslKeyPassword() {
        return this.sslKeyPassword;
    }

    public void setSslKeyPassword(String sslKeyPassword) {
        this.sslKeyPassword = sslKeyPassword;
    }

    public String getSslTruststoreType() {
        return this.sslTruststoreType;
    }

    public void setSslTruststoreType(String sslTruststoreType) {
        this.sslTruststoreType = sslTruststoreType;
    }

    public String getSslKeystoreCertificateChain() {
        return this.sslKeystoreCertificateChain;
    }

    public void setSslKeystoreCertificateChain(String sslKeystoreCertificateChain) {
        this.sslKeystoreCertificateChain = sslKeystoreCertificateChain;
    }

    public String getSslKeystoreType() {
        return this.sslKeystoreType;
    }

    public void setSslKeystoreType(String sslKeystoreType) {
        this.sslKeystoreType = sslKeystoreType;
    }

    public String getSslKeystoreKey() {
        return this.sslKeystoreKey;
    }

    public void setSslKeystoreKey(String sslKeystoreKey) {
        this.sslKeystoreKey = sslKeystoreKey;
    }
}
