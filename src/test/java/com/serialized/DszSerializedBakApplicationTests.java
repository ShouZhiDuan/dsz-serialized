package com.serialized;

import com.serialized.model.OrderProto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DszSerializedBakApplicationTests {


    @Test
    void protoTest() {
        OrderProto.Order.Builder builder = OrderProto.Order.newBuilder().setAddr("tes addr ").setName("test proto name");

    }

}
