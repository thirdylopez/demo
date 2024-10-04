package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class VoucherItem {
        private String code = null;

        private Float discount = null;

        private LocalDate expiry = null;

        private String errorMessage;
}
