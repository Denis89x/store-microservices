package dev.lebenkov.inventoryservice.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InventoryResponse {
    String skuCode;
    boolean isInStock;
}
