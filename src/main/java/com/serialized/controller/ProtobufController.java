package com.serialized.controller;

import com.serialized.model.OrderProto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShouZhi@Duan
 * @Date: 2022/4/6 12:47
 * @Description: Protobuf测试
 */
@RestController
@RequestMapping("/proto")
public class ProtobufController {

    @PostMapping(value = "/test", produces = "application/x-protobuf")
    public OrderProto.Order test(@RequestBody OrderProto.Order order){
      OrderProto.Order.Builder builder = order.toBuilder();
      builder.setAddr("666" + order.getAddr());
      builder.setName("888" + order.getName());
      return builder.build();
    }


}
