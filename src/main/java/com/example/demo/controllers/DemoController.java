package com.example.demo.controllers;


import com.example.demo.model.VoucherItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
@RestController
public class DemoController {

    public static final String PATH = "/api/demo/voucher/{voucherCode}&key={apiKey}";

    @GetMapping(value = PATH)
    public VoucherItem demo(@PathVariable("voucherCode") String voucherCode , @PathVariable("apiKey") String apiKey) throws InterruptedException {
//        Thread.sleep(15000);
        System.out.println("Request Call var voucher code = "+ voucherCode + " key = " + apiKey);
        VoucherItem voucherItem = VoucherItem.builder()
                .code("ABC")
                .discount(10f)
                .expiry(LocalDate.of(2025, 12, 10))
                .build();

//        VoucherItem voucherItem = VoucherItem.builder().errorMessage("Error Test").build();

        return voucherItem;
    }
}
