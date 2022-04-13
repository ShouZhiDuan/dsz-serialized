package com.serialized;

import com.nvxclouds.medusaskadicommon.proto.Base;
import com.nvxclouds.medusaskadicommon.proto.DataNodeActivation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class DszSerializedBakApplicationTests {

    @Autowired
    RestTemplate restTemplate;

    private final static String URL = "http://192.168.50.177:11443/v2/datanode/activation";

    @Test
    void callMedusa() {
        DataNodeActivation.DataNodeActivationRequestDTO.Builder builder = DataNodeActivation.DataNodeActivationRequestDTO.newBuilder();
        DataNodeActivation.DataNodeActivationRequestDTO requestDTO = builder.setHardwareSignature("test").setDataNodeName("test node name").setUrl("http://192.168.50.180:8080/").build();
        Base.Result rest = restTemplate.postForObject(URL, requestDTO, Base.Result.class, (Object) null);
        System.out.println(rest);
    }

}
