package com.onectrm.akshare.api;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class AkShareRequestAndResponse {
    @JsonIgnore
    private String interfaceName;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }
}
