package lavin.order_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Order {
    @Id
    private String id;
    private Integer userId;
    private List<Item> items;
}
